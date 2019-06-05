import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServlet_Exam extends HttpServlet {

	private int visitCount = 0;

	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출됨");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.visitCount++;

		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();

		out.println("<HTML>");
		out.println("<head><title>테스트</title></head>");
		out.println("<body>");
		out.println("HttpServlet 방문자 : " + this.visitCount);
		out.println("</HTML>");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		// 또는 post로 요청이 왔을때 해야 할 일
		// 현재 로직상 post로 요청해도 바로 doGet 메서드를 호출함
	}

	@Override
	public void destroy() {
		System.out.println("destroy() 호출됨");
	}

}
