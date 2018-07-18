package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayMenu
 */
@WebServlet("/TodayMenu")
public class TodayMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodayMenu() {
        super();
    }

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>post 메뉴 체크</title>");
		out.print("</head>");
		out.print("<body>");
		/*이번에는 한꺼번에 왔다. Lunch가 몇개 선택될지 모른다.
		 * 그래도 URL에 올 때 선택한 객수만큼 파라미터를 구성해서
		 * 넘어오게 된다. 그 파라미터를 받기 위해 getParameterValuse()
		 * 메서드를 이용해서 처리하면 원하는 수량만큼 데이터를 표시할 수 있다.
		 */
		String[] arLlunch = request.getParameterValues("lunch");
		out.print("<h5>당신이 선택한 점심메뉴 </h5>");
		for(int i=0; i<arLlunch.length; i++)
			out.println("▶"+arLlunch[i] + "<br>");
		out.print("</body> </html>");
	}
	//doAction 메소드를 만들어서 인스턴스화를 하여 사용을 할 수 있음을 알수 있다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doAction(request, response);
	}
	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html; charset=UTF-8");
	request.setCharacterEncoding("UTF-8");
	PrintWriter out = response.getWriter();
	
	out.print("<html>");
	out.print("<head>");
	out.print("<title> post 메뉴체크 </title>");
	out.print("</head>");
	out.print("<body>");
	이번에는 한꺼번에 왔다. lunch가 몇개 선택될 지 모른다.
	 * 그래도 URL에 올 때 선택한 갯수만큼 파라미터를 구성해서
	 * 넘어오게 된다. 그 파라미터를 받기 위해 getParameterValue메서드를
	 * 이용해서 처리하면 원하는 수량만큼 데이터를 표시한다.
	 
	String[] arLlunch = request.getParameterValues("lunch");
	out.print("<h5>당신이 선택한 점심메뉴 </h5>");
	for(int i=0; i<arLlunch.length; i++)
		out.print("▶"+arLlunch[i]+"<br>");
	
	out.print("</body>");
	out.print("</html>");
	}*/

}
