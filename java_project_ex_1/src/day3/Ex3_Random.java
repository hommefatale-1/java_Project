package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex3_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랜덤한 숫자 생성
		Random ran = new Random();
		int a = ran.nextInt(8) + 2;	// 2 ~ 9
		int b = ran.nextInt(9) + 1; // 1 ~ 9
		System.out.println(a + " * " + b + " = ");
		
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if(answer == (a * b)) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
	}//main

}//class
