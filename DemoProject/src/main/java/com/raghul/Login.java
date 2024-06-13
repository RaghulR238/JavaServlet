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


public class Login extends HttpServlet
{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException // res and req are just the referrence object creation will be handled by TOMCAT
, ServletException
	{
		String name= req.getParameter("username");
		String password= req.getParameter("password");
		
		HttpSession session = req.getSession(); 
		session.setAttribute("username",name);
		session.setAttribute("password",password);

		
		if(name.equals("Raghul")&&password.equals("rocks"))
		{
			res.sendRedirect("welcome.jsp");
		}
	}
	
}
