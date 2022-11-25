package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Board;

@WebServlet("/Exam01Controller")
public class Exam01Controller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//처리 결과 생성
		List<Board> boards = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			Board board = new Board();
			board.setBno(i);
			board.setBtitle("제목" + i);
			board.setBcontent("내용" + i);
			board.setBwriter("홍길동");
			board.setBdate(new Date());
			boards.add(board);
		}
		//"list"라는 이름으로 boards 값을 저장해놓으면 밑의 getRequest~코드에서 쓸 수 있음 
		//처리결과를 JSP에서 사용할 수 있도록 설정
		//"list"라는 이름은 exam01_view의 item의 값이 됨
		request.setAttribute("list", boards); 
		
		//JSP로 이동
		request.getRequestDispatcher("views/exam01_view.jsp").forward(request, response);
	}
}
