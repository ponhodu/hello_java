package co.edu.variable;

import java.util.Scanner;

public class WhileBank {
	public static void main(String[] args) {
		bankApp();
	}

	public static void bankApp() {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		// 메뉴 : 1: 예금, 2: 출금, 3:잔고, 4:종료
		// 예금 총액이 10만원 넘으면 입금이 안됨. 잔고보다 많은 금액 출금 못하게
		while (run) {
			System.out.println("1: 예금, 2: 출금, 3:잔고, 4:종료");
			int menu = scn.nextInt();

			switch (menu) {
			case 1:
				System.out.println("예금처리하는 메뉴");
				System.out.println("예금액을 입력 >>> ");
				int input = scn.nextInt();
				if (money + input > 100000) {
					System.out.println("입금이 불가능 합니다.");
				} else {
					money = money + input;
				}
			
				break;
			case 2:
				System.out.println("출금처리하는 메뉴");
				System.out.println("출금액을 입력 >>> ");
				int output = scn.nextInt();
				if (money - output < 0) {
					System.out.println("잔고가 부족합니다.");
				} else {
					money = money - output;
				}
				
				break;
			case 3:
				System.out.println("잔고조회하는 메뉴");
				System.out.println("현재잔고는 : " + money);
				break;
			case 4:
				System.out.println("종류하는 메뉴");
				run = false;
			}
		} // end of while
		System.out.println("end of pgm");
	}// end bankApp()
}// end class
