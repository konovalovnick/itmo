package com;

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet32 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException
	{
		
		resp.setContentType("text/html; charset=cp1251");
		
		String tmpStart=req.getParameter("start");
		int start=Integer.parseInt(tmpStart);
		
		String tmpFinish=req.getParameter("finish");
		int finish=Integer.parseInt(tmpFinish);
		
		if ( start > finish || start < 0 || finish > 65535 ) resp.getWriter().println("Ошибка. Попробуйте еще.");
		else {
			int tmp=1;
			resp.getWriter().println("<table><tr>");
			for (int i = start; i <= finish; i++) {
				resp.getWriter().println("<td><table><tr><td>&#"+Integer.toString(i)+"</td></tr><tr><td>"+Integer.toString(i)+"</td></tr><tr><td>"+Integer.toHexString(Integer.parseInt(Integer.toString(i)))+"</td></tr></table>");
				if (tmp++%9==0) resp.getWriter().println("</tr><tr>");
			}
			resp.getWriter().println("</tr></table>");
		}
		
		
	}
}
