package co.edu.board;

public class Board {
	private int bNum;
	private String bTitle;
	private String bContent;
	private String bWriter;
	private String bDate;
	private int cnt;
	
	public Board() {
		
	}
	public Board(int bNum, String bContent) {
		this.bNum = bNum;
		this.bContent = bContent;
	}
	
	public Board(int bNum, String bTitle, String bContent) {
		this.bNum = bNum;
		this.bTitle = bTitle;
		this.bContent = bContent;
	}
	
	public Board(int bNum, String bTitle, String bContent, String bWriter) {
		this.bNum = bNum;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bWriter = bWriter;
	}
	
	public Board(int bNum, String bTitle, String bContent, String bWriter, String bDate, int cnt) {
		this.bNum = bNum;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bWriter = bWriter;
		this.bDate = bDate;
		this.cnt = cnt;
	}
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		return "글 번호 : " + bNum + ", 제목 : " + bTitle + ", 글쓴이 : " + bWriter + ", 작성일 " + bDate + ", 조회수 :" + cnt;
	}
	public String getString() {
		return "글 번호 : " + bNum + ", 제목 : " + bTitle + ", 글쓴이 : " + bWriter + ", 작성일 " + bDate ;
	}
	
}
