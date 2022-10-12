package co.edu.jdbc;

import java.util.List;

public class EmpApp {
	public static void main(String[] args) {
		EmployeeDAO empDao = new EmployeeDAO();
		
		int empId = 100;
		String lastName = "Hong";
		String email = "hongkil@email";
		String hireDate = "2020-05-11";
		String jobId = "ST_MAN";
		Employee emp1 = new Employee(empId, lastName, email, hireDate, jobId);
		
//		empDao.insert(emp1);
//		empDao.update(emp1);
//		empDao.delete(empId);
//		empDao.getEmp(empId); //인스턴스
		System.out.println(empDao.getEmp(empId));
		List<Employee> employees = empDao.search();
		
		for(Employee emp: employees) {
			System.out.println(emp);
		}
	}
}
