import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String v1 = "";
		String v2 = "";
		String result = "";
		String[] selected = { "", "", "", "" };

		// 값이 있을 때만 꺼낸다.
		if (req.getParameter("v1") != null) {
			v1 = req.getParameter("v1");
			v2 = req.getParameter("v2");
			String op = req.getParameter("op");

			result = calculate(Integer.parseInt(v1), Integer.parseInt(v2), op);

			if ("+".equals(op)) {
				selected[0] = "selected";
			} else if ("-".equals(op)) {
				selected[1] = "selected";
			} else if ("*".equals(op)) {
				selected[2] = "selected";
			} else if ("/".equals(op)) {
				selected[3] = "selected";
			}
		}

		req.setAttribute("v1", v1);
		req.setAttribute("v2", v2);
		req.setAttribute("result", result);
		req.setAttribute("selected", selected);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calculator2.jsp");
		dispatcher.forward(req, resp);
	}

	private String calculate(int a, int b, String op) {
		int r = 0;

		if ("+".equals(op)) {
			r = a + b;
		} else if ("-".equals(op)) {
			r = a - b;
		} else if ("*".equals(op)) {
			r = a * b;
		} else if ("/".equals(op)) {
			r = a / b;
		}

		return Integer.toString(r);
	}
}
