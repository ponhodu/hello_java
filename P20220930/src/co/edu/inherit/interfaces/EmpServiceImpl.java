package co.edu.inherit.interfaces;

//구현클래스(인터페이스를 상속하는 클래스) 
public class EmpServiceImpl implements DaoService {
	//반드시 인터페이스의 메소드 들을 재정의 해줘야 한다.
	private String db;
	
	public EmpServiceImpl() {}
	public EmpServiceImpl(String db) {
		this.db = db;
	}
	
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	@Override
	public void insert() {
		System.out.println(db + "저장.");	
	}

	@Override
	public void search() {
		System.out.println(db + "조회.");	
	}

	@Override
	public void delete() {
		System.out.println(db + "삭제.");	
	}
 
}
