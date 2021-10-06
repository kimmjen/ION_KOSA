package edu.kosa.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GiftDAOImpl extends GiftDAO {
	
	@Override
	public Connection getConnection() throws Exception {
		//step1 load the driver class  
        Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				//드라이버:@IP:PORT:SID, userid,pw
//				"jdbc.oracle.thin:@kosa3.iptime.org:50110:orcl","hr","h"
				"jdbc:oracle:thin:@kosa3.iptime.org:50110:orcl",
				"test03",
				"1111"
				
				);
		return conn;
				
				
	}
	
//	@Override
//	   public Connection getConnection() throws Exception {
//	      Class.forName("oracle.jdbc.driver.OracleDriver");
//	      //드라이버:@IP:PORT:SID, userid,pw
//	      Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:sid:orcl","soo","oracle");
//	      return conn;
//	   }
	
	
}
