package co.edu;

public class Student { // public 선언 -> 타 클래스에서도 사용가능.
	// 필드
	private String num; // private 붙여주면 캡슐화. 
	private String name;
	private String major;
	private int age; // 정수 값 23, 0, -12 나이라 음수값 들어가면 안됨. 그래서 프라이베이트 넣어주고
					//setAge라는 메소드 값을 만들어서 통제하겠다는거. 
	private String[] hobbies = new String[5]; //5개의 값을 넣을 수 있다.
	
	//  정적 메소드.  static 붙음.-> 인스턴스 안만들고도 사용 가능. (class.staticMethod 
	public static void staticMethod( ) {
		System.out.println("staticMethod call.");
	}
	
	// 생성자(필드의 값을 초기화) 
	// 생성자 오버로딩 (동일한 이름의 생성자를 여러버 정의)
	public Student() { //void없어서 메소드 아님.
		//매개값이 없는 생성자 -> 기본생성자
		this.name = "기본값";
		this.num = "000-000";
	}
	public Student(String num, String name) { //생성자를 이용해서 필드를 세워줌.
		this.num = num;
		this.name = name;
	}
	public Student(String num, String name, String major) {
		this(num, name); //기본 생성자.
		this.major = major;
	}
	
	// 매소드
	void setHobbies(String[] hobbies) { //매개값 하비
//		this.hobbies = hobbies;
		for(String hobby : hobbies) { 
			for(int i = 0; i<this.hobbies.length; i++) {
				if(this.hobbies[i]==null) {
					this.hobbies[i] = hobby;
					break;
				}
			}
		}
	}
	
	String[] getHobbies(String[] hobbies) {
		return this.hobbies;
	}
	String getHobb() {
		String str = "취미는 ";
		for(String hobby : hobbies) {
			if(hobby != null) {
				str += hobby + " "; // => str = str+ hobby + " ";
			}
		}
		str += "입니다.";
		return str;
	}
	//취미추가
	void addHobby(String hobby) {
		for(int i=0; i<hobbies.length; i++) {
			if(hobbies[i] == null) {
				hobbies[i] = hobby;
				break;
			}
		}
	}
	
	void setNum(String num) {
		this.num = num; 
	}
	String getNum() { //불러오기만 하는 메소드라 메개변수는 필요없다.
		return this.num;
	}
	
	void setAge(int age) {
		if (age < 0) {
			this.age = 0; //this.age는 필드 
		} else {
			this.age = age;
		}
	}
	int getAge() {
		return this.age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	
	void setMajor(String major) {
		this.major = major;
	}
	
	String getMajor() {
		return this.major;
	}
	// showInfo()
	// 이름 - 학번 - 전공 보여주는 기능 만들기
	public String showInfo() {
		return "이름은 " + this.name + "이고 학번은 " + this.num + "이고 전공은 " + this.major + "입니다.";
	}
	
	void study() {
		System.out.println(name + "는 공부해용 아좌좌");
	}

	void game() {
		System.out.println(name + "는 게임을 해요");
	}

	void sleep() {
		System.out.println(name + "는 잡니다. 드르렁");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
