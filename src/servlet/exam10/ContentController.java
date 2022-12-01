package servlet.exam10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="exam10.ContentContoller", urlPatterns="/exam10/ContentController")
public class ContentController extends HttpServlet {

	// 클라이언트가 요청할 때 마다 실행
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		 
		 request.getRequestDispatcher("/WEB-INF/views/exam10/content.jsp").forward(request, response);
	}
}
