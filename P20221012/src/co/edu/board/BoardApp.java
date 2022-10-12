package co.edu.board;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


//main - 등록하는 메세지 ,메뉴 출력 등등 
public class BoardApp {
	public static void main(String[] args) {
	BoardDAO dao = new BoardDAO();	
	Scanner scn = new Scanner(System.in);
	Board brd = null;
	
	//1. 글동록 2. 글 수정 3. 글 삭제 4. 글목록 5. 상세조회 6. 종료
	while(true) {
		System.out.println("1.글 등록 2.글 수정 3.글 삭제 4.글 목록 5. 상세 조회 6. 종료");
		System.out.print("메뉴 선택 >> ");
		int menu = Integer.parseInt(scn.nextLine());
		
		if(menu == 1) {
			System.out.println("글 등록");
			System.out.println("글 번호 >>");
			int bNum = Integer.parseInt(scn.nextLine());
			System.out.println("글 제목 >>");
			String bTitle = scn.nextLine();
			System.out.println("글 내용 >>");
			String bContent = scn.nextLine();
			System.out.println("작성자 >>");
			String bWriter = scn.nextLine();
			System.out.println("작성 일시 >>");
			String bDate = scn.nextLine();
			
			brd = new Board(bNum, bTitle, bContent, bWriter, bDate);
			dao.insert(brd);
			
		}else if(menu ==2) {
			
			System.out.println("글 수정");
			System.out.print("수정할 글 번호 >>");
			int bNum = Integer.parseInt(scn.nextLine());
			System.out.println("글 내용 >>");
			String bContent = scn.nextLine();
			
			brd = new Board(bNum, bContent);	
			dao.update(brd);
			
		}else if(menu ==3) {
			System.out.println("글 삭제");
			System.out.print("삭제할 글 번호 >>");
			int bNum = Integer.parseInt(scn.nextLine());
			if(dao.delete(bNum)) {
				System.out.println("삭제 완료");
			}else {
				System.out.println("삭제할 사번이 없습니다");
			}
			
		}else if(menu ==4) {
			System.out.println("글 목록");
			List<Board> boards = dao.search();
			for(Board i : boards) {
				System.out.println(i);
			}
			
		}else if(menu ==5) {
			System.out.println("상세 조회");
			System.out.println("글 번호 >> ");
			
			int bNum = Integer.parseInt(scn.nextLine());
			
			Board x = dao.getBrd(bNum);
			System.out.println(x);
			
		}else if(menu ==6) {
			
			System.out.println("프로그램을 종료합니다");
			break;
		}else {
			System.out.println("메뉴를 잘못 입력하셨습니다. ");
		}
	}
	}

}
