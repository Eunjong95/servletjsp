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
	
	//클라이언트가 요청할 때 마다 콜백 (get이든 post든 요청 방식과는 상관 없이 실행)
	//역할: 요청 처리
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HomeController.service() 실행");
		
		//JSP로 이동
		request.getRequestDispatcher("/WEB-INF//views/home.jsp").forward(request, response);	
	}	

}
