package com.raghul;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/second")
public class secondServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException // res and req are just the referrence object creation will be handled by TOMCAT
	{
		res.getWriter().println("Second servlet is called");
		
		Cookie cookies[]=req.getCookies();  //accessing cookies
		for(Cookie c:cookies)					//fetching values from cookies
		{
			if(c.getName().equals("k"))
			{
				System.out.println("Cookies value is "+c.getValue());
			}
		}
		
		HttpSession session = req.getSession();  //accessing session
		int k=(int)session.getAttribute("k");	//fetching values from session
		session.removeAttribute("k");		//removing value  from session
//		System.out.println(k);	
	}

}
