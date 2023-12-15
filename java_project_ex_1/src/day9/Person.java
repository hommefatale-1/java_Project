package day9;

public class Person {

	// 1. name , age 변수 선언
	// 2.생성자 만들기 2-1.기본생성자 생성 2- 2.name받아서 초기화 생성자 생성
	// 3.name을 리턴 해주는 매소드 생성(getName)

	String name;
	int age;

	Person() {

	};

	 Person(String name){
		this.name = name;
	};

	public String getName() {
		return name;
	}

}// class
