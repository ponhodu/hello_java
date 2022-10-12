package co.edu.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDAO {

	public static void main(String[] args) {
		update();
	}
	
	public static void update() {
		Connection conn = null;
		Statement stmt = null;
//		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); 
			
			stmt = conn.createStatement();
			int r = stmt.executeUpdate("update empl set first_name = 'ihyeon' where employee_id = 500"); //update - insert,delete,update �� ��
			System.out.println(r + "건 수정 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//finally  정상적으로 작동 유무에 관계없이 무조건 실행
			try {
//				rs.close();
				stmt.close();
				conn.close(); 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void delete() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); 
			
			stmt = conn.createStatement();
			int r = stmt.executeUpdate("delete from empl where employee_id=700"); //update - insert,delete,update 
			System.out.println(r + "건 삭제 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
//				rs.close();
				stmt.close();
				conn.close(); 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void search() {
		
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver"); //jdbc드라이버 연결?
					conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); // url, 사용자, 사용자암호

					stmt = conn.createStatement(); // 
					rs = stmt.executeQuery("select * from empl order by employee_id");
					// Set 컬렉션
					while (rs.next()) {
						System.out.println("사번 : " + rs.getInt("employee_id"));
						System.out.println("이름 : " + rs.getString("first_name"));
						System.out.println("급여 : " + rs.getInt("salary"));
						System.out.println("=====================================");
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					
					try {
						rs.close();
						stmt.close();
						conn.close(); 
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println("종료합니다");
	}// end of class search;

}
