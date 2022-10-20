package co.edu.project;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.*;

public class BoardScreen extends JFrame {
	
	MyBoardApp app = new MyBoardApp();
	
	public BoardScreen() {
		setTitle("♣떡잎마을 주민 게시판♣");
		setSize(350, 300);
		setLayout(new BorderLayout());
		
		//pannel
		
		
	}
	
//	public login() {
//		
//	}
	
	
	public static void main(String[] args) {
		MyBoardDAO dao = new MyBoardDAO();
		new BoardScreen();
		List<MyBoard> everyBrd = dao.viewBrd();
		for(int i= 1; i<=(everyBrd.size()/5)+1; i++) {
			System.out.print(i + " ");
		};
		
		


	}
}
