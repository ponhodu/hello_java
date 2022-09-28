package co.edu.variable;

public class SortExe {
	public static void main(String[] args) {
		int[] numAry = {34, 21, 12};
		
		//반복적인 처리. 
		//numAry = {12,21,34} 순으로 , 작은 순으로 나열되게끔 
		//케이스 : n1 > n2 > n3 -> 어떻게하공
		//케이스 : n1 < n2 > n3 -> 어떻게 하는지. 위치 바꾸는 연습해오기 
		
		if(numAry[0] > numAry[1]) { //34 > 21
			int temp = numAry[0];
			numAry[0] = numAry[1]; //21이란 값
			numAry[1] = temp;
		}
		
		for(int n : numAry) {
			System.out.println(n);
		}
	}
}
