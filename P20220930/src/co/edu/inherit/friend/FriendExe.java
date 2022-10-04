package co.edu.inherit.friend;

import java.util.Scanner;

public class FriendExe {
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];
	//ģ����� - �б�/ȸ��/�׿� ģ��..
	public void exe() {
		
		while(true) {
			System.out.println("1. ģ�� ��� 2. ģ�� ��ȸ 3. ����");
			System.out.println("���� >>>");
			int menu = scn.nextInt();
			scn.nextLine(); 
			if(menu ==1) {
				System.out.println("1. ȸ��ģ�� 2. �б�ģ�� 3.�׿� ģ��");
				int subMenu = scn.nextInt();
				scn.nextLine();
				if(subMenu ==1) {
					addComFriend();
				}else if(subMenu ==2) {
					addUnivFriend();
				}else if(subMenu ==3) {
					addFriend();
				}else {
					System.out.println("�߸��� �޴��� �����߽��ϴ�.");
				}				
			}else if(menu ==2) {
				searchFriend();
			}else if(menu ==3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� �޴��� �����߽��ϴ�.");
			}
		}
		System.out.println("���α׷� ����.");
	}// end of exe()
	//�߰� �޼ҵ� ����
	public void addComFriend() {
		System.out.println("ģ�� �̸� >>");
		String name = scn.nextLine();
		System.out.println("��ȭ ��ȣ >>");
		String phone = scn.nextLine();
		System.out.println("ȸ��� �Է� >>");
		String company = scn.nextLine();
		System.out.println("�μ��� �Է� >>");
		String dept = scn.nextLine();
		
		ComFriend comFrnd = new ComFriend(name, phone, company, dept);
		for (int i = 0; i <friends.length; i++) {
			if( friends[i] == null) {
				friends[i] = comFrnd;
				break;
			}
		}
	}//end addComFriend;
	
	public void addUnivFriend() {
		System.out.println("ģ�� �̸� >>");
		String name = scn.nextLine();
		System.out.println("��ȭ ��ȣ >>");
		String phone = scn.nextLine();
		System.out.println("�б��� �Է� >>");
		String univ = scn.nextLine();
		System.out.println("������ �Է� >>");
		String major = scn.nextLine();
		
		UnivFriend univFrnd = new UnivFriend(name, phone, univ, major);
		for (int i = 0; i <friends.length; i++) {
			if( friends[i] == null) {
				friends[i] = univFrnd;
				break;
			}
		}
	}//end addUnivFriend
	
	public void addFriend() {
		System.out.println("ģ�� �̸� >>");
		String name = scn.nextLine();
		System.out.println("��ȭ ��ȣ >>");
		String phone = scn.nextLine();
		
		Friend frnd = new Friend(name, phone);
		for (int i = 0; i <friends.length; i++) {
			if( friends[i] == null) {
				friends[i] = frnd;
				break;
			}
		}
	}// end addFriend
	
	public void searchFriend() {
		//�Ǽ���, �ǹ���, ���α� �� ġ�� ����, ���� �����Բ�.
		System.out.println("ã�� ģ�� �̸��� �Է��ϼ���.");
		String name = scn.nextLine();
		boolean check = false;
		for(int i = 0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getName().contains(name)) {
				System.out.println(friends[i].showInfo());
				check = true;
			}
		}
		if(check == false) {
			System.out.println("�˻��� �̸��� �������� �ʽ��ϴ�.");
		}
	}
	
}//end of class