package co.edu.except;

public class RectPrint {
	public static void main(String[] args) {
		int cnt = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", cnt++);
			}
			System.out.println();
		}
		System.out.println();
		
		int num = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", num = i + (j * 5));
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < 26; j = j + 5) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}
}
