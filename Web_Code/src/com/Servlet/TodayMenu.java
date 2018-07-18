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
		out.print("<title>post �޴� üũ</title>");
		out.print("</head>");
		out.print("<body>");
		/*�̹����� �Ѳ����� �Դ�. Lunch�� � ���õ��� �𸥴�.
		 * �׷��� URL�� �� �� ������ ������ŭ �Ķ���͸� �����ؼ�
		 * �Ѿ���� �ȴ�. �� �Ķ���͸� �ޱ� ���� getParameterValuse()
		 * �޼��带 �̿��ؼ� ó���ϸ� ���ϴ� ������ŭ �����͸� ǥ���� �� �ִ�.
		 */
		String[] arLlunch = request.getParameterValues("lunch");
		out.print("<h5>����� ������ ���ɸ޴� </h5>");
		for(int i=0; i<arLlunch.length; i++)
			out.println("��"+arLlunch[i] + "<br>");
		out.print("</body> </html>");
	}
	//doAction �޼ҵ带 ���� �ν��Ͻ�ȭ�� �Ͽ� ����� �� �� ������ �˼� �ִ�.
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
	out.print("<title> post �޴�üũ </title>");
	out.print("</head>");
	out.print("<body>");
	�̹����� �Ѳ����� �Դ�. lunch�� � ���õ� �� �𸥴�.
	 * �׷��� URL�� �� �� ������ ������ŭ �Ķ���͸� �����ؼ�
	 * �Ѿ���� �ȴ�. �� �Ķ���͸� �ޱ� ���� getParameterValue�޼��带
	 * �̿��ؼ� ó���ϸ� ���ϴ� ������ŭ �����͸� ǥ���Ѵ�.
	 
	String[] arLlunch = request.getParameterValues("lunch");
	out.print("<h5>����� ������ ���ɸ޴� </h5>");
	for(int i=0; i<arLlunch.length; i++)
		out.print("��"+arLlunch[i]+"<br>");
	
	out.print("</body>");
	out.print("</html>");
	}*/

}
