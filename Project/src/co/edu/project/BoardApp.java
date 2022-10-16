package co.edu.project;

import java.util.Scanner;

import co.edu.project.Board;

public class BoardApp {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		Board brd = new Board();
		Reply rp = new Reply();
		String logId = null;
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("<< 로그인 >>");
			System.out.println("아이디 >> ");
			String id = scn.nextLine();
			System.out.println("비밀번호 >> ");
			String pw = scn.nextLine();

			if (dao.login(id, pw)) {
				System.out.println("로그인 성공");
				id = logId;
				break;
			} else {
				System.out.println("로그인 실패");
				continue;
			}
		}

		while (true) {
			System.out.println("<< 떡잎마을 주민 커뮤니티 >>");
			System.out.println("1. 글 등록 2. 나의 글/댓글 3. 전체 글 보기 4. 상세 글 보기 5. 탈퇴 6. 종료");
			System.out.print(">>");
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				System.out.println("<< 글 등록 페이지 >>");
				System.out.println("글 번호 >> ");
				int bNum = Integer.parseInt(scn.nextLine());
				System.out.println("글 제목 >> ");
				String bTitle = scn.nextLine();
				System.out.println("글 내용 >> ");
				String bContent = scn.nextLine();
				String bWriter = logId;

				brd = new Board(bNum, bTitle, bContent, bWriter);

				dao.inputBrd(brd);

			} else if (menu == 2) {
				System.out.println("<< 나의 글/댓글 >>");
				System.out.println("< 나의 글 목록>");
				dao.getBrd(logId);
				System.out.println("<나의 댓글 목록>");
				dao.getRp(logId);

				System.out.println("정정을 원하는 항목이 있나요? 1.네 2.아니오");
				int modify = Integer.parseInt(scn.nextLine());
				if (modify == 1) {
					System.out.println("1.글 수정 2. 글 삭제 3.댓글 수정 4.댓글 삭제");
					int subMenu = Integer.parseInt(scn.nextLine());
					if (subMenu == 1) {
						dao.updateBrd();
					} else if (subMenu == 2) {
						dao.delBrd();
					} else if (subMenu == 3) {
						dao.updateRp();
					} else if (subMenu == 4) {
						dao.delRp();
					}
				} else {
					break;
				}
			} else if (menu == 3) {
				System.out.println("<< 전체 글 목록 >>");

				dao.viewBrd();

			} else if (menu == 4) {
				System.out.println("<< 글 상세 검색 >>");

				dao.searchBrd(bNum);

				dao.searchRp(bNum);

				System.out.println("댓글 다실건지? 1. 댓글 등록");
				System.out.print(">> ");
				int subMenu = Integer.parseInt(scn.nextLine());
				if (subMenu == 1) {
					dao.inputRp();
				}

			} else if (menu == 5) {
				System.out.println("회원 탈퇴");
				dao.goodbye();

			} else if (menu == 6) {
				System.out.println("종료합니다.");
				dao.save();
				break;
			}
		}
	}

}// end of class
