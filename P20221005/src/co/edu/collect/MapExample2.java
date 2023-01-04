package co.edu.collect;

import java.util.HashMap;
import java.util.Map;

class Book{
	String bookCode;
	String author;
	String publish;
	
	public Book(String bookCode, String author, String publish) {
		this.bookCode = bookCode;
		this.author = author;
		this.publish = publish;
	}//������ �Լ�
	
	//hashCode, equals �޼ҵ� ������ ���̸� ��¼��...
	@Override
	public int hashCode() {
		return bookCode.hashCode(); //�Ȱ��� ���ڸ� �Ȱ��� ���� �������ش�.
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book target = (Book) obj;
			return this.bookCode.equals(target.bookCode);
		}else {
			return false;
		}
	}
}
public class MapExample2 {
	public static void main(String[] args) {
		Map<Book, Integer> map = new HashMap<>();
		map.put(new Book("123456", "��ȣ��", "�۸����ǻ�"),2000);//Ű��, value
		map.put(new Book("bagopa", "������", "�������ǻ�"),3000);
		map.put(new Book("javage", "���ü�", "�ڹ����ǻ�"),2000);
		
		Integer val = map.get(new Book("123456", "��ȣ��", "�۸����ǻ�"));
		System.out.println("�� : " + val);
	}
}
