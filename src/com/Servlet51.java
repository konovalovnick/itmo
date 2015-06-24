package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet51 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html; charset=cp1251");
		String num = req.getParameter("num");
		try {
			proverkaChisla(num);
			resp.getWriter().print("Отлично!");
		} catch (Exception51 e) {
			resp.getWriter().print(e);
		}
	}
	static void proverkaChisla(String num) throws Exception51 {
		try {
			double tryToConvertToInt = Integer.parseInt(num);
		} catch (NumberFormatException exception) {
			Exception51 e = new Exception51("Ошибочка...");
			throw e;
		}
	}

}