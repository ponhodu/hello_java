package co.edu.api;

import java.util.HashSet;
import java.util.Set;

class Student {
	String name;
	int age;

	@Override
	public String toString() {
		return "�л��� �̸��� " + name + "�̰�, ���̴� " + age + "�Դϴ�.";
	}

	// set �÷��� : ������ �ν��Ͻ��� ������� �ʴ� �÷���.
	@Override
	// �ν��Ͻ��� ��ġ�� �ּҰ��̶����, ��ü�� �����ִ� ��Ư�� ���� 16������ ������
	public int hashCode() {
		return age;
	}

	@Override
	// equals��� �޼ҵ忡 object������ ���� ��/�������θ� ���´�
	// Studnet�� name ������ ���ؼ� true/false �� ����.
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}
		Student str = (Student) obj;
//		return super.equals(obj);
		if (this.name.equals(str.name) && (this.age == str.age))
			return true;

		return false;
	}
}

//��� Ŭ������ �ֻ��� Object.
public class ObjectExe {
	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Object();

		System.out.println(obj.equals(obj2));// �ּҰ� ��

		Student s1 = new Student();
		s1.name = "Hong";
		s1.age = 10;
		Student s2 = new Student();
		s2.name = "Hong";
		s2.age = 10;
		String s3 = "Hong";
		
		System.out.println(s1.equals(s1));
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//set �÷��� : �������̽� -> ���� Ŭ������ ���ؼ� �ν��Ͻ� ���� 
		Set<Integer>set/*�������̽�*/ = new HashSet<Integer>(); /*���� Ŭ����*/
		set.add(new Integer(100));
		set.add(new Integer(110));
		set.add(new Integer(100));
		
		System.out.println("�÷����� ũ�� : " +set.size()); 
		//������ ���� ���� �ʱ� ������ 100�� �ߺ��Ǽ�  2���� ���.
		//set �÷����� ����?�� �ߺ��� ���Ѵ�. 
		
		//Set �÷��ǿ� Student �ν��Ͻ� ����� �������� ������ �ν��Ͻ� �Ǵ�.
		//hashCode(), equals() -> ����. 
		Set<Student> students = new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		System.out.println("�÷����� ũ�� : " + students.size()); 
	}

}
