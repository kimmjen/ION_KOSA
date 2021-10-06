package com.kosa.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edu")
public class InfoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public String uname="이순신";
	public String uage= "30";
	public String ulocal="전국";
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 코딩위치~
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String local = req.getParameter("local");
		
		System.out.println(name + ", " + age + ", " + local);
		
		
		resp.setCharacterEncoding("euc-kr");
		System.out.println(name +", "+ age +", "+local);
		PrintWriter pw = resp.getWriter();
//		pw.write("<h1>index page에서 servlet 불렀습니다.</h1>");
		
//		pw.write("<h1>입력된 정보</h1>");
//		pw.write("<h3>이름 : " + name + "</h3>");
//		pw.write("<h3>나이 : " + age + "</h3>");
//		pw.write("<h3>거주지 : " + local + "</h3>");
//		pw.write("다시입력하려면 <b><a href='./index.html'>여기</a></b>를 눌러주세요.");
		
		pw.write("<html><head><title>myInfo</title></head><body><b><br>");
		
		if (uname.equals(name) && !uage.equals(age) && ulocal.equals(local)) {
			pw.println("password fail");
			pw.println("<a href='html/info.html'>Login</a>");
		} else if (uname.equals(name) && !uage.equals(age) && ulocal.equals(local)) {
			pw.println("password fail");
			pw.println("<a href='html/info.html'>Login</a>");
			
		} else if (uname.equals(name) && !uage.equals(age) && ulocal.equals(local)) {
			pw.println("your name is " + name + "<br>");
			pw.println("your age is " + age + "<br>");
			pw.println("your address is " + local + "<br>");
			
		} else {
			pw.write("register fail<br>");
			pw.write("<a href='./html/info.html'>Login</a>");
		}
		pw.write("</body></html>");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
