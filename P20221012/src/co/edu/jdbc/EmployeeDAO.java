package co.edu.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO extends DAO {

	public boolean delete(int empId) {
		String sql = "delete from empl where employee_id = ?";
		conn = getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);

			int r = psmt.executeUpdate();
			if (r > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	public void update(Employee emp) {
		String sql = "update empl "//
				+ "set email = ?, "//
				+ "    hire_date = ?, "//
				+ "    job_id = ? "//
				+ "where employee_id = ?";

		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, emp.getEmail());
			psmt.setString(2, emp.getHireDate());
			psmt.setString(3, emp.getJobId());
			psmt.setInt(4, emp.getEmployeeId());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public void insert(Employee emp) { 
		String sql = "insert into empl(employee_id, last_name, email, hire_date, job_id)\r\n" + "values( "
				+ emp.getEmployeeId()//
				+ ", '" + emp.getLastName() //
				+ "', '" + emp.getEmail() //
				+ "', '" + emp.getHireDate()//
				+ "', '" + emp.getJobId() + "')"; 
		conn = getConnect();
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 입력됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public List<Employee> search() {
		conn = getConnect();
		List<Employee> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from empl order by employee_id");

			while (rs.next()) {
				list.add(new Employee(rs.getInt("employee_id")//
						, rs.getString("last_name")//
						, rs.getString("email")//
						, rs.getString("hire_date")//
						, rs.getString("job_id")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	public Employee getEmp(int empId) {
		conn = getConnect();
		Employee findemp = null;
		String sql = "select * from empl where employee_id = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);
			rs = psmt.executeQuery(); //

			if (rs.next()) {
				findemp = new Employee(rs.getInt("employee_id")//
						, rs.getString("last_name")//
						, rs.getString("email")//
						, rs.getString("hire_date")//
						, rs.getString("job_Id"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return findemp;
	}
}
