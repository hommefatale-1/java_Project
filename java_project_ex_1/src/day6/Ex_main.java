package day6;

public class Ex_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person hong = new Person("홍길동", 30);
//		hong.age = 30;
		hong.setAddr("한국");
		System.out.println(hong.getName());
		
		Person kim = new Person("김철수", 20);
//		kim.age = 20;
		System.out.println(kim.getAge());
		
		
		Person lee = new Person("이영희", 25);
//		lee.age =25;
		System.out.println(lee.getAge());
		
		Person p = new Person();
		
		lee.info();
		hong.info();
		kim.info();
		
		Calculatol cal = new Calculatol();
		
		cal.sum(2, 3);
		System.out.println(cal.sum(2, 3));
		 
		cal.sum(2, 3, 4);
		System.out.println(cal.sum(2, 3, 4));
		
		
		cal.sum(2, 3.4);
		System.out.println(cal.sum(2, 3.4));
		
		
	}//main

}//class
