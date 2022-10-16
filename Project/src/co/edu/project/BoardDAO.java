package co.edu.project;

import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO extends DAO{
	ArrayList<Board> brdList = new ArrayList<Board>();
	
	//로그인
	public boolean login(String id, String pw) {
		String sql = "select * from users where id = ?";
		conn = getConnect();
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				if(pw.equals(rs.getString("passwd"))){
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return false;
		
	}//end login
	
	//글 등록
	public void inputBrd(Board brd) {
		String sql = "insert into board(board_num, board_title, board_content, board_writer)\r\n"
				+ "values( ?, ?, ?, ?)";
		
		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, brd.getbNum());
			psmt.setString(2, brd.getbTitle());
			psmt.setString(3, brd.getbContent());
			psmt.setString(4, brd.getbWriter());
			
			psmt.executeUpdate();
			
			System.out.println("업로드가 완료되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}// end inputBrd
	
	//id로 특정글 찾기
	public void getBrd(String logId) {
		String sql = "select * from board where id = ?";
		conn = getConnect();
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, logId);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				brdList.add(rs.getString(0))
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
	
	//id로 특정 글에 대한 댓글 찾기
	public void getRp(String logId) {
		
	}
}
