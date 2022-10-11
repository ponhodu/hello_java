package co.edu.collect;

import java.util.Stack;

class Coin{
	private int val;
	public Coin(int val) {
		this.val = val;
		
	}
	public int getVal() {
		return val;
	}
}//end class Coin

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		//추가
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(60));
		coinBox.push(new Coin(80));
		
		//출력 isEmpty = false : 값이 있음.
		while(coinBox.isEmpty()) {//값이 있을 동안은 출력 해주세욘
			Coin coin = coinBox.pop(); // 마지막 인스턴스부터
			System.out.println(coin.getVal());
		}
	}
}//end classStackExsmple
