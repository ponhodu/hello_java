package co.edu.variable;

public class SortExe {
	public static void main(String[] args) {
		int[] numAry = {34, 21, 12, 9, 8, 7, 6, 51 ,74 };
		
		//반복적인 처리. 
		//numAry = {12,21,34} 순으로 , 작은 순으로 나열되게끔 
		//케이스 : n1 > n2 > n3 -> 어떻게하공
		//케이스 : n1 < n2 > n3 -> 어떻게 하는지. 위치 바꾸는 연습해오기 
		
		//오름 차순 배열
		//1 1) 배열 요소 갯수 n개 -> n-1번, n-2번, n-3번 ... n-1번 비교
//		if(numAry[0] > numAry[1]) { //첫번째 두번째 값 비교
//			int temp = numAry[0];
//			numAry[0] = numAry[1];
//			numAry[1] = temp;
//		}
//		if(numAry[1] > numAry[2]) { 
//			int temp = numAry[1];
//			numAry[1] = numAry[2]; 
//			numAry[2] = temp;
//		}
//		if(numAry[2] > numAry[3]) { 
//			int temp = numAry[2];
//			numAry[2] = numAry[3]; 
//			numAry[3] = temp;
//		}
//		
//		// 2)
//		if(numAry[0] > numAry[1]) { 
//			int temp = numAry[0];
//			numAry[0] = numAry[1]; 
//			numAry[1] = temp;
//		}
//		if(numAry[1] > numAry[2]) { 
//			int temp = numAry[1];
//			numAry[1] = numAry[2]; 
//			numAry[2] = temp;
//		}
//		
//		//3
//		if(numAry[0] > numAry[1]) { 
//			int temp = numAry[0];
//			numAry[0] = numAry[1]; 
//			numAry[1] = temp;
//		}
//		
//		//순서 출력
//		for(int n : numAry) {
//			System.out.print(n+ " "); //println은 줄바꿈하며 보여줌
//		}
		
		//반복문으루 변경작업
//	for( int j = 0; j<numAry.length-1; j++) {
//		for (int i = 0; i <numAry.length-1; i++) {
//			if(numAry[i] > numAry[i+1]) {
//			int temp = 0;
//			temp = numAry[i]; // 순서가 먼저 입력된 것의 값 지정
//			numAry[i] = numAry[i+1];
//			numAry[i+1] = temp;
//			}
//		}		
//	}
//		
	for(int i = 0; i<numAry.length-1; i++) {
		for(int j = 0; j<numAry.length-2; j++) {
			if(numAry[i] > numAry[i+1]) {
				int temp = 0;
				temp = numAry[i];
				numAry[i] = numAry[i+1];
				numAry[i+1] = temp;
			}
		}
	}
	for(int n : numAry) {
		System.out.print(n+ " "); //println은 줄바꿈하며 보여줌
	}

	
	}
}
