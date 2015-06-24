package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet22 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html; charset=cp1251");
		
		String nnum1 = req.getParameter("num1");
		double a = Integer.parseInt(nnum1);
		
		String nnum2 = req.getParameter("num2");
		double b = Integer.parseInt(nnum2);
		
		String nnum3 = req.getParameter("num3");
		double c = Integer.parseInt(nnum3);
		
		double d = Math.pow(b, 2) - 4 * a * c;
		
		double x1, x2;
		
		if ( d > 0 ) {
			x1 = ( - b + Math.sqrt( d ) ) / ( 2 * a );
			x2 = ( - b - Math.sqrt( d ) ) / ( 2 * a );
			resp.getWriter().println("<p><b>X1</b> = " + x1 + "</p><p><b>X2</b> = " + x2 + "</p>");
		}
		else if ( d == 0 ) {
			x1 = ( - b ) / ( 2 * a );
			resp.getWriter().println("<p><b>X1</b> = " + x1 + "</p>");
		}
		else if ( d < 0 ) {
			resp.getWriter().println("D < 0");
		}
		
		
	}
}
