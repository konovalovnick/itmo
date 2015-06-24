package com;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet52 extends HttpServlet
{

	static void proverkaNaDatu(String data) throws Exception52 {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.setLenient(false);
		try {
			dateFormat.parse(data.trim());
		} catch (ParseException exception) {
			Exception52 e = new Exception52("Ошибочка...");
			throw e;
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException
	{
		
		resp.setContentType("text/html; charset=cp1251");
		
		String data = req.getParameter("data");
		
		try {
			proverkaNaDatu(data);
			resp.getWriter().print("Отлично!");
		} catch (Exception52 e) {
			resp.getWriter().print(e);
		}
	}

}