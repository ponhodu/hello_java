package co.edu.friends;

import java.util.Scanner;

public class FriendsPgm {

	private static FriendsPgm instance = new FriendsPgm();

	private FriendsPgm() {
	}

	public static FriendsPgm getinstance() {
		return instance;
	}

	Scanner scn = new Scanner(System.in);
	Friends[] myFriends = new Friends[100];

	// 1. 전화 번호 등록
	public void addFr() {
		System.out.println("전화 번호 등록");
		System.out.println("전화 번호 입력 >> ");
		int phoneNum = scn.nextInt();
		scn.nextLine();
		System.out.println("이름 입력 >> ");
		String name = scn.nextLine();
		System.out.println("생일 입력(09/17 형식으로) >> ");
		String bday = scn.nextLine();
		System.out.println("특징 입력 >>");
		String fig = scn.nextLine();

		Friends fr = new Friends(phoneNum, name, bday, fig);

		for (int i = 0; i < myFriends.length; i++) {
			if (myFriends[i] == null) {
				myFriends[i] = fr;
				break;
			}
		}
	}// end addFr

	// 2. 모든 번호 목록 보여주기
	public void frList() {
		System.out.println("모든 친구 목록");
		for (Friends fr : myFriends) {
			if (fr != null) {
				System.out.println(fr.toString());
			}
		}
	}

	// 3. 이름 검색 시 번호 찾기
	public void findFr() {
		System.out.println("친구 번호 찾기");
		System.out.println("이름 입력 >> ");
		String name = scn.nextLine();
		boolean check = false;
		for (Friends fr : myFriends) {
			if (fr != null && fr.getName() == (name)) {
				System.out.println(fr.toString());
				check = true;
			}
		}
		if (check = false) {
			System.out.println("해당 번호는 없는 번호 입니다.");
		}
	}

	// 4. 삭제
	public void delFr() {
		System.out.println("친구 삭제");
		System.out.println("번호 입력 >> ");
		int phoneNum = scn.nextInt();
		for (Friends fr : myFriends) {
			if (fr != null && fr.getNum() == (phoneNum)) {
				fr = null;
				System.out.println("번호가 삭제되었습니다.");
			}
		}
	}

	// 5. 매뉴
	public void exe() {

		boolean run = true;
		while (run) {
			System.out.println("친구 관리 프로그램 입니다");
			System.out.println("1. 전화 번호 등록 2. 모든 친구 보기 3. 친구 검색 4. 친구 삭제 5. 종료");
			System.out.println("메뉴 선택 >");

			int menu = scn.nextInt();
			switch (menu) {
			case 1:
				addFr();
				break;
			case 2:
				frList();
				break;
			case 3:
				findFr();
				break;
			case 4:
				delFr();
			case 5:
				run = false;
			default:
				System.out.println("잘못된 메뉴 입니다");
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}// end exe()

}// end of class
