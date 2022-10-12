package co.edu.jdbc;
//jdbc - 자바로 관계형데이터베이스, sql 작업할때 쓰는 api

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class DAO {
	Connection conn;
	Statement stmt;
	// db쪽으로 sql문 전송. db는 결과를 자바로 전달하는 객체
	//-> statement 객체 생성위해 createStatement()메소드사용
	ResultSet rs;
	//executeQuery() 메소드에서 실행된 select문의 결과값 갖고 있다.
	PreparedStatement psmt;
	//statement 클래스의 기능향상된거. 


	public Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// jdbc  드라이버 로딩
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//dbms 서버 접속 - db 서버와의 연결
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("error");
		}
		return conn;
	}


	public void disconnect() {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
