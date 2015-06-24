package com;

import java.io.IOException;
import java.lang.reflect.Field;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Servlet4 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		resp.setContentType("text/html; charset=cp1251");

		String brand = req.getParameter("brand");

		if (brand.equals("0")) {
			ClassCar ars7 = new ClassCar("RS7 Sportback", ">6300000");
			ClassCar aa6 = new ClassCar("A6", ">2130000");

			ClassCar[] cars = { ars7, aa6 };

			int tmp = 1;

			resp.getWriter().print("<table>");
			resp.getWriter().print("<tr>");
			resp.getWriter().print(
					"<th>Модель</th>" + "<th>Цена</th>");
			resp.getWriter().print("</tr><tr>");
			for (int i = 0; i < cars.length; i++) {
				for (Field field : cars[i].getClass().getDeclaredFields()) {
					try {
						resp.getWriter().print(
								"<td>" + field.get(cars[i]) + "</td>");
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (tmp++ % 2 == 0)
						resp.getWriter().println("</tr><tr>");
				}
			}
			resp.getWriter().print("</table>");

		}
		else if (brand.equals("1")) {
			ClassCar mcsc = new ClassCar("Cooper S Coupe", ">1466090");
			ClassCar mjcwr = new ClassCar("John Cooper Works Roadster", ">1858000");
			
			ClassCar[] cars = { mcsc, mjcwr };

			int tmp = 1;

			resp.getWriter().print("<table>");
			resp.getWriter().print("<tr>");
			resp.getWriter().print(
					"<th>Модель</th>" + "<th>Цена</th>");
			resp.getWriter().print("</tr><tr>");
			for (int i = 0; i < cars.length; i++) {
				for (Field field : cars[i].getClass().getDeclaredFields()) {
					try {
						resp.getWriter().print("<td>" + field.get(cars[i]) + "</td>");
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (tmp++ % 2 == 0)
						resp.getWriter().println("</tr><tr>");
				}
			}
			resp.getWriter().print("</table>");

		}
		else if (brand.equals("2")) {
			ClassCar b3s = new ClassCar("3 серия, Седан", ">2185000");
			ClassCar bx5 = new ClassCar("X5 M", ">5940000");
			
			ClassCar[] cars = { b3s, bx5 };

			int tmp = 1;

			resp.getWriter().print("<table>");
			resp.getWriter().print("<tr>");
			resp.getWriter().print("<th>Модель</th>" + "<th>Цена</th>");
			resp.getWriter().print("</tr><tr>");
			for (int i = 0; i < cars.length; i++) {
				for (Field field : cars[i].getClass().getDeclaredFields()) {
					try {
						resp.getWriter().print("<td>" + field.get(cars[i]) + "</td>");
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (tmp++ % 2 == 0)
						resp.getWriter().println("</tr><tr>");
				}
			}
			resp.getWriter().print("</table>");

		}

	}
}