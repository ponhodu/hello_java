package co.edu.emp.list;

import java.util.ArrayList; //ctrl shift o

import co.edu.emp.Employee;

public class ListApp {
	public static void main(String[] args) {
		//배열 -> 컬렉션(ArrayList, HashSet, HashMap)
		String[] strAry = new String[10];
		//<String>으로 선언 안하면 Object -> 모든 클래스 담을 수 있다.
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("Employee");
		
		for (int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
//		list.add(new Employee()); //String만 올 수 있다고 제한 해줘서 안됨.
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(100);
//		intList.add("100"); int라고 제한 -> String은 안된다

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee());
		empList.add(new Employee(100, "홍길동", 1000));
		empList.add(new Employee(200, "김호두", 2000));
		empList.add(new Employee(300, "김초코", 3000));
		empList.add(new Employee(400, "박이현", 4000));
		
		String result = null;
		int salary = 0;
		for(int i=0; i<empList.size(); i++) {
			if(empList.get(i).getEmployeeId() == 200) {
				result = empList.get(i).getName();
				salary = empList.get(i).getSalary();
			}
		}
		System.out.println("이름은 " + result + "이고, 급여는 " + salary + "입니다.");
	}
}
