package servlet.exam05;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="exam05.ParaController", urlPatterns="/exam05/ParaController")
public class ParaController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		int pageNo = Integer.parseInt(request.getParameter("pageNo"));
		String kind = request.getParameter("kind");
		String writer = request.getParameter("writer");
		String[] hobby = request.getParameterValues("hobby");
		
		System.out.println("pageNo: " + pageNo);
		System.out.println("kind: " + kind);
		System.out.println("writer: " + writer);
		System.out.println("hobby: " + Arrays.toString(hobby));
		
		response.sendRedirect("RequestParaInfoController");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		//Post방식에서만 해주면 되는 한글 처리 메소드
		request.setCharacterEncoding("UTF-8");
		
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String[] hobby =request.getParameterValues("hobby");
		String job = request.getParameter("job");
		String city = request.getParameter("city");
		
		System.out.println("email: " + email);
		System.out.println("pwd: " + pwd);
		System.out.println("hobby: " + Arrays.toString(hobby));
		System.out.println("job: " + job);
		System.out.println("city: " + city);
		
		response.sendRedirect("RequestParaInfoController");
	}
}
