package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name="HomeController", urlPatterns="/HomeController")
public class HomeController extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("HomeController.init() 실행");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HomeController.service() 실행");
		
		//JSP로 이동
		request.getRequestDispatcher("/WEB-INF//views/home.jsp").forward(request, response);
	
	}
	
	@Override
	public void destroy() {
		System.out.println("HomeController.destroy() 실행");
	}
	
}
