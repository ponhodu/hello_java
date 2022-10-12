package co.edu.board;

import java.sql.SQLException;

//Create Read Update Delete
public class BoardDAO extends DAO {
	
	public void insert(Board brd) {
		String sql = "insert into board(board_num, board_title, board_content, board_writer, creation_date, cnt)\r\n"
				+ "values( "
				+ ", '" + brd.getbNum() //
				+ ", '" + brd.getbTitle() //
				+ ", '" + brd.getbContent() //
				+ ", '" + brd.getbWriter() //
				+ ", '" + brd.getbDate() + "')"; //cnt 추가 필요함 ㅠㅠ
		
		conn = getConnect();
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 입력되었습니다");
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}// end insert;
	
	public void update(Board brd) {
		String sql = "update board "
				+"set board_content = ? ,"
				+ "creation_date = ?, "
				+ "where board_num = ?";
		
		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, brd.getbContent());
			psmt.setString(2, brd.getbDate());
			psmt.setInt(3, brd.getbNum());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}// end update
	
	public boolean delete(int bNum) {
		String sql = "delete from board where board_num = ?";
		conn = getConnect();
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bNum);
			
			int r = psmt.executeUpdate();
			if(r>0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}// end delete
	
}
