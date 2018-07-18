package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddtionServlet
 */
@WebServlet(urlPatterns="/AddtionServlet")
public class AddtionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddtionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=EUC-KR");
		
		String f = request.getParameter("f");
		String s = request.getParameter("s");
		int firstNumber = Integer.parseInt(f);
		int secondNumber = Integer.parseInt(s);
		int additionResult = firstNumber + secondNumber;
		System.out.println(additionResult);
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>서블릿이 보낸 화면</title></bead>");
		out.println("<body>");
		out.println(additionResult + "입니다.");
		out.print("</body></html>");
		out.flush();
		out.close();

		
	}

}
