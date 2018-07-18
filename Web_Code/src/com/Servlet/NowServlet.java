package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/NowServlet")
public class NowServlet extends HttpServlet {
@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException{
	
		res.setContentType("text/html);charset=UTF-8");
		PrintWriter out = res.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>three day</title");
		out.print("</head>");
		out.print("</body>");
		
		Date now = new Date();
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd EEEE hh:mm:ss");
		String date = time.format(now);// 최종 문자열 형식 - Date를 날짜 / 시간 문자열로 형식화.
		out.print("현재시각:" + date+"<br>");
		out.print("</body>");
		out.print("</html>");
}

}
