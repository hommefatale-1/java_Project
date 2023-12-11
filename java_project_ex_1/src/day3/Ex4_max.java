package day3;

import java.util.Scanner;

public class Ex4_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(" 첫번째 숫자를 입력: ");
		int num1 = input.nextInt();
		System.out.print(" 두번째 숫자를 입력: ");
		int num2 = input.nextInt();
		
		int max = 	Math.max(num1,  num2);
		System.out.print("두개의 숫자중 큰 수는 " + max  + "입니다.");
		
		//삼항연산자 int max = (num1 >= num2) ? num1 : num2;
	}//main

}//class
