package co.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
	public static void main(String[] args) {
		// null pointer 참조
		// String str = null;
		String str = "Hello World";
		// 예외처리 : RuntimeException 상속받아서 처리하는 예외 클래스
		try {
			String result = str.substring(0, 10);
			char chr = result.charAt(20);
			System.out.println(chr); 
		} catch (NullPointerException | StringIndexOutOfBoundsException e) { //다중 예외
			System.out.println("참조하는 값이 없습니다.");
//		} catch ( e1) {
//			System.out.println("인덱스 범위를 벗어난 값입니다.");
		} catch(RuntimeException e2) {
			System.out.println("실행 예외가 발생했습니다.");
		} catch(Exception e3) { 
			/*exception은 모든 예외를 포함함. runtimeexception, 
			 * nullpointerexception 각각 쓸 필요없이, exception 하나면 예외 처리 ok*/
			System.out.println("알수 없는 예외가 발생했습니다.");
		}
		// try 구문에서 오류 뜰 시에 - catch 구문 사용
		//catch구문은 예외 범위가 젤 큰걸 나중에 씁니다. 
		//ex. exception이 nullpoinerexception보다 먼저 오면 오류남.

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("숫자입력 >> ");

			try {
				int menu = scn.nextInt(); // InputMissmatchException
				System.out.println("입력 값은 : " + menu);
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				scn.nextLine(); //abc(enter) 
			}finally {
				System.out.println("반드시 실행할 코드는 finally 구문 입니당");
				//db connection 사용하고 resource 반환.
			}
		}
		
		
		
		System.out.println("프로그램 종료");
	}//end of main()
	
	public static void exceptMethod() {
//		 일반예외 : Exception 상속받아서 처리하는 예외 클래스
				try {
					Class.forName("java.lang.String");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}		
	}
}
