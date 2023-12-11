package day2;

import java.util.Scanner;

public class Ex_if_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.사용자가 입력한 숫자가 5의 배수면 5 아니면 아니다.
		System.out.println("5의 배수에 맞게 입력해 주세요");
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요:");
		int num1 = in.nextInt();
		
		if(num1 % 5 == 0) {
			System.out.println("5의 배수여유~.");
		}else {
			System.out.println("5의 배수가 아녀요~");
		}
		
		//2.사용자가 입력한 숫자가 홀수이면서 10보다 크면 
		//"10보다 큰 홀수 입니다."
		//아니면 "10보다 큰 짝수입니다"
		//위 조건에 해당하지 않으면 "10보다 작은  수 입니다."
		//출력하기
		System.out.println("아무 숫자나 눌러주세요");
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요:");
		int num2 = input.nextInt();
		
		if(num2 % 2 != 0 && num2 > 10) {
			System.out.println("10보다 큰 홀수 입니다");
		}else if(num2 % 2 == 0 && num2 > 10) {
			System.out.println("10보다 큰 짝수 입니다. ");
		}else {
			System.out.println("10보다 작은 수입니다.");
		}
			
	}

}
