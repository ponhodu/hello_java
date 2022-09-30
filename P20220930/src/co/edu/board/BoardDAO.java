package co.edu.board;

import java.util.Scanner;

//기능만
public class BoardDAO {
	//singleton방식의 인스턴스 생성.
	private static BoardDAO instance = new BoardDAO();
	private BoardDAO() {}
	public static BoardDAO getInstance() {
		return instance;
	}//생성자 호출하는 방식 제한 -> 외부에서 접근할 수 없다.
	
	Scanner scn = new Scanner(System.in);
	Board[] myBoards = new Board[100];

	// 1. 글등록
	public void addBoard() {
		System.out.println("글 등록 기능");
		System.out.println("글 번호 입력 >> ");
		int bNo = scn.nextInt();
		scn.nextLine();
		System.out.println("글 제목 입력 >> ");
		String title = scn.nextLine();
		System.out.println("글 내용 입력 >> ");
		String content = scn.nextLine();

		Board brd = new Board(bNo, title, content);
		// 배열 등록
		for (int i = 0; i < myBoards.length; i++) {
			if (myBoards[i] == null) {
				myBoards[i] = brd;
				break;
			}
		}
	} // end addBoard();

	// 2. 글목록
	public void boardList() {
		System.out.println("글 목록 확인");
		for (Board brd : myBoards) {
			if (brd != null) {
				System.out.println(brd.toString());
			}
		}
	}

	// 3. 글 상세보기
	public void boardDetail() {
		System.out.println("상세보기 기능.");
		System.out.println("글 번호 입력 >> ");
		int bNo = scn.nextInt();
		
//		for(int i=0; i<myBoards.length; i++) {
//			if(myBoards[i] != null && myBoards[i].getBoardNo()==(bNo)) {
//				System.out.println(myBoards[i].toString());
//			}
		for (Board brd : myBoards) {
			if(brd != null && brd.getBoardNo() ==(bNo)) {
				System.out.println(brd.toString());
			}
		}
	}

	// 4. 글삭제
	public void delBoard() {
		System.out.println("글 삭제 기능.");
		System.out.println("글 번호 입력 >> ");
		int bNo = scn.nextInt();
		for(int i=0; i<myBoards.length; i++) {
			if(myBoards[i] != null && myBoards[i].getBoardNo()==(bNo)) {
				myBoards[i] = null;
			}
		}
		
	}

	// 5. 전체 메뉴
	public void exe() {

		boolean run = true;
		while (run) {
			System.out.println("1. 글 등록 2. 글 목록 3. 글 상세보기 4. 글 삭제 9. 종료");
			System.out.print("선택 >> ");

			int menu = scn.nextInt();
			switch (menu) {
			case 1:
				addBoard();
				break;
			case 2:
				boardList();
				break;
			case 3:
				boardDetail();
				break;
			case 4:
				delBoard();
				break;
			case 9:
				run = false;
			default:
				System.out.println("잘못된 메뉴 입니다.");
			}

		} // end of while
		System.out.println("프로그램 종료.");
	}// end of exe()
}// end class
