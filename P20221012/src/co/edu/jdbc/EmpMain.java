package co.edu.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		Scanner scn = new Scanner(System.in);
		Employee emp = null;

		// 1. 사원등록 2. 한건조회 3. 수정 4. 삭제 5. 목록조회 6. 일괄등록 9. 종료
		while (true) {
			
			System.out.println("1. 사원등록 2. 한건조회 3. 수정 4. 삭제 5. 목록조회 6. 일괄등록 9. 종료");
			System.out.println(">> ");
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				System.out.println("사원등록");
				System.out.println("사번 >> ");
				int employeeId = Integer.parseInt(scn.nextLine());
				System.out.println("이름 >> ");
				String lastName = scn.nextLine();
				System.out.println("메일 >> ");
				String email = scn.nextLine();
				System.out.println("입사일자 >> ");
				String hireDate = scn.nextLine();
				System.out.println("직무명>> ");
				String jobId = scn.nextLine();

				emp = new Employee(employeeId, lastName, email, hireDate, jobId);

				dao.insert(emp);

			} else if (menu == 2) {
				System.out.println("한건조회");
				System.out.println("사번>>");
				int empId = Integer.parseInt(scn.nextLine());

				Employee x = dao.getEmp(empId);
				if (x == null) {
					System.out.println("사번이 존재하지 않습니다.");
				} else {
					System.out.println(x);
				}
			} else if (menu == 3) {
				System.out.println("수정 페이지");
				System.out.println("수정할 사번 입력 >> ");
				int employeeId = Integer.parseInt(scn.nextLine());
				System.out.println("이름 >> ");
				String lastName = scn.nextLine();
				System.out.println("메일 >> ");
				String email = scn.nextLine();
				System.out.println("입사일자 >> ");
				String hireDate = scn.nextLine();
				System.out.println("직무명>> ");
				String jobId = scn.nextLine();
				emp = new Employee(employeeId, lastName, email, hireDate, jobId);
				dao.update(emp);

			} else if (menu == 4) {
				System.out.println("삭제 페이지");
				System.out.println("삭제할 사번 입력>> ");
				int employeeId = Integer.parseInt(scn.nextLine());
//				dao.delete(employeeId);

				if(dao.delete(employeeId)) {
					System.out.println("삭제 완료");
				}else {
					System.out.println("삭제할 사번이 없습니다");
				}
				
			} else if (menu == 5) {
				System.out.println("목록조회");
				List<Employee> employees = dao.search();
				for (Employee i : employees) {
					System.out.println(i);
				}
			} else if(menu == 6) {
				String [] emps = null;
				try(FileReader fr = new FileReader("c:/Temp/emplist.txt");
					BufferedReader br = new BufferedReader(fr); //한번에 여러건 읽어들임 - 식행속도가 빠름
					){
					while(true) {
					String emp1 = br.readLine();
					if(emp == null)
						break;
					emps = emp1.split(" ");
					emp = new Employee(Integer.parseInt(emps[0]), emps[1], emps[2], emps[3], emps[4]);
					dao.insert(emp);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("completed");
			}else if(menu == 9) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
		scn.close();
		System.out.println("end pgm");
	}
}
