package co.dev;

import java.util.ArrayList;

public class StudExample {	
	public static void main(String[] args) {
		Student stud = new Student(101,"홍길동",80);
		String name1  = stud.getstudName();
		int score1 = stud.getScore();
		
		ArrayList<Student> studList = new ArrayList<>();
		studList.add(stud);
		studList.add(new Student(102, "김현수", 88));
		studList.add(score1, stud);
		studList.add(0, new Student(103, "박문치", 78));
		
		Student hong = new Student(201, "홍석천", 90);
		
		for(int i =0; i<studList.size(); i++) {
			if(studList.get(i).getstudName().equals("김현수")) {
				studList.add(i, hong);
				break;
			}				
		}
		//출력
		for(int i =0; i<studList.size(); i++) {
			System.out.println(studList.get(i).getstudName());
			
		}
		
		//학번기준으로 정렬
		ArrayList<Student> sortAry = new ArrayList<Student>();
		for(int i =0; i<studList.size(); i++) {
			for(int j =0; j<i; i++) {
				if(studList.get(i).getStudNo())
			}
			
		}
			
	}
}
