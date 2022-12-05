package servlet.exam13;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Board;
import service.BoardService;
import util.Pager;

@WebServlet(name = "exam13.DetailViewController", urlPatterns = "/exam13/DetailViewController")
public class DetailViewController extends HttpServlet {
	// 클라이언트가 요청할 때 마다 실행
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//bno 얻기
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		//BoardService 얻기
		BoardService boardService = (BoardService) request.getServletContext().getAttribute("boardService");
		
		//Board 객체 얻기
		Board board = boardService.getBoard(bno);
		
		request.setAttribute("board", board);

		request.getRequestDispatcher("/WEB-INF/views/exam13/detailView.jsp").forward(request, response);
	}
}
