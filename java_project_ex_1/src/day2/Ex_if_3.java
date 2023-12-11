package day2;

import java.util.Scanner;

public class Ex_if_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner이용한 if - else if문
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요:");
		int num1 = in.nextInt();
		
		if(num1 >= 90 ) {
			System.out.println("A등급");
		}else if(num1 >= 80) {
			System.out.println("B등급");
		}else if(num1 >= 70) {
			System.out.println("C등급");
		}else if(num1 >= 60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
	}

}
