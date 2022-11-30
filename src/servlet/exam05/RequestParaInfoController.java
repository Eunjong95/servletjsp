package servlet.exam05;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="exam05.RequestParaInfoController", urlPatterns="/exam05/RequestParaInfoController")
public class RequestParaInfoController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		
		request.getRequestDispatcher("/WEB-INF/views/exam05/requestParaInfo.jsp").forward(request, response);
	}

}
