package co.edu.api;

import java.io.IOException;

public class StringExe2 {
	public static void main(String[] args) {
		System.out.println("abcDEF".toUpperCase());
		System.out.println("abcDEF".toLowerCase());
//		while(true) {
//			System.out.println("���ĺ� >> ");
//			try {
//				int bytes = System.in.read();
//				if(bytes == 122)
//					break;
//				
//				System.out.println("�Է°� : "+bytes);
//			} catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("End of prog");
//	}
}
	public static void changeCapital(String msg) {
		//�빮�� => �ҹ���, �ҹ��� -> �빮��
		//65~90���� �빮��, 97~122 �ҹ���, 97:65; �ҹ���-�빮�� : 32
		//aBcD = AbCd
		while(true){
		System.out.println("��� �Է��ϼ��� >> ");
			try {
				int bytes = System.in.read();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
