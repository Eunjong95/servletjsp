package servlet.exam07;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="exam07.SaveSessionController", urlPatterns="/exam07/SaveSessionController")
public class SaveSessionController extends HttpServlet {

	// 클라이언트가 요청할 때 마다 실행
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		 
		 request.getRequestDispatcher("/WEB-INF/views/exam07/loginForm.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {				 
		 String userId = request.getParameter("userId");
		 String userPwd = request.getParameter("userPwd");

		 if(userId.equals("winter") && userPwd.equals("12345")) {		 
			 //세션 객체 가져오기
			 HttpSession session = request.getSession();
			 //세션에 데이터(객체)를 저장
			 session.setAttribute("loginId", userId);
			 session.setAttribute("loginDate", new Date());
			 
			 List<String> cart = new ArrayList<>();
			 session.setAttribute("cart", cart);
			 
			 
			 response.sendRedirect("ContentController") ;				 
			 } else {
				 request.getRequestDispatcher("/WEB-INF/views/exam07/loginForm.jsp").forward(request, response);
		 } 
	}
}
