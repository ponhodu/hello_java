package co.edu.inherit.dbinterface;

public class mysqlDAO implements DaoService {

	@Override
	public void search() {
		System.out.println("mysql 조회.");		
	}

	@Override
	public void modify() {
		System.out.println("my sql 수정.");
	}

	@Override
	public void remove() {
		System.out.println("my sql 삭제.");
	}

	@Override
	public void insert() {
		System.out.println("mysql 저장.");
		
	}

	
	//	public void insert() {
//		
//	}
//	public void search() {
//		
//	}
//	public void delete () {
//		System.out.println("my sql 삭제.");
//	}
//	public void update() {
//		System.out.println("my sql 수정.");
//	}
}
