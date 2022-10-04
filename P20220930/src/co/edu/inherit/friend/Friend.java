package co.edu.inherit.friend;

public /*final*/ class Friend { //final class 상속할 수 없음.
	private String name;
	private String phone;
	//생성자
	public Friend(String name, String phone) {
		super(); //object의 생성자 호출 
		this.name = name;
		this.phone = phone;
	}
	public Friend() {} //기본 생성자 정의.
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return this.name;
	}
	public String getPhone() {
		return this.phone;
	}
	public String showInfo() {
		return "친구의 이름은 " + name  + ", 연락처는 " + phone;
	}
}
