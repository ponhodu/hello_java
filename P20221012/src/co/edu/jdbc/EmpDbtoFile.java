package co.edu.jdbc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EmpDbtoFile {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> list = dao.search();
		try {
		FileWriter fw = new FileWriter("C:/Temp/empFile.txt");
		for(Employee emp:list) {
			emp.getEmployeeId();
			fw.write(emp.getEmployeeId() + " " + emp.getLastName() + " " + emp.getEmail() + " " + emp.getHireDate() + " " + emp.getJobId() + "\n");
		}
		fw.close();
		} catch(IOException e) {
			e.fillInStackTrace();
		}
		System.out.println("Completed");
	}
}
