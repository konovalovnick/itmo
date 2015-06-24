package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet31 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException
	{
		
		resp.setContentType("text/html; charset=cp1251");
		
		String nnum1 = req.getParameter("num1");
		int num1 = Integer.parseInt(nnum1);
		
		String nnum2 = req.getParameter("num2");
		int num2 = Integer.parseInt(nnum2);
	
		if ( num1 > num2 || num1 < 0 || num2 > 65535 ) resp.getWriter().println("Ошибка. Попробуйте еще.");
		else 
		{
			int tmp = 1;
			
			resp.getWriter().println("<table><tr>");
			
			for (int i = num1; i <= num2; i++) {
				resp.getWriter().println("<td>&#" + Integer.toString(i) + "</td>");
				if (tmp % 10 == 0) resp.getWriter().println("</tr><tr>");
				tmp++;
			}
			
			resp.getWriter().println("</tr></table>");
		}		
		
	}
}
