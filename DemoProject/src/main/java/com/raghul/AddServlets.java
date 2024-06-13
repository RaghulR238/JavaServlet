package com.raghul;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlets extends HttpServlet
{
	static
	{
		
		System.out.println("Getting into servlet class");
	}
//	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException // res and req are just the referrence object creation will be handled by TOMCAT
//	{
//		int num1=Integer.parseInt(req.getParameter("name1"));
//		int num2=Integer.parseInt(req.getParameter("name2"));
//		System.out.println(num1*num2);
//		res.getWriter().println("Result is "+num1*num2);
//	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException // res and req are just the referrence object creation will be handled by TOMCAT
, ServletException
	{
//		ServletContext sc=getServletContext();  //fetching data from servlet context
//		System.out.println(sc.getInitParameter("name"));//fetching by name(key)
//		
//		ServletConfig scon=getServletConfig();  //fetching data from servlet config
//		System.out.println(scon.getInitParameter("Name1"));//fetching by name(key)
		
		int num1=Integer.parseInt(req.getParameter("name1"));
		int num2=Integer.parseInt(req.getParameter("name2"));
		System.out.println("get method"+num1*num2);
		res.getWriter().println("Result is "+num1*num2);
		
		HttpSession session = req.getSession();  //creating session
		session.setAttribute("k",10);    // storing value with attribute
		
		Cookie cookie=new Cookie("k",10+"");	//creating and  storing values in cookies
		res.addCookie(cookie);					// returning cookies to client side via response
		
		res.sendRedirect("second");  
		
//		RequestDispatcher rd=req.getRequestDispatcher("second");
//		rd.forward(req, res);
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException // res and req are just the referrence object creation will be handled by TOMCAT
	{
		int num1=Integer.parseInt(req.getParameter("name1"));
		int num2=Integer.parseInt(req.getParameter("name2"));
		System.out.println("post method"+num1*num2);
		res.getWriter().println("Result is "+num1*num2);
	}
}
