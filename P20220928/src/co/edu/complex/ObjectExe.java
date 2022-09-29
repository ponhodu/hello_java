package co.edu.complex;

import java.util.Scanner;

public class ObjectExe { // 객체 만들기
	public static void main(String[] args) {

		String s1 = "홍길동";
		int i1 = 20;
		double d1 = 162; // 162.0(promotion)

		Person p1 = new Person(); // 인스턴스 생성.//p1이라는 빈 공간 만들기
		p1.name = "박이현";
		p1.age = 29;
		p1.height = 162.3;
		System.out.println(p1);

		Person p2 = new Person();
		p2.name = "김경미";
		p2.age = 23;
		p2.height = 163.2;

		Person p3 = new Person(); // 인스턴스 생성.//p1이라는 빈 공간 만들기
		p3.name = "주소영";
		p3.age = 22;
		p3.height = 172.5;
		System.out.println(p3);

		System.out.println("이름: " + p1.name);
		System.out.println("나이: " + p1.age);
		System.out.println("키: " + p1.height);

		Person[] persons = { p1, p2, p3 };
		System.out.println(persons[1].name); // index는 0부터 시작 -> 1하면 두번째인 경미가 나옴
		System.out.println(persons[1].age);
		System.out.println(persons[1].height);

		// persons[2]의 값을 송지은으로 바꾸기.
//		persons[2].name = "송지은";  혹은 p3.name ="송지은"

		// p1변수값과 persons[0]값 비교.
		System.out.println(persons[0] == p1);

		// 반복 for 
		// 문자 비교 할 시 ==( 대신에 equals 쓰삼.
		// 김경미 이름 찾아서 나이 23 -> 22살로 바꾸기
//		for (int i = 0; i < persons.length; i++) {
//			if (persons[i].name == "김경미") {
//				persons[i].age = 22;
//			}
//		}
		
//		String kim ="김경미"; 문자열 리터럴
//		for (int i = 0; i < persons.length; i++) {
//			if (persons[i].name == kim) {
//				persons[i].age = 22;
//			}
//		}
		
		//변경할 이름을 입력하고, 변경할 나이를 입력해 변경하기.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("변경할 이름>>> ");
		String name = scn.nextLine();
		System.out.println("변경할 나이 >>. ");
		int age = scn.nextInt();
		for(int i = 0; i<persons.length; i++) {
			if(name.equals(persons[i].name)) {
				persons[i].age = age;
			}
		}
		
		// 전체 목록 출력
		for (int i = 0; i < persons.length; i++) {
			System.out.println(i + 1 + "번 째 이름 : " + persons[i].name + ", 나이 : " + persons[i].age);
		}
		
		String n1 = new String("홍길동");
		String n2 = new String("홍길동");
		String m1 = "홍길동";//인스팅스 선언 후 만든게 아니라서 m1 m2 주소가 같다.
		String m2 = "홍길동";
		
		System.out.println(n1 == n2);
		System.out.println(m1 == m2);
		
		
		
	}// end ObjectExe
}// end class
