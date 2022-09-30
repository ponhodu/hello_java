package co.edu.variable;

import java.util.Scanner;

//계좌 정보 선언 : 계좌번호 , 예금주 이름, 잔고
// 은행 계좌 생성 : Account[] banks;
public class WhileBankApp {
	
	public static void main(String[] args) {
		// 메뉴 : 1:예금, 2:출금, 3:잔액조회, 4:종료
		Account[] banks = new Account[10]; // banks라는

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("0:계좌 생성, 1:예금, 2:출금, 3:잔액조회, 4:종료");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				// 예금기능. 계좌번호, 얼마.
				System.out.println("계좌번호 >>> ");
				String accNo = scn.nextLine();
				System.out.println("예금할 금액 >>> ");
				int money = scn.nextInt();

				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
						banks[i].setBalance(banks[i].getBalance() + money);
						break;// 예금액의 누적액이기 때문에.
					} else {
						System.out.println("입력하신 계좌번호는 존재하지 않습니다. ");
						break;
					}
				}
			} else if (menu == 2) {
				System.out.println("계좌번호 >>> ");
				String accNo = scn.nextLine();
				System.out.println("출금할 금액 >>> ");
				int money = scn.nextInt();

				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
						if (banks[i].getBalance() - money > 0) {
							banks[i].setBalance(banks[i].getBalance() - money); // 예금액의 누적액이기 때문에.
						} else {
							System.out.println("잔고가 부족합니다.");
							break;
						}
					}
				}
			} else if (menu == 3) {
				System.out.println("조회할 계좌번호 입력 >>.");
				String accNo = scn.nextLine();
				Boolean check = false;
				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
						System.out.println("잔액 : " + banks[i].getBalance());
						check = true;
					}
				}
				if(check = false) {
					System.out.println("계좌는 없습니다.");
				}
				

			} else if (menu == 4) {
				System.out.println("종료합니다.");
				break;
			} else if (menu == 0) {
				System.out.println("계좌번호입력>>>  ");
				String accNo = scn.nextLine();
				System.out.println("예금주>>>  ");
				String owner = scn.nextLine();
				Account acc = new Account(); // 인스턴스 생성. Account 클래스와 연결 한거.
				acc.setAccNo(accNo);
				acc.setOwner(owner);
				// 계좌 번호 생성.
				for (int i = 0; i < banks.length; i++) {
					if (banks[i] == null) {
						// 한건 입력.break;
						banks[i] = acc;
						break;
					}
				}
				System.out.println("계좌 생성 완료");
			}

		} // end while

}// end main
}// end class
