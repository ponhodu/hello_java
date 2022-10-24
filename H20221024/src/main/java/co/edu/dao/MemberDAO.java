package co.edu.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.common.DAO;
import co.edu.vo.MemberVO;

//가장 작은 기능 구현
public class MemberDAO extends DAO {

	// 생성, 수정, 삭제, 한건조회 목록
	public void memberInsert(MemberVO vo) {
		String sql = "insert into members(id, passwd, name, email) values(?, ?, ?, ?)";
		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPasswd());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getEmail());

			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public MemberVO memberSearch(String id) {
		MemberVO vo = new MemberVO();
		String sql = "select * from members where id = ?";
		conn = getConnect();
		try {

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			if (rs.next()) {
				vo = (new MemberVO(rs.getString("id"), rs.getString("passwd"), rs.getString("name"),
						rs.getString("email")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}

	public void memberUpdate(MemberVO vo) {
		String sql = "update members set passwd =?, name =?, email =? where id = ?";

		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, vo.getPasswd());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getId());

			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public void memberdelete(String id) {
		String sql = "delete from members where id = ?";

		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			psmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	public List<MemberVO> memberList() {
		List<MemberVO> list = new ArrayList<>();

		conn = getConnect();
//		String sql = "select * from members";

		String sql = "select * from members" //
				+ " where id like '%'||?||'%' "//
				+ " and passwd like '%'||?||'%' "// //앞뒤로 퍼센트 붙여줌.
				+ " and name like '%'||?||'%' " //
				+ " and email like '%'||?||'%' "; //
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String passwd = rs.getString("passwd");
				String name = rs.getString("name");
				String email = rs.getString("email");

				list.add(new MemberVO(id, passwd, name, email));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
}
