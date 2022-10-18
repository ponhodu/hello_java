package co.edu.memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoManager {
<<<<<<< HEAD
	
	List<Memo> memoStorage = new ArrayList<>(); // 정보 담아놓기 위한 컬렉션
=======
	List<Memo> memoStorage = new ArrayList<>();//정보 담을 컬렉션
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
	File file = new File("C:/Temp/memobook.dat");
	Scanner scn = new Scanner(System.in);
	
<<<<<<< HEAD
	// 싱글톤
=======
	//싱글톤
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
	private static MemoManager instance = new MemoManager();
	private MemoManager() {
		readFromFile();
	}
	public static MemoManager getInstance() {
		return instance;
	}
	
<<<<<<< HEAD
	// 추가
=======
	// 추가.
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
	public void inputData() {
<<<<<<< HEAD
		System.out.print("번호>> ");
=======
		System.out.print("번호 > ");
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
		int no = Integer.parseInt(scn.nextLine());
<<<<<<< HEAD
		System.out.print("날짜>> ");
=======
		System.out.print("날짜 > ");
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
		String date = scn.nextLine();
<<<<<<< HEAD
		System.out.print("내용>> ");
=======
		System.out.println("내용 > ");
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
		String content = scn.nextLine();
		
<<<<<<< HEAD
		memoStorage.add(new Memo(no, date, content)); // 메모라는 인스턴스를 담을 수 있는 인스턴스
		
=======
		memoStorage.add(new Memo(no, date, content));
		System.out.println("저장이 완료 되었습니다.");
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
	}
	
<<<<<<< HEAD
	// 조회(날짜를 입력받으면 해당되는 날짜의 번호를 모두 출력)
=======
	//조회. 기준 - 날짜
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
	public void searchData() {
<<<<<<< HEAD
		System.out.print("날짜>> ");
=======
		System.out.println("날짜 >");
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
		String sDate = scn.nextLine();
		boolean exists = false;
		for(int i=0; i<memoStorage.size(); i++) {
			if(sDate.equals(memoStorage.get(i).getDate())) { //memoStorage.get(i)의 날짜를 get으로 가져와서 비교하기
				System.out.println(memoStorage.get(i).toString());
				exists = true;
			}
		}
		if(!exists) {
			System.out.println("해당 날짜의 메모가 없습니다.");
		}
	}
	
<<<<<<< HEAD
	// 삭제(번호를 입력해주면 한 건 삭제)
=======
	//번호를 입력하면 한건 삭제.
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
	public void deleteData() {
<<<<<<< HEAD
		System.out.print("번호>> ");
		int dNo = Integer.parseInt(scn.nextLine());
=======
		System.out.println("번호 >> ");
		int sNo = Integer.parseInt(scn.nextLine());
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
		boolean exists = false;
		for(int i=0; i<memoStorage.size(); i++) {
			if(dNo == memoStorage.get(i).getNo()) {
				memoStorage.remove(i);
				exists = true;
<<<<<<< HEAD
				System.out.println("삭제 완료");
=======
				System.out.println("삭제가 완료 되었습니다.");
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
			}
		}
		if(!exists) {
			System.out.println("해당 번호의 메모가 없습니다.");
		}
	}
	
<<<<<<< HEAD
	// 프로그램이 시작되면 파일을 읽어서 데이터를 memoStorage에 담아주는 기능
=======
	//프로그램 실행 시  파일을 읽어서 데이터 memoStorage 기능.
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
	public void readFromFile() {
		// try with resource라는 예외처리 기능
		try( FileInputStream fis = new FileInputStream(file);
			 ObjectInputStream ois = new ObjectInputStream(fis);
			){
			
<<<<<<< HEAD
			memoStorage = (List<Memo>) ois.readObject(); //있으면 담아주고
			
		}catch(Exception e) { // 없으면 그냥 리턴
//			e.printStackTrace();
			return;
=======
			memoStorage = (List<Memo>) ois.readObject(); //파일 리턴(바이트 -> 객체)
		} catch(Exception e) {
//			e.printStackTrace(); 
			return; //없으면 어쩔수 없지 모 ㅋㅋ
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
		}
	}
	
<<<<<<< HEAD
	//종료하면 파일 저장
=======
	//종료하면 파일에 저장갈겨.
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
	public void storeToFile() {
<<<<<<< HEAD
		try( FileOutputStream fos = new FileOutputStream(file);
			 ObjectOutputStream oos = new ObjectOutputStream(fos);
			){
			oos.writeObject(memoStorage); // 파일에 저장하겠다는 의미
		}catch(Exception e){
=======
		try(FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos); 
		) {
			oos.writeObject(memoStorage); //파일저장(객체 -> 바이트배열)
		}catch(Exception e) {
>>>>>>> branch 'master' of https://github.com/ponhodu/hello_java.git
			e.printStackTrace();
		}
	}
}