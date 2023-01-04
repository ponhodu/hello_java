package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		//key : Integer, val : String
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "��¯��");
		map.put(200, "��¯��");
		map.put(300, "������");
		map.put(300, "������"); 
		//key�� �ߺ��� �� �� ����.-> ������ ������ �����Ͱ� ������� ���������� ��ü��
		
		map.remove(300); //���� 
		//300 �����Ѵٰ� null���� �� ��, ���������� ��ü���� �ʴ´�.
		
		System.out.println("�÷��� : " + map.size());
		
		System.out.println("val : " + map.get(300));
		//get() : key�� �־��ָ� �ش��ϴ� val ã����.
		
		//�ݺ��� ����
		Set<Integer> keySet = map.keySet(); //Ű�� ���ο� set�÷��ǿ� ����.
		for(Integer key : keySet) {
			System.out.println("Ű : " + key + ", �� : " + map.get(key));
		}
		System.out.println();
		
		Set<Entry<Integer,String>> entSet = map.entrySet();// key + value = entry
		for(Entry<Integer,String> ent: entSet) {
			System.out.println("Ű: " + ent.getKey() + ", �� : " + ent.getValue());
		}
		
		
	}
}
