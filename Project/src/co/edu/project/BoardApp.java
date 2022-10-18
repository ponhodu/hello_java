package co.edu.project;

import java.util.List;
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
				logId = id;
				break;
			} else {
				System.out.println("로그인 실패");
				continue;
			}
		}

		while (true) {
			System.out.println("♣ 떡잎마을 주민 게시판 ♣");
			System.out.println("1. 글 등록 2. 나의 글/댓글 3. 전체 글 보기 4. 상세 글 보기 5. 탈퇴  6. 주민 등록 7. 종료");
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

				brd = new Board(bNum, bTitle, bContent, bWriter,null);

				dao.inputBrd(brd);

			} else if (menu == 2) {
				System.out.println("<< 나의 글/댓글 >>");
				System.out.println("< 나의 글 목록>");
				List<Board> myBrd = dao.getBrd(logId);
				for (Board i : myBrd) {
					System.out.println(i.myString());
				}
				
				System.out.println("<나의 댓글 목록>");
				List<Reply> myRp = dao.getRp(logId);
				for (Reply i : myRp) {
					System.out.println(i.toString());
				}

				System.out.println("정정을 원하는 항목이 있나요? 1.네 2.아니오");
				int modify = Integer.parseInt(scn.nextLine());
				if (modify == 1) {
					System.out.println("1.글 수정 2. 글 삭제 3.댓글 수정 4.댓글 삭제");
					int subMenu = Integer.parseInt(scn.nextLine());
					if (subMenu == 1) {
						System.out.println("수정할 글 번호 >> ");
						int bNum = Integer.parseInt(scn.nextLine());
						System.out.println("수정할 내용 >> ");
						String bContent = scn.nextLine();
						brd = new Board(bNum, bContent);

						if (dao.searchBrd(bNum).getbWriter().equals(logId)) {
							dao.updateBrd(brd);
							System.out.println("수정 완료");
						} else {
							System.out.println("수정할 권한이 없습니다.");
						}

					} else if (subMenu == 2) {
						System.out.println("삭제할 글 번호 >> ");
						int bNum = Integer.parseInt(scn.nextLine());

						if (dao.searchBrd(bNum).getbWriter().equals(logId)) {
							dao.delBrd(bNum);
							System.out.println("삭제 완료");
						} else {
							System.out.println("삭제 권한이 없습니다.");
						}

					} else if (subMenu == 3) {
						System.out.println("수정할 댓글 번호 >> ");
						int reNum = Integer.parseInt(scn.nextLine());
						System.out.println("수정할 내용 >> ");
						String reContent = scn.nextLine();
						rp = new Reply(reNum, reContent);
						dao.updateRp(rp);
					} else if (subMenu == 4) {
						System.out.println("삭제할 댓글 번호 >> ");
						int reNum = Integer.parseInt(scn.nextLine());
						dao.delRp(reNum);
					}
				}
			} else if (menu == 3) {
				System.out.println("<< 전체 글 목록 >>");
				List<Board> everyBrd = dao.viewBrd();
				System.out.println("글번호 제목 글쓴이 날짜");
				for (int i = 0; i < everyBrd.size(); i++) {
					System.out.println(everyBrd.get(i));
				}

			} else if (menu == 4) {
				System.out.println("<< 글 상세 검색 >>");
				System.out.println("글 번호 >> ");
				int bNum = Integer.parseInt(scn.nextLine());

				Board x = dao.searchBrd(bNum);
				List<Reply> y = dao.searchRp(bNum);

				if (x != null) {
					System.out.println(x.showString());
					for (Reply i : y) {
						System.out.println(i.toString());
					}
					System.out.println("댓글 다실건지? 1. 댓글 등록 2.아니오");
					System.out.print(">> ");
					int subMenu = Integer.parseInt(scn.nextLine());
					if (subMenu == 1) {
						int boardNum = bNum;
						System.out.println("댓글 입력 >> ");
						String reContent = scn.nextLine();
						String reWriter = logId;

						rp = new Reply(boardNum, reContent, reWriter);
						dao.inputRp(rp);
					}
				} else {
					System.out.println("글이 없습니다.");
				}

			} else if (menu == 5) {
				System.out.println("<< 회원 탈퇴 >>");
				System.out.println(logId + " 님 탈퇴하시려면 비밀 번호를 입력해주세요");
				System.out.println("탈퇴 시 작성하신 모든 글/댓글도 사라집니다.");
				System.out.println(">>");
				String id = logId;
				String pw = scn.nextLine();
				dao.delUser(id, pw);
				dao.byeBrd(id);
				dao.byeRp(id);
				System.out.println("탈퇴 완료 되었습니다.");
			} else if(menu == 6) {
				System.out.println("<< 주민 등록 페이지 >>");
				String id = logId;
				if(dao.ckManager(id)) {
					System.out.println("아이디 >> ");
					String userId = scn.nextLine();
					System.out.println("비밀번호 >> ");
					String userPw = scn.nextLine();
					System.out.println("주민 이름 >>");
					String userName = scn.nextLine();
					
					dao.inputUser(userId, userPw, userName);
				} else {
					System.out.println("관리자 권한이 없습니다.");
				}			
			}else if (menu == 7) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}

}// end of class
