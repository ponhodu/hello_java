package co.edu.collect;

import java.util.Stack;
//stack : ���Լ���

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
		//�߰�
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(60));
		coinBox.push(new Coin(80));
		
		//��� isEmpty = false : ���� ����.
		while(!coinBox.isEmpty()) {//���� ���� ������ ��� ���ּ���
			Coin coin = coinBox.pop(); // ������ �ν��Ͻ����� ����������.
			System.out.println("������ ����" + coin.getVal());
		}
	}
}//end classStackExsmple
