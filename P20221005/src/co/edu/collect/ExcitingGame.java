package co.edu.collect;

import java.util.ArrayList;
import java.util.Scanner;

public class ExcitingGame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		long gameStart = System.currentTimeMillis();
		
		String target = "Sour sweet grapes";
		String[] targetAry = target.split(" ");
		ArrayList list = new ArrayList();
		for (int i = 0; i < targetAry.length; i++) {
			list.add(targetAry[i]);
		}
		System.out.println(target);

		
		while (true) {
			System.out.println("\nġ���� >> ");
			String input = scn.nextLine();
			if (list.size() == 0) {
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals(input)) {
					list.remove(i);
				}

			}
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%s ", list.get(i));

			}
		}
		long gameEnd = System.currentTimeMillis();
		
		long during = (gameEnd - gameStart); // ms���� ����
		// 1*60*1000 + 30*1000 = 63000/60000 ��, 63000$60000 = ��
		long min = during/60000;
		long sec = (during%60000)/1000;
		if(min==0 && sec<5) {
		System.out.println("�ҿ�ð� : " + min + "�� " + sec + "��");
		} else {
			System.out.println("�й���");
		}
		

	}
}
