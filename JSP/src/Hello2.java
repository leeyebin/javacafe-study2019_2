import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		if (name == null) {
			name = "자바 카페와 함께하는 Servlet/JSP 강의";
		}
		req.setAttribute("javacafe", name);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/hello2.jsp");
		dispatcher.forward(req, resp);
	}
}
