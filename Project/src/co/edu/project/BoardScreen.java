package co.edu.project;

import java.awt.BorderLayout;

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
		new BoardScreen();
	}
}
