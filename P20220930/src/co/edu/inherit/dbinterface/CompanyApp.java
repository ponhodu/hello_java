package co.edu.inherit.dbinterface;

public class CompanyApp {
	public static void main(String[] args) {
		//추가, 수정, 삭제, 조회 기능.
//		mysqlDAO dao = new mysqlDAO();
//		dao.insert();
//		dao.update();
//		dao.search();
//		dao.delete();
		
//		OracleDAO dao = new OracleDAO();
//		dao.add();
//		dao.modify();
//		dao.find();
//		dao.remove();

		DaoService dao = new mysqlDAO(); //ver.1
		dao = new OracleDAO(); //ver.2
		dao.insert();
		dao.modify();
		dao.remove();
		dao.search();
		
		//익명구현객체 : 인터페이스 구현 코드.
		DaoService anonym = new DaoService() { //인스턴스는 못 만들지만, 안에 있는 메소드는 구현하겠다.

			@Override
			public void search() {
				System.out.println("익명db 조회.");
			}
			@Override
			public void modify() {	
				System.out.println("익명db 수정.");
			}
			@Override
			public void remove() {
				System.out.println("익명db 삭제.");
			}
			@Override
			public void insert() {
				System.out.println("익명db 입력.");
			} 
			
		};
		anonym.insert();
		anonym.search();
		anonym.modify();
		anonym.remove();
	}
}//end class
