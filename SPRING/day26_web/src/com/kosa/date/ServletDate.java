package com.kosa.date;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/test")
//@WebServlet("/edu")
public class ServletDate extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		process(req, resp);
	} // 전송 방식
	
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hello, Servlet");
		// 인코딩
		resp.setCharacterEncoding("euc-kr");
		
		Calendar c = Calendar.getInstance();// 시스템이 갖고 있는 날짜를 얻어옴
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int seconde = c.get(Calendar.SECOND);
		
		PrintWriter out = resp.getWriter();
		out.write(
				"<html><head><title>서버측 시간을 얻어 웹페이에 씁니다.</title></head>");
		out.write("<body><H1>hello servlet</h1>");
		out.write("<h2>현재시간은 ");
		out.write(hour + " 시");
		out.write(min + " 분");
		out.write(seconde + " 초<br>");
		out.write("<img src='./images/1.png'/>");
		out.write("</h2></body></html>");
		out.close();
	}
	
	

}
