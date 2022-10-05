package co.edu.emp.list;

import java.util.Calendar;

public class MethodCalendar {
		private static MethodCalendar instance = new MethodCalendar();
		private MethodCalendar() {};
		public static MethodCalendar getInstance() {
			return instance;
		}
	public void makeCal(int year, int month) {
		System.out.println("     >>  " + year + "년  " + month + "월  << ");
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		//요일
		for(String day : days ) {//자스의 for of / day는 변수 
			System.out.printf("%4s", day); //f는 포맷을 의미 string
		}
		System.out.println(); //줄 바꿈
		
		// 1일의 위치를 지정.
		for(int i = 0; i<getFirstDay(year, month); i++) {
			System.out.printf("%4s", " "); //4자리만큼의 string 뽑을게
		}
		
		//날짜 출력
		for (int i =1; i <=getLastDate(year, month); i++) {
			System.out.printf("%4d", i); //4자리 너비만큼 숫자 가져올게.
			if((i+getFirstDay(year, month)) % 7 == 0) {
				System.out.println(); //7일마다 줄 띄울게
			}
		}
	} //end of makeCal()
	
	public int getFirstDay(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month -1, 1);
		return cal.get(Calendar.DAY_OF_WEEK) -1; //1
	}//end of getFirstDay()
	
	public int getLastDate(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month -1, 1);
		return cal.getActualMaximum(Calendar.DATE);
		
	}//end of getLastDate.
}//end of class.

	