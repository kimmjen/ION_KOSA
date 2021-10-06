package com.kosa.regi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class regi extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private Map<String, String> UserInfo = new HashMap<String, String>();
	
	public regi() {
        UserInfo.put("yoon1", "pass1");
        UserInfo.put("yoon2", "pass2");
        UserInfo.put("sangok", "pass");
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		System.out.println(id);
		String password=req.getParameter("password");
		System.out.println(password);
		resp.setCharacterEncoding("euc-kr");
		PrintWriter out = resp.getWriter();
		out.write("<html><head><title>로그인 페이지</title></head>");
		out.write("<body>");
		if(!UserInfo.containsKey(id)) {
			System.out.println("일치하는 아이디가 없습니다.");
			out.write("<h1>일치하는 아이디가 없습니다. </h1>");
			return;
		}
		if(!UserInfo.get(id).equals(password)) {
			System.out.println("패스워드가 틀렸습니다.");
			out.write("<h1> 패스워드가 틀렸습니다. </h1>");
			return;
		}
		System.out.println("로그인에 성공하였습니다.");
		out.write("<h1> 로그인에 성공하였습니다. </h1>");
		
		out.write("</body>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
		
	}
	
	

}
