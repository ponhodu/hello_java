package co.edu;

public class AppMain2 {
	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.staticMethod(); //error 아니고 warning
		
		Student.staticMethod();
		
		Math.random(); //정적메소드
		Math.round(.5); //정적메소드
		
		s1.setNum("111-111");
		s1.setName("홍길동");
		s1.setMajor("컴퓨터공학");
		s1.setAge(20);
		
		System.out.println(s1.getNum()); // String 초기값 = null
		System.out.println(s1.getAge()); // int 초기값 = 0 
		System.out.println(s1.showInfo());
		
		System.out.println("여기 ==>>" + s1);
		
		Student s2 = new Student();
		s2.setName("남도일");
		s2.setNum("111-222");
		s2.setMajor("탐정학");
		System.out.println(s2.showInfo());
		
		String[] hob = {"독서","자전거"};
		s1.setHobbies(hob);
		s1.addHobby("음악듣기");
		System.out.println(s1.getHobb());
		
		System.out.println(s2.getHobb());
		
		Student s3 = new Student();
		System.out.println(s3.getName());
		
		Student s4 = new Student("111-234","박이현");
		System.out.println(s4.showInfo());
		
		Student s5 = new Student("222-222", "송지은", "역사학과");
		System.out.println(s5.showInfo());
	}
}// end class
