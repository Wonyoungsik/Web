package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet(urlPatterns="/boardAction")
public class BoadAction extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{
		res.setContentType("text/html);Charset=utf-8");
		int result =0;
		HttpSession session = req.getSession();
		session.setAttribute("result", result);
		PrintWriter out = res.getWriter();
		RequestDispatcher view = 
				req.getRequestDispatcher("/AjAX/20180712/boardViewJquery.jsp");
		view.forward(req, res);
	}
	
	

}
