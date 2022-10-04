package co.edu.inherit.friend;

public class FriendApp {
	public static void main(String[] args) {
		//친구
		Friend frnd = new Friend("김호두", "010-1111-2222");
//		frnd.setName("김호두");
//		frnd.setPhone("010-1111-2222");
		
		UnivFriend univFrnd = new UnivFriend("김초코", "010-2222-3333", "경북대", "행정학과");
		ComFriend comFrnd = new ComFriend("유재석", "010-4545-2345", "MBC", "미디어부서");
	
		Friend [] friends = new Friend[5]; //부모클래스의 참조값을 담도록 배열.
		friends[0] =frnd;
		friends[1] = univFrnd;
		friends[2] = comFrnd;
		
		for(Friend friend : friends) {
			if(friend != null)
			System.out.println(friend.showInfo());
		}
	}
}
