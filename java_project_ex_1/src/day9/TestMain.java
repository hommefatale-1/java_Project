package day9;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.이름이 '뽀삐'인 Animal 객체 생성
		// 2. getName 메소드 호출
		// 3. getAge 메소드 호출 후 변수에 담은 다음 출력
		Animal animal = new Animal("뽀삐");
		animal.getName();

		animal.print();
		System.out.println(animal.getName());

		animal.getAge();
		int age1 = animal.getAge();
		System.out.println(age1);

		// Calculator 객체 생성 후
		// 오버로딩된 메소드 3가지 호출하기
		Calculator cal = new Calculator();
		cal.multiple(1, 2);
		System.out.println(cal.multiple(1, 2));
		double sum = cal.multiple(5, 4.5);
		System.out.println(sum);
		cal.multiple(5, 4, 3);

		// static 접근 객체 선언없이 사용 가능
		Calculator.multiple(5, 3);
		Calculator.multiple(2.3, 5.4);

		// Book 객체 3개 만들기
		// 1.1 제목:자바책 , 저자:홍길동, 번호:123
		// 1.2 제목:홍길동전, 저자입력xx, 번호:321
		// 1.3 기본생성자 호출
		Book book1 = new Book("자바책", "홍길동", 123);
		Book book2 = new Book("홍길동전", 321);
		Book book3 = new Book();

	}// main

}// class