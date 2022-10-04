package co.edu.emp;

import java.util.ArrayList;
import java.util.Scanner;


//컬렉션 이용해 정보 저장.
public class EmployeeArrayList implements EmployeeService {
	
	Employee[] list;
	int idx;
	Scanner scn = new Scanner(System.in);
	ArrayList List = new ArrayList();
	
	@Override
	public void init() {
		
	}

	@Override
	public void input() {
		if(idx >=list.length) {
			System.out.println("더 이상 입력 불가");
			return;
		}
		System.out.println("사번 >>");
		int eId = Integer.parseInt(scn.nextLine());
		System.out.println("이름 >>");
		String name = scn.nextLine();
		System.out.println("부서 >>");
		int deptId = Integer.parseInt(scn.nextLine());
		System.out.println("급여 >> ");
		int sal = Integer.parseInt(scn.nextLine());
		System.out.println("이메일 >>");
		String email = scn.nextLine();
		
		Employee emp = new Employee(eId, name, deptId, sal, email);
		List.add(emp);
	}

	@Override
	public void search() {
		
		
	}

	@Override
	public String search(int employeeId) {
		
		return null;
	}

	@Override
	public void print() {
		for(int i =0; i<List.size(); i++) {
			
		}
		
	}

}
