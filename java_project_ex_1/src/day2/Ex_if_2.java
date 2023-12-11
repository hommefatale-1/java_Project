package day2;

import java.util.Scanner;

public class Ex_if_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner 클래스와 입력
		/*Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요.:");
		int num1 = in.nextInt();
		
		//5System.out.println(num1);
		//조건문:사용자가 입력한 숫자가 홀수면 홀수 짝수면 짝수
		if(num1 % 2 == 0) {
			System.out.println("짝수 입니다다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
		*/
		//scanner를 이용한 if문 사용
		Scanner in = new Scanner (System.in);
		System.out.println("숫자를 입력해 주세요:");
		int num1 = in.nextInt();
		
		if(num1 % 3 == 0 ) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
	}
	

}
