import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet_Exam implements Servlet {
ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출됨");
		this.config = config;
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() 호출됨");
	}
	
	//ServletRequest - 클라이언트의 요청 정보를 다룰 때 사용. 파라미터 등
	//ServletResponse - 응답과 관련된 기능을 제공. 인토딩타입설정, 문자집합 지정 등
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		System.out.println("service() 호출됨");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig() 호출됨");
		return this.config;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo() 호출됨");
		return "version=1.0;author=leeyebin;copyright=javacafe 2019";
	}
}
