package co.edu.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BirthExe {
	public static void main(String[] args) {

		String fileName = "src/co/edu/api/Birth.txt";
		File file = new File(fileName);
		
		Scanner scn = null;
		
		try {
			scn = new Scanner(file);
			while (true) {
				String str = scn.nextLine();
				if (str == null)
					break;
				
				//�����Դϴ�. �����Դϴ�.
				char sex = str.charAt(7);
				if(str.replace("-", "").charAt(6)%2 == 1) {
					System.out.println("�����Դϴ�");
				}else if(str.replace("-", "").charAt(6)%2 == 0) {
					System.out.println("�����Դϴ�");
				}else {//�� ��,�� ������ �߸��Ǹ� �߸��� ��ȣ�� �ν�.
					System.out.println("�߸��� ��ȣ �Դϴ�.");
				}
				
//				switch(sex) {
//				case '1' :
//				case '3' :
//					System.out.println("���ڳ׿�");
//					break;
//				case '2' :
//				case '4' :
//					System.out.println("���ڿ����~~���̻���");
//					break;
//				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {

		}
		System.out.println("end of prog");
	}
}
