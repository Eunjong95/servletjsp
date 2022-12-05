package servlet.exam13;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Board;
import service.BoardService;

@WebServlet(name = "exam13.DownloadAttachController", urlPatterns = "/exam13/DownloadAttachController")
public class DownloadAttachController extends HttpServlet {
	// 클라이언트가 요청할 때 마다 실행
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//bno 얻기
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		//BoardService 얻기
		BoardService boardService = (BoardService) request.getServletContext().getAttribute("boardService");
		
		//Board 객체 얻기
		Board board = boardService.getBoard(bno);
		
		String fileName = board.getBfileName();
		String filePath = "C:/temp/download/" + board.getBsavedName();
		String contentType = board.getBfileType();
		
		//HTTP 응답에 Content-Type 헤더를 추가
		response.setContentType(contentType);
		
		//Browser의 종류 얻기
		String userAgent = request.getHeader("User-Agent");
		if(userAgent.contains("Trident")|| userAgent.contains("MSIE") ) {
			//Internet Explorer일 경우
			fileName = URLEncoder.encode(fileName, "UTF-8");
		} else {
			//Chrome, Edge, FireFox, Safari일 경우
			fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
		}	
		System.out.println(fileName);
		
		//HTTP 응답에 Content-Disposition 헤더를 추가
		response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
		
		//HTTP 응답 본문에 파일 데이터 출력하기 -> 응답을 여기서 만들어서 jsp로 갈 필요 없음
		ServletOutputStream sos = response.getOutputStream();

		Path path = Paths.get(filePath);		
		Files.copy(path, sos);
		sos.flush();
		sos.close();
	}
}
