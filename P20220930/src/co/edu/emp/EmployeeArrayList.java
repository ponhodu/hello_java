package co.edu.emp;

import java.util.ArrayList;
import java.util.Scanner;

//컬렉션 이용해 정보 저장.
public class EmployeeArrayList implements EmployeeService {

	ArrayList<Employee> list;
	int idx;
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		list = new ArrayList<Employee>();
		System.out.println("초기화 완료.");
	}

	@Override
	public void input() {

		int eId = -1;
		while (true) {
			try {
				System.out.println("사번 >>");
				eId = Integer.parseInt(scn.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
			}
		}
		System.out.println("이름 >>");
		String name = "";
		try {
			name = scn.nextLine();
		} catch (Exception e1) {
			System.out.println("문자를 기입하세요.");
		}

		int deptId = -1;
		while (true) {
			try {
				System.out.println("부서 >>");
				deptId = Integer.parseInt(scn.nextLine());
				break;
			} catch (Exception e2) {
				System.out.println("숫자를 입력하세요.");
			}
		}

		int sal = -1;
		while (true) {
			try {
				System.out.println("급여 >> ");
				sal = Integer.parseInt(scn.nextLine());
				break;
			} catch (Exception e3) {
				System.out.println("숫자로 입력하세요.");
			}
		}
		
		System.out.println("이메일 >>");
		String email = "";
		try {
			email = scn.nextLine();
		} catch (Exception e4) {
			System.out.println("문자로 입력하세요.");			
		}
		Employee emp = new Employee(eId, name, deptId, sal, email);
		list.add(emp);

	}

	@Override
	public void search() {

	}

	@Override
	public String search(int employeeId) {
		// 입력된 값중에서 찾도록.
		String result = null;
//		for (int i = 0; i < list.size(); i++) {
//			Employee emp = list.get(i); //list[i];
//			if (emp.getEmployeeId() == employeeId) {
//				result = list.get(i).getName();
//				break;
//			}
		for (Employee emp : list) {
			if (emp.getEmployeeId() == employeeId) {
				result = emp.getName();
				break;
			}
		}
		return result;
	} // end search;

	@Override
	public void print() {
		System.out.printf("%5s %10s %7s\n", "사번", "이름", "급여");
		System.out.println("=========================");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%5d %10s %7d\n", list.get(i).getEmployeeId(), list.get(i).getName(),
					list.get(i).getSalary());
		}

	}

	@Override
	public int searchSal(int employeeId) {
		int result = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEmployeeId() == employeeId) {
				result = list.get(i).getSalary();
				break;
			}
		}
		return result;
	}

}
