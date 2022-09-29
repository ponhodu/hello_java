package co.edu.variable;

import java.util.Scanner;

public class WhileExe {

	public static void main(String[] args) {
		whileFnc3();
	}

	public static void whileFnc3() {
		//보고 싶은 달 입력 시. 종료하고 9 입력.
		Scanner scn = new Scanner(System.in);
		while(true) { //while(true) 무한 반복할게 
			System.out.println("월을 선택하세요. 종료는 -1 입니다.");
			int input = scn.nextInt();
			if(input == -1) {
				break;
			}
			MethodCalendar.makeCal(input); //달력만드는 메소드 불러옴
			System.out.println();
		}
		System.out.println("end of pgm");
		scn.close();
	}
	
	public static void whileFnc2() {
		// while구문.
		Scanner scn = new Scanner(System.in); // import : ctrl+shift+O
		while (true) {
			System.out.println("값을 입력하세요. 종료하려면 stop 입력하세요");
			String inputVal = scn.nextLine(); // 사용자가 입력한 값을 불러옴
			if (inputVal.equals("stop")) {
				break;
			}
			System.out.println("사용자입력값> " + inputVal);
		}
		System.out.println("end of program");
		scn.close();// 시스템 자원을 반환.
	}

	public static void whileFnc() {
		// for 반복문 : 반복회수 알고 있을때. for(int i=0; i<10; i++)
		int i = 0;
		while (i < 4) {
			System.out.println(i);
			i++; // 출력 후 i 값 증가 시킬게
		}
		System.out.println("end of program");
	}// end whileFnc

}// end class
