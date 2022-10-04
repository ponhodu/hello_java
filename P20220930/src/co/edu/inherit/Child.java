package co.edu.inherit;

public class Child extends Parent { //Parent 테이블을 상속받겠다.
	String field1;
	Child (){
		super("args"); //부모클래스의 기본생성자 호출 ()에 매게값 넣으면 매게값 있는 생성자로 호출
		System.out.println("Child() call.");
	}
	void method1() {
		System.out.println("method1() call.");
	}
	//부모클래스의의 메소드를 재정의. overrideing. 
	//부모 클래스의 메소드의 이름과 메게 변수 타입이 같아야 한다.
	@Override //아노테이션 : 부모클래스의 메소드(반환값, 메소드의이름, 매개값)체크.
	void method() { 
		System.out.println("Child method() call.");
	}
	
	@Override //Parent에는 이 기능 없는데 가능 한 이유는 모든 클래스는 기본적으로
	//Object라는 최상위 클래스를 상속받고 있기 때문임.
	public String toString() {
		return "Child [field1=" + field1 + "]";
	}
	
}// end class
