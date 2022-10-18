package co.edu.memo.except;

<<<<<<< HEAD
=======
//Exception 상속받으면 무조건 try = catch해조야함
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
public class MenuException extends Exception {
	int choice ;
	
	public MenuException(int choice) {
		this.choice = choice;
	}
	
	public void showErrMessage() {
		System.out.println(choice + "는 없는 메뉴입니다.");
	}
}