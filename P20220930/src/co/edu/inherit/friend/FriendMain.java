package co.edu.inherit.friend;

public class FriendMain {
	public static void main(String[] args) {
	
	final String constVar = "Hello"; //final이 들어가면 바꿀수 없음 -> 재할당 불가능 
//	constVar = "World"; //변수.(Const Variable)
	FriendExe app = new FriendExe();
	app.exe();
	}
}
