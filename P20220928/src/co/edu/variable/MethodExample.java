package co.edu.variable;

public class MethodExample {
	//가로, 세로 -> 넓이 구하기
	public static int getArea(int w, int h) {
		int res = w * h;
		return res;
	}
	
	//배열요소의 각 합
	public static int sumAry(int[] ary) {
		int sum = 0;
		for(int i = 0; i<ary.length; i++) {
			sum = sum + ary[i];
		}
		return sum;
	}
	
	//두수의 나눈 결과를 반환.
	// 실수. float , double (float보다 double이 담을 수 있는 값이 더 많음)
	public static double divide(double n1, double n2) {
		double result =  n1 / n2; 
		return result;
	}
	
	//두수를 나누는 작업 . 매개변수를 int 지정
	public static double divide(int n1, int n2) {
		// 1bit * 8 => 1byte.
		// 유형 : byte(1), short(2), int(4), long(8)
		// 	   : float(4), double(8)
		if(n2 == 0) { //int 0 나누면 오류 나서, 이런 if문을 추가해준듯.
			return 0;
		}
		double result = (double) n1/n2; // 3.0/2 => 1.5 연산은 동일 타입끼리만 가능. 
					//->  다른 타입끼리 연산 시 더 큰 타입으로 변환 후 연산됨.
					// (double)처럼 사용자가 직접 타입 변환 행위 - 캐스팅. 자동으로 따라오는거 - 프로모션
		return result;
	}
	
	public static void main(String[] args) {
		int result = getArea(20, 15);
		System.out.println("전체 너비는 " + result + "입니다.");
		
		int [] intAry = {23, 45, 12};
		result = sumAry(intAry);
		System.out.println("전체 배열요소의 합계는 " + result + "입니다.");
//		int sum = 0;
//		for(i = 0; i<intAry.length; i++) {
//			sum = sum + intAry[i];-
		
		int [] intAry2 = {22,33,44,55};
		result = sumAry(intAry2);
		System.out.println("전체 배열요소의 합계는 " + result + "입니다.");
		
		
		
		double d1 = 23.4567;
		double d2 = 12.34;
		double d3 = d1 + d2;
		
		d3 = divide(d1, d2);
		System.out.println("나눈 결과는 " + d3 + "입니다.");
		
		d3 = divide(3,2);
		System.out.println("나눈 결과는 " + d3);
		}
	}


