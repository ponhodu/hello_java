package co.edu.variable;

public class GetMaxVal {
	public static void main(String[] args) {
		int[] randomAry = new int[5]; //배열 크기 설정 - 정수 5개 넣을 수 있다.
		randomAry[0] = (int) (Math.random() * 100) +1 ; //Math. random - 0 ~ 1 사이의 임의수 생성.
					//실수 -> 정수로 바꾸겠습니다. *100 덕에 범위가 0~ 100사이의 범위로 변함. +1 -> 1부터 10사이 
		randomAry[1] = (int) (Math.random() * 100) +1 ;
		randomAry[2] = (int) (Math.random() * 100) +1 ;
		randomAry[3] = (int) (Math.random() * 100) +1 ;
		randomAry[4] = (int) (Math.random() * 100) +1 ;
		
		int maxVal = 0; //배열 요소 중 가장 큰 값을 저장할 변수 선언.
		int minVal = 100;
		for(int i = 0; i<5; i++) {
			System.out.println(randomAry[i]);
			//maxVal 변수에 두 값을 비교해서 큰 값을 담기.
			if(randomAry[i] > maxVal) {
				maxVal = randomAry[i];
			}
			if(randomAry[i] < minVal) {
				minVal = randomAry[i];
			}
		}
		System.out.println("생성된 배열의 임의의 값중 최대값 -> " + maxVal);
		System.out.println("생성된 배열의 임의의 값중 최소값 -> " + minVal);
		
	}
}
