package co.edu.inherit.friend;

public class Cat extends Animal {

	//Animal class의 추상 매소드 
	@Override
	public void eat() {
		System.out.println("고양이가 먹이를 먹습니다.");
	}

	@Override
	public void speak() {
		System.out.println("야옹야옹");
	}

}
