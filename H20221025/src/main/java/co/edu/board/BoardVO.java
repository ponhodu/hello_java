package co.edu.board;

import lombok.Data;

@Data
public class BoardVO {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private String writeDate; //굳이 date로 안해도 된다.
	private int clickCnt;
	private String image;
	
}
