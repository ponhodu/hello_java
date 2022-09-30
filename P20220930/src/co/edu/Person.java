package co.edu;

//사람 : 속성(이름, 나이, 키, 몸무게)
//		기능(달린다, 먹는다, 잔다)
public class Person {
	//속성 => 필드. 
	String name;
	int age;
	double height;
	double weight;
	//기능 -> 메소드.
	void run(){
		System.out.println(name + "가 달려용");
	}
	void eat(String food){
		System.out.println(name + "가 " + food + "을 먹어용");
	}
	void sleep(){
		System.out.println(name + "가 드르렁");
	}
}	
