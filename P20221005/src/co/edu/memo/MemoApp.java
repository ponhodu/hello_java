package co.edu.memo;

import java.util.Scanner;

import co.edu.memo.except.ExitException;
import co.edu.memo.except.MenuException;

public class MemoApp {
	public static void main(String[] args) {
		MemoManager menager = MemoManager.getInstance();
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("1.등록 2.검색 3.삭제 4.종료");
<<<<<<< HEAD
				System.out.print("선택>> ");
			
=======

				System.out.println("선택 >> ");
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
				int menu = Integer.parseInt(scn.nextLine());
			
				if(menu < MENU.INSERT || menu > MENU.EXIT) {
					throw new MenuException(menu);
				}
				
				switch(menu) {
				case MENU.INSERT:
<<<<<<< HEAD
					//입력작업
					menager.inputData();
=======
					// 입력작업
					manager.inputData();
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
					break;
				case MENU.SEARCH:
<<<<<<< HEAD
					//조회작업
					menager.searchData();
=======
					// 조회
					manager.searchData();
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
					break;
				case MENU.DELETE:
<<<<<<< HEAD
					//삭제작업
					menager.deleteData();
=======
					// 삭제
					manager.deleteData();
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
					break;
				case MENU.EXIT:
<<<<<<< HEAD
					//종료작업. 새로운 파일에 저장
					menager.storeToFile();
=======
					// 새로운 파일저장
					manager.storeToFile();
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
					throw new ExitException();
				}
			}catch(MenuException e) {
				e.showErrMessage();
			}catch(ExitException e) {
				break;
			}
<<<<<<< HEAD
		}// end of while
		System.out.println("프로그램 종료.");
=======
			
		} // end while
		System.out.println("프로그램 종료");
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
		scn.close();
	}
}