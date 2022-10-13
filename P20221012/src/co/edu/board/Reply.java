package co.edu.board;

public class Reply {
	private int reNum;
	private int bNum;
	private String reContent;
	private String reWriter;
	private String reDate;
	
	//생성자 함수
	public Reply() {
		
	}
	
	public Reply(int bNum, String reContent, String reWriter) {
		this.bNum = bNum;
		this.reContent = reContent;
		this.reWriter = reWriter;
	}
	
	public Reply(int reNum, int bNum, String reContent, String reWriter, String reDate) {
		this.reNum =reNum;
		this.bNum = bNum;
		this.reContent = reContent;
		this.reWriter = reWriter;
		this.reDate = reDate;
	}
	
	//get/set
	public int getReNum() {
		return reNum;
	}
	public void setReNum(int reNum) {
		this.reNum = reNum;
	}
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public String getReContent() {
		return reContent;
	}
	public void setReContent(String reContent) {
		this.reContent = reContent;
	}
	public String getReWriter() {
		return reWriter;
	}
	public void setReWriter(String reWriter) {
		this.reWriter = reWriter;
	}
	public String getReDate() {
		return reDate;
	}
	public void setReDate(String reDate) {
		this.reDate = reDate;
	}
	
	@Override
	public String toString() {
		return "댓글 번호 : " + reNum + ", 원본 글 번호 : " + bNum
				+ ", 댓글 내용 : " + reContent + ", 댓쓴이 : " + reWriter + ", 작성 시간 :" + reDate;
	}
	
}
