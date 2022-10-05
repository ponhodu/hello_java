package co.edu.emp.list;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
//		Calendar today = new Calendar();
		Calendar today = Calendar.getInstance(); //싱글톤 방식
		today.set(2022, 9, 1); //2022년 10월 1일
		System.out.println("요일 정보 : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("날짜 정보 : " + today.get(Calendar.DATE));
		System.out.println("월 정보 : " + (today.get(Calendar.MONTH) + 1));
		System.out.println("월말 정보 : " + today.getActualMaximum(Calendar.DATE));
	}
}
