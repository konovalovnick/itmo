package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet21 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException
	{
		resp.setContentType("text/html; charset=cp1251");
		
		String nnum1 = req.getParameter("num1");
		int num1 = Integer.parseInt(nnum1);
		
		String nnum2 = req.getParameter("num2");
		int num2 = Integer.parseInt(nnum2);

		if (Math.abs(10 - num1) < Math.abs(10 - num2)) resp.getWriter().println(nnum1 + " ближе к 10");
		if (Math.abs(10 - num1) > Math.abs(10 - num2)) resp.getWriter().println(nnum2 + " ближе к 10");
		if (Math.abs(10 - num1) == Math.abs(10 - num2)) resp.getWriter().println(nnum1 + " = " + nnum2);
	}
}
