package co.edu.variable;

import java.util.Scanner; //util에 Scanner클래스 가져올게~
import java.lang.System;

//java.lang 이 베이스 패키지 -> 따로 import 필요 없음.

public class GetSameval {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //사용자 입력값을 저장
		System.out.println("이름을 입력하세요 >>> ");
		String name = scn.nextLine(); //사용자 입력값을 읽어오고 반환.
		boolean isChecked =false;
		String[] names = {"김현지", "김유리","남미주","송지은"};
		for(int i = 0; i <names.length; i++) {
			// " 몇번 째 위치에 있습니다." 출력.
			if(names[i].equals(name)) { //문자열 비교는 문자열.equals(비교문자열)
			 System.out.println( i+1 + "번 째 위치에 있습니다."); 
			 isChecked = true;
			 break;
			}
		}
		if(!isChecked) { //!isChecked !는 not 이란 뜻 false
			System.out.println("입력값이 없습니다.");
		}
		System.out.println("입력값 : " + name);
		scn.close();
	}
}
