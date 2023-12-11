package day2;

public class Ex2_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단순조건문: if(조건식){수행문}참일경우 수행문 실행
		int num2 = 20;
		if(num2 > 10) {
			System.out.println("나이는 10보다 크다");
			if(num2 > 20) {
				System.out.println("나이는 30보다 크다");
			}
		}
		//if(조건식){참일경우 수행문 실행} 거짓일경우 else{}문 실행
		int age = 20;
		if(age > 25) {
			System.out.println("15보다 크다");
		}
		else {
			System.out.println("26보다 작다");
		}
		//조건식 활용
		int num1 = 5;
		
		if(num1 % 2 == 0) {
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
	}

}
