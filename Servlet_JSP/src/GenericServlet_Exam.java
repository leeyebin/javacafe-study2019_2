import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServlet_Exam extends GenericServlet{

	@Override
	public void service(ServletRequest servletrequest, ServletResponse servletresponse)
			throws ServletException, IOException {
		System.out.println("GenericServlet_service() 호출됨");
		
		//파라미터에 ?a=20&b=30 붙이기
		//int a = Integer.parseInt(servletrequest.getParameter("a") );
		//int b = Integer.parseInt(servletrequest.getParameter("b") );

		//주석 달거 있으면 달기
		//servletresponse.setContentType("text/plain"); 
		//servletresponse.setCharacterEncoding("UTF-8");
		//PrintWriter writer = servletresponse.getWriter();
		//writer.println("a=" + a + "," + "b=" + b + "의 계산결과 입니다.");
		//writer.println("a + b = " + (a + b));
		//writer.println("a - b = " + (a - b));
		//writer.println("a * b = " + (a * b));
		//writer.println("a / b = " + ((float)a / (float)b));
		//writer.println("a % b = " + (a % b));
	}

}
