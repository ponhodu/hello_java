package co.edu.inherit.friend;

public class DriverExe {
public static void main(String[] args) {
	Car car = new Car();
	Bus bus = new Bus();
	
	Driver driver = new Driver();
	driver.drive(car); //Vehicle인스턴스
	driver.drive(bus);
	
	//다형성 : 동일한 driver 메소드를 실행했는데 담겨있는 매게변수, 필드, 인스턴스에 따라 값이 달라지는거
	// -> 동일한 기능을 실행하는데 다른 결과가 나타나는 것. 
	
}
}
