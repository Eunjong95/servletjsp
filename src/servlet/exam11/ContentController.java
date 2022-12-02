package servlet.exam11;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Board;
import dto.User;

@WebServlet(name="exam11.ContentContoller", urlPatterns="/exam11/ContentController")
public class ContentController extends HttpServlet {

	// 클라이언트가 요청할 때 마다 실행
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setUserId("winter");
		user.setUserName("홍길동");
		
		Board board = new Board();
		board.setBno(1);
		board.setBtitle("금요일");
		board.setBcontent("열심히 공부합니다.");
		
		
		//request 범위
		request.setAttribute("user", user);
		
		//session범위
		HttpSession session = request.getSession();
		session.setAttribute("board",board);	
	
		//servletContext(application)범위
		ServletContext application=request.getServletContext();
		application.setAttribute("info", "Servle/JSP 학습용 애플리케이션");
				
		request.getRequestDispatcher("/WEB-INF/views/exam11/content.jsp").forward(request, response);
	}
}
