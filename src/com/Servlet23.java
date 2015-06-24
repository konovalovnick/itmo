package com;

import java.io.IOException;
import java.util.Random;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet23 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException
	{
		resp.setContentType("text/html; charset=cp1251");
		
		Random ranndd = new Random();
		
		resp.getWriter().println("<table>");
		
		for ( int i = 0 ; i < 8; i++ )
		{
			resp.getWriter().println("<tr>");
			for ( int j = 0; j < 5; j++ ) {
				resp.getWriter().println("<td>" + Integer.toString(ranndd.nextInt( ( 99 - 10 ) + 1) + 10) + "</td>");
			}
			resp.getWriter().println("</tr>");
		}
		
		resp.getWriter().println("</table>");
		
		
	}
}
