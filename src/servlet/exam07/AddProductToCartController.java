package servlet.exam07;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="exam07.AddProductToCartController", urlPatterns="/exam07/AddProductToCartController")
public class AddProductToCartController extends HttpServlet {

	// 클라이언트가 요청할 때 마다 실행
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		 		 
		if(session.getAttribute("loginId") != null) {
			 List<String> cart = (List<String>) session.getAttribute("cart");
			 String productName = request.getParameter("productName");
			 cart.add(productName);
		 }
		 response.sendRedirect("ContentController");
	}
}
