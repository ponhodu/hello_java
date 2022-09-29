package co.edu.variable;

public class MethodExe {
	
	// main 메소드 : 첫번째로 실행
	public static void main(String[] args) {
		printStar(); //호출함
		printStar(3); //실행부분은 값만 적는다. 변수 타입을 적어주진 않음.
		printCircle("@@@");
		printCircle("$$$", 5);
		int result = sum(sum(2, 3), sum(3,4));
		System.out.println("최종값은 " + result);
	}
	
	public static void printStar() { //void : 반환값 없음. -> 반환값, 매개 변수도 없는 prinStar 메소드를 만든다.
		System.out.println("☆");
	}
	
	public static void printStar(int times) {
		for(int i=0; i<times; i++) {
			System.out.println("★");
		}
	}
	
	public static void printCircle(String circle) {
		System.out.println(circle);
	}
	
	//출력하는 모양, 갯수
	public static void printCircle(String circle, int times) {
		for(int i=0; i<times; i++) {
			System.out.println(circle);
		}
	}
	
	//반환값을 가지는 메소드.
	public static int sum(int n1, int n2) { //함수 설정할때 반환값의 데이터 타입도 지정해조야 함.
		int result = n1 * 2 + n2 * 3; //반환값 정의
		System.out.println("결과 값은 " + result);
		return result; // 반환값의 유형은 int
	}
}