package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet54 extends HttpServlet
{

	static void poiskBukv(String audi, String bukva)
			throws Exception54 {
		if (!(audi.contains(bukva))) {
			Exception54 e = new Exception54("Ошибочка.");
			throw e;
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException
	{
		
		resp.setContentType("text/html; charset=cp1251");
		
		String stroka=req.getParameter("stroka");
		
		try {
			poiskBukv("audi", stroka);
			resp.getWriter().print("Отлично!");
		} catch (Exception54 e) {
			resp.getWriter().print(e);
		}
	}

}