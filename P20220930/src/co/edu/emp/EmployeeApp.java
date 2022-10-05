package co.edu.emp;

import java.util.InputMismatchException;
import java.util.Scanner;

//메인클래스 
public class EmployeeApp {
	public static void main(String[] args) {
		// 1. 사원수(초기화) 2. 사원정보 입력 3. 사원검색 4. 사원리스트 5.사원급여조회 9. 종료
		Scanner scn = new Scanner(System.in);
		EmployeeService service = new EmployeeArrayList();// new EmployeeArrayList로만 바꾸면 또 쓸수 있다.
		while (true) {
			System.out.println("1. 사원수(초기화) 2. 사원정보 입력 3. 사원검색 4. 사원리스트 5.사원 급여 9. 종료");
			System.out.println("선택 >> ");
			int menu = -1;
			try {
				menu = Integer.parseInt(scn.nextLine()); // "1" -> 1 문자열 값을 int값으로 바꾸기, static 메소드
				
			} catch (NumberFormatException e) {
				System.out.println("입력한 메뉴는 존재하지 않습니다.");
				scn.nextLine();
			}
			if (menu == 1) {
				service.init();
			} else if (menu == 2) {
				service.input();
			} else if (menu == 3) {
				System.out.println("검색할 사원 번호 입력 >> ");
				int eId = Integer.parseInt(scn.nextLine()); // "100"Enter. 가 먹힘.
				String name = service.search(eId);
				if (name == null) {
					System.out.println("찾는 사원 정보가 없습니다.");
				} else {
					System.out.println("사원의 이름은 " + name + "입니다.");
				}
			} else if (menu == 4) {
				service.print();
			} else if (menu == 5) {
				// 사번 입력 -> 급여 정보 반환
				System.out.println("검색할 사원 번호 입력 >> ");
				int eId = Integer.parseInt(scn.nextLine());
				int salary = service.searchSal(eId);
				if (salary == -1) {
					System.out.println("찾는 사원 정보가 없습니다.");
				} else {
					System.out.println("사원의 급여는 " + salary + "입니다.");
				}
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다 ");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}// end main
}// end class
