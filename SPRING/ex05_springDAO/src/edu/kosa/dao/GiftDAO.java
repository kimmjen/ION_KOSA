package edu.kosa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class GiftDAO { // 추상 클래스
	
	// DB 연결 관련 메소드
	public abstract Connection getConnection() throws Exception;
	
	// insert
	
	// selectAll
	public void selectAll() throws Exception {
		Connection conn = getConnection();
		// 3. 사용(DML) = Statement, PreparedStatement
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT"); // ctrl + shift + x
		
		System.out.println("GNO \t GName \t\t\t 최하가 \t 최고가");
		
		while (rs.next() ) { // res.get타입형(index); or rs.getXXX("필드명");
			int gno = rs.getInt("gno");
			String gname = rs.getString(2);
			int gstart = rs.getInt("g_start");
			int gend = rs.getInt("g_end");
			
			System.out.println(gno + "\t" + gname + "\t\t" + gstart + "\t" + gend);
		}
	}
	// select = 조건에 맞는 것 select 하기 (gno)
	
	// update
	
	// delete
	
	/*
	 * 1. 드라이버 로드
	 * 2. connect & open
	 * 3. 사용(DML)
	 * */

}