package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondFilter implements Filter{	

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		//전처리
		//System.out.println("전처리 1합니다.");
		
		//----------------------------------------------------------------
		filterChain.doFilter(request, response); //다음 필터 또는 서블릿으로 이동
		//----------------------------------------------------------------
		
		//후처리
		//System.out.println("후처리 1합니다.");
	}
}
 