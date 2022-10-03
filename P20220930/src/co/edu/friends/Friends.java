package co.edu.friends;

public class Friends {
	private int phoneNum;
	private String name;
	private String bday;
	private String fig;

	public Friends() {		
	}
	
	public Friends(int phoneNum, String name, String bday, String fig) {
		super(); // 상속, 있으나 없으나 상관 무
		this.phoneNum = phoneNum;
		this.name = name;
		this.bday = bday;
		this.fig = fig;	
	}
	
	
	void setNum(int num) {
		this.phoneNum = phoneNum;
	}
	public int getNum() {
		return this.phoneNum;
	}
	void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	void setBday(String bday) {
		this.bday = bday;
	}
	public String getBday() {
		return this.bday;
	}
	void setFig(String fig) {
		this.fig = fig;
	}
	public String getFav() {
		return this.fig;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 전화 번호 : " + phoneNum + ", 생일 : " + bday + ", 특징 : " + fig;
		
	}

}// end class
