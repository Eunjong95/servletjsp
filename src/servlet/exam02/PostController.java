package servlet.exam02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="exam02.PostController", urlPatterns="/exam02/PostController")
public class PostController extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//JSP로 이동
		request.getRequestDispatcher("/WEB-INF/views/exam02/post.jsp").forward(request, response);
	}
	
	
}
