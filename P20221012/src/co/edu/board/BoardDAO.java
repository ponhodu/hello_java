package co.edu.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
				+ "creation_date = sysdate, "
				+ "where board_num = ?";
		
		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, brd.getbContent());
			psmt.setInt(2, brd.getbNum());
			
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
	
	public List<Board> search(){
		conn = getConnect();
		String sql = "select * from board order by board_num";
		List<Board> list = new ArrayList<>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				list.add(new Board(rs.getInt("board_num")
						, rs.getString("board_title")
						, rs.getString("board_content")
						, rs.getString("board_writer")
						, rs.getString("created_date")
						, rs.getInt("cnt")));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}//end search
	
	public Board getBrd(int bNum) {
		conn = getConnect();
		Board findbrd = null;
		String sql = "select * from board where board_num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bNum);
			rs =psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return findbrd;
	}
}
