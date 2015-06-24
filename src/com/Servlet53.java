package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet53 extends HttpServlet
{

	static void StrokaIliNet(String stroka1, String stroka2) throws Exception53
	{
		if (!(stroka1.equals(stroka2)))
		{
			Exception53 e = new Exception53(
					"Ошибочка...");
			throw e;
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException
	{
		resp.setContentType("text/html; charset=cp1251");
		
		String name=req.getParameter("name");
		try {
			StrokaIliNet(name,"Nikita");
			resp.getWriter().print("Отлично!");
		} catch (Exception53 e) {
			resp.getWriter().print(e);
		}
	}

}