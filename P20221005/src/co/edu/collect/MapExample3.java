package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapExample3 {
	public static void main(String[] args) {
		// 1. ����. 2. ��ȸ. 3. ����
		Map<String, Integer> students = new HashMap<>();
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("1. ���� 2. ��ȸ 3.����");
			System.out.print("���� >> ");
			int menu = scn.nextInt();
			if(menu ==1) {
				System.out.println("�л� �̸� �Է�>>");
				String name = scn.nextLine();
				System.out.println("�л� ���� �Է�>>");
				int score = scn.nextInt();
				
				students.put(name, score);
			}else if(menu ==2) {
				System.out.println("��ȸ�� �л� �̸� �Է�>>");
				String searchName = scn.nextLine();
				System.out.println("���� : " + students.get(searchName));
//				Set<Entry<String,Integer>> stuSet = students.entrySet();// key + value = entry
//				for(Entry<String,Integer> stu: stuSet) {
//					System.out.println("�̸�: " + stu.getKey() + ", ���� : " + stu.getValue());
//				}
				
			}else if(menu ==3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}//end of while
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}//end main
}// end class example3
