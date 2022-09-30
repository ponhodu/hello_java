package co.edu;

//하나의 실행클래스(main)와 여러개의 라이브러리 클래스(person.java). 
public class AppMain {
	public static void main(String[] args) {
		//Object -> Class -> Instance
		Person kim = new Person();  //인스턴스 생성	
		kim.name = "김민기";
		kim.age = 20;
		kim.sleep();
		kim.eat("사과");
		
		Person lee = new Person();
		lee.name = "이순신";
		lee.age = 25;
		lee.sleep();
		lee.eat("생선구이");
//		System.out.println(kim);
		
		Student stu1 = new Student();
//		stu1.name = "호두";
//		stu1.num = "1-111";
//		stu1.major = "의학";
		stu1.setNum("1-1111"); //="1-111" 하면 안돼
		stu1.setName("호두");
		stu1.setMajor("의학");
		stu1.sleep();
		stu1.game();
		stu1.study();
		
		Student stu2 = new Student();
//		stu2.name = "신나리";
//		stu2.num = "2-222";
//		stu2.major = "디지몬";
		stu2.setName("신나리");
		stu2.setNum("2-2222");
		stu2.setMajor("디지몬");
		stu2.sleep();
		stu2.game();
		stu2.study();
		
		Student stu3 = new Student();
		
		Student[] students;
		students = new Student[] {stu1, stu2, stu3};
		for(Student stu : students) {
			System.out.println("학번 : " + stu.getNum() + ", 학생이름 : " + stu.getName() );
		}
		
		//상속 
		WorkMan wman = new WorkMan(); /*Workman에는 name 속성이 없지만,
		WorkMan이 Person을 상속받았기 때문에 name이라는 속성을 쓸 수 있다.*/
		wman.name = "신형만";
		wman.age = 30;
		
		StudentMan sman = new StudentMan();
		sman.school = "고등학교";
		sman.height = 164.3;
		
	}// end main
}//end class
