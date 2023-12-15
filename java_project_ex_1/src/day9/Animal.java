package day9;

public class Animal {

	// 1. name , age 변수 선언
	// 2.생성자 만들기 2-1.기본생성자 생성 2- 2.name받아서 초기화 생성자 생성
	// 3.name을 리턴 해주는 매소드 생성(getName)
	// 4.동물 이름은 000입니다. 출력해주는 메소드
	// 5.age를 리턴해주는 메소드 생성(getAge)
	//필드 생성
	String name;
	int age ;
	
	//생성자 만들기
	Animal(){
		
	}
	
	Animal(String name){
		this.name = name;
	}
	
	//메소드 생성
	String getName() {
		return name;
	}
	void print() {
		System.out.println("동물 이름은 " + name + " 입니다");
	}
	int getAge() {
		return this.age;
	}

	
}// main
