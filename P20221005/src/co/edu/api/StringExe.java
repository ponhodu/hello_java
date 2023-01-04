package co.edu.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StringExe {
	public static void main(String[] args) {

		String fileName = "src/co/edu/api/Data.text";
		File file = new File(fileName);

		String searchKey = "��  ��"; //�� ��/ ��    �� ���� �ڹٷ� �ν��ϰԲ�.
		searchKey = searchKey.replace(" ", "");
		Scanner scn = null;
		
		try {
			scn = new Scanner(file);
			while (true) {
				String str = scn.nextLine();
				if (str == null)
					break;
				
				if(str.indexOf(searchKey) != -1) 
					System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {

		}
		System.out.println("end of prog");
	}
}
