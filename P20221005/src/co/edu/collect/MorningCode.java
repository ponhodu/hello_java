package co.edu.collect;

import java.util.ArrayList;
import java.util.Scanner;

class Employ {
	int empId;
	String empName;
	int salary;

	public Employ(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public Employ() {
	}

	@Override
	public String toString() {
		return "Employ [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

}

public class MorningCode {
	public static void main(String[] args) {
		String tok = "Hello World Good";
		Scanner scn = new Scanner(tok);
		Scanner scanner = new Scanner(System.in);// Ű���� �Է����� ���� �� �޾Ƶ��̴¿���

//		while (scn.hasNext()) //�о�� ��Ұ� �ִ��� üũ 
//			System.out.println(scn.next()); // ������ �����ڷ� ���, ������

		String[] toks = tok.split(" "); // ������ ��������, ������ ������,
		for (String str : toks) {
			System.out.println(str);
		}

		// ù��° �� => empId, �ι�° �� -> empName, ����° -> salary
		// Employee Ŭ������ �ν��Ͻ��� ����.
		// ArrayList�� �����ϱ�.
		// ���Ḧ �ϰ� ������ quit ����.
		// ���� �� for(�ݺ���) ���.

		ArrayList<Employ> list = new ArrayList<Employ>();
		Employ employ = new Employ();
		while (true) {
			System.out.println("�Է� >> ex)100 ȫ�浿 2500");
			System.out.println("�����ϰ� �ʹٸ� quit�� �Է��ϼ���");
			String inputVal = scanner.nextLine();
			String[] input = inputVal.split(" ");


			if (input[0].equals("quit")) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			if (input.length != 3) {
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			}
			list.add(new Employ(Integer.parseInt(input[0]), input[1], Integer.parseInt(input[2])));
		} // end of while
		for (Employ emp : list) {
			System.out.println(emp);
		}
	}
}
