package co.edu.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExample {
	public static void main(String[] args) {
		ArrayList<String>strs = new ArrayList<String>();
		//�߰�.
		strs.add("��ȣ��");
		strs.add("������");
		strs.add("��¯��");
		
		strs.remove(0);//index 0�� ����
		strs.remove("��¯��");
		
		strs.add(0,"��¯��"); //0�� �ڸ��� �Է�, ���� 0�� �ڸ� ���� 1������ �ڷΰ�.
		
		System.out.println("collect ũ�� : " + strs.size());
		
		for(String str : strs) {
			System.out.println(strs);
		}
		
		for(int i =0; i<strs.size();i++) {
			System.out.printf("%d��°�� ���� %s\n", i, strs.get(i));
		}
		//�ݺ��ڸ� ����. 
		//iterator : ArrayList, HashSet�� ���� �÷����� �ݺ��ϴ� �� ����� �� �ִ� ��ü
		Iterator<String> itr = strs.iterator();
		while(itr.hasNext()) { //hasNext : ���� �ð� �ִ��� Ȯ���ϴ°�
			String result = itr.next(); //next : �������°�.>?��
			System.out.println(result);
		}
		
		//100����
		ArrayList<Integer> inAry = new ArrayList<Integer>();
		long start = System.nanoTime(); //
		for(int i =0; i<1000000; i++) {
			inAry.add(i);
		}
		long end = System.nanoTime(); //
		System.out.println("ary: " + (end - start));
		
		LinkedList<Integer> lnAry = new LinkedList<Integer>();
		start = System.nanoTime(); //
		for(int i =0; i<1000000; i++) {
			lnAry.add(i);
		}
		end = System.nanoTime(); //
		System.out.println("lna : " + (end - start));
	}//end main
}//end class
