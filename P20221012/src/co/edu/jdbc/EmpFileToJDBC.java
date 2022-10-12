package co.edu.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;

public class EmpFileToJDBC {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		String [] emps = null;
		Employee employee = null;
		try(FileReader fr = new FileReader("c:/Temp/emplist.txt");
			BufferedReader br = new BufferedReader(fr); //한번에 여러건 읽어들임 - 식행속도가 빠름
			){
			while(true) {
			String emp = br.readLine();
			if(emp == null)
				break;
			emps = emp.split(" ");
			employee = new Employee(Integer.parseInt(emps[0]), emps[1], emps[2], emps[3], emps[4]);
			dao.insert(employee);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("completed");
	}
}
