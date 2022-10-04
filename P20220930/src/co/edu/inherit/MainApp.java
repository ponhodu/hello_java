package co.edu.inherit;

public class MainApp {
	public static void main(String[] args) {
		Child child = new Child(); //인스턴스만들기 //field1, methodl()
		child.method(); //Parent의 메소드
		child.method1(); //Child의 메소드
		
		Child2 child2 = new Child2();
		child2.method(); // 
		child2.method2();//Child2의 메소드
		
		Parent c1 = new Parent();
		c1 = new Child(); //부모클래스의 참조변수에 자식인스턴스 대입 가능.
		c1 = new Child2(); // 자동형변환(자식 인스턴스 => 부모인스턴스 )
		
//		c1 .method2(); //부모클래스의 멤버들만 호출가능.
		
		if(c1 instanceof Child2) {
			Child2 c2 = (Child2) c1; //강제형변환(casting)
			c2.method2();
		}
		
		Parent c3 = new Parent(); // c3은 parent의 인스턴스
		if(c3 instanceof Child2) { //c3이 Child2의 인스턴슫인지 확인 작업.
		Child2 c4 = (Child2) c3; //casting .
		c4.method2();
		}
		
		}
}// end class
