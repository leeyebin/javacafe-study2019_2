import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//Annotation을 사용하게 되면 따로 web.xml에 매핑처리를 하지 않아도 된다.
@WebServlet("/GenericServlet2")
public class GenericServlet_Exam2 extends GenericServlet{
	
	//이미 GenericServlet추상클래스에 구현이 되어있기때문에 필요할때만 오버라이딩해서 사용하면 된다.
	//@Override
	//public void init(ServletConfig config) throws ServletException {
	//	System.out.println("init() 호출됨");
	//}
	
	@Override
	public void service(ServletRequest servletrequest, ServletResponse servletresponse)
			throws ServletException, IOException {
		System.out.println("GenericServlet2_service() 호출됨");
		
		//파라미터에 ?a=20&b=30 붙이기
		//int a = Integer.parseInt(servletrequest.getParameter("a") );
		//int b = Integer.parseInt(servletrequest.getParameter("b") );

		//주석 달거 있으면 달기
		//servletresponse.setContentType("text/plain"); //출력할 데이터의 인코딩 형식과 문자 집합 지정
		//servletresponse.setCharacterEncoding("UTF-8"); //출력할 데이터의 문자 집합 지정
		//PrintWriter writer = servletresponse.getWriter(); //출력 스트림 객체를 ㅏㅂㄴ환
		//writer.println("a=" + a + "," + "b=" + b + "의 계산결과 입니다.");
		//writer.println("a + b = " + (a + b));
		//writer.println("a - b = " + (a - b));
		//writer.println("a * b = " + (a * b));
		//writer.println("a / b = " + ((float)a / (float)b));
		//writer.println("a % b = " + (a % b));
	}

}
