package com;

import java.io.IOException;
import java.util.Random;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet24 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException
	{
		resp.setContentType("text/html; charset=cp1251");
		
		Random ranndd = new Random();
		
		int maxi = -99;
		
		resp.getWriter().println("<table>");
		
		for ( int i = 0 ; i < 5 ; i++ )
		{
			resp.getWriter().println("<tr>");
			for (int j = 0; j < 8 ; j++ )
			{
				int rrr = ranndd.nextInt( ( 99 + 99 ) + 1 ) - 99;
				if ( rrr > maxi ) maxi = rrr;
				String sRand = Integer.toString(rrr);
				resp.getWriter().println("<td>"
						+ sRand
						+ "</td>");
			}

			resp.getWriter().println("</tr>");
		}
		
		resp.getWriter().println("</table>" + "<br>" + maxi);
		
	}
}
