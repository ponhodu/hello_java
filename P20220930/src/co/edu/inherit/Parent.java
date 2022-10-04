package co.edu.inherit;

public class Parent /*extends Object*/ { //Object는 모든 클래스의 최 상위 클래스.
	//굳이 extends Object 명시하지 않아도 모든 클래스는 Object를 상속함.
	String field;
	Parent(){
		System.out.println("Parent() call.");
	}
	Parent(String args){ //기본 생성자
		System.out.println("Parent(String args) call."); //생성자를 호출한다.
	}
	
	void method() {
		System.out.println("parent method() call.");
	}
	@Override //Parent가 상속관계를 명시하지 않아도, 기본적으로 Object를 상속받고 있기 때문에 가능
	//to string은 Object의 메소드임
	public String toString() {
		return "Parent [field=" + field + "]";
	}
	
	
	
} //end class

