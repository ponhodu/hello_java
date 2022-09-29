package co.edu.variable;

public class MethodCalendar {
	
	public static void main(String[] args) {
		makeCal(6); //호출
	}
	
	public static void makeCal(int month) {
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		//요일
		for(String day : days ) {//자스의 for of / day는 변수 
			System.out.printf("%4s", day); //f는 포맷을 의미 string
		}
		System.out.println(); //줄 바꿈
		
		// 1일의 위치를 지정.
		for(int i = 0; i<getFirstDay(month); i++) {
			System.out.printf("%4s", " "); //4자리만큼의 string 뽑을게
		}
		
		//날짜 출력
		for (int i =1; i <=getLastDate(month); i++) {
			System.out.printf("%4d", i); //4자리 너비만큼 숫자 가져올게.
			if((i+getFirstDay(month)) % 7 == 0) {
				System.out.println(); //7일마다 줄 띄울게
			}
		}
	} //end of makeCal()

	public static int getFirstDay(int month) {
		if(month ==9 ) {
			return 4;
		} else if(month ==8) {
			return 1;
		} else if(month ==7) {
			return 5;
		} else if(month ==6) {
			return 3; 
		}	else {
			return 0;
		}
	}//end of getFirstDay()
	
	public static int getLastDate(int month) {
		//switch..case 구문 
		switch(month) {
		case 9 : 
			return 30;
		case 8:
			return 31;
		case 7:
			return 31;
		case 6 :
			return 30;
		default : 
			return 30;
		}
	}//end of getLastDate.
}//end of class.

	