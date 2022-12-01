package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter{
	public String encoding;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		if(filterConfig.getInitParameter("encoding")!=null) {
			encoding = filterConfig.getInitParameter("encoding");
		} else {
			encoding = "UTF-8";
		}		
	}	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		//전처리
		//System.out.println("전처리 합니다.");
		request.setCharacterEncoding(encoding);
		
		//----------------------------------------------------------------
		filterChain.doFilter(request, response); //다음 필터 또는 서블릿으로 이동
		//----------------------------------------------------------------
		
		//후처리
		//System.out.println("후처리 합니다.");
	}
}
 