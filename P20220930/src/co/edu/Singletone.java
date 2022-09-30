package co.edu;

public class Singletone {
//어플리케이션에 단 1개만 만들고 싶을떄
	//private 정적필드
	private static Singletone singleton = new Singletone();
	
	//private 생성자.
	
	private Singletone() {
	}
	
	//public getInstance() ; 생성자를 만들수있음
	public static Singletone getInstance() {
		return singleton;
	}
	
}
