package day10;

public class Person {

	private String name;
	int age;
	String addr;

	// 3개 생성
	// 1. 기본생성자
	// 2. 이름, 나이 초기화
	// 3. 이름, 나이, 주소 초기화
	Person() {

	}

	Person(String name, int age) {
		this(name, age, null);
//		this.name = name;
//		this.age = age;
	}

	Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

}// class