package servlet.exam04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

@WebServlet(name="exam04.JsonResponseController", urlPatterns="/exam04/JsonResponseController")
public class JsonResponseController2 extends HttpServlet {

	// 클라이언트가 요청할 때 마다 실행
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {			
		response.setContentType("application/json; charset=UTF-8");
	
		//{"bno":1, "btitle":"자바", "bcontent":"프로그래밍 언어"}
		JSONObject root = new JSONObject();
		root.put("bno",1);
		root.put("btitle", "자바");
		root.put("bcontent", "프로그래밍 언어");
		String json = root.toString();
		
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.flush();
		pw.close();
	}
}
