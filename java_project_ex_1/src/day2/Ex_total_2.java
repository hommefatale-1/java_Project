package day2;

import java.util.Scanner;

public class Ex_total_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요:");
		int num = in.nextInt();

		if (num % 5 == 0) {
			System.out.println("5의배수임");
		} else {
			System.out.println("5의 배수 아님");
		}

		// 2.
		Scanner in1 = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요:");
		int num1 = in.nextInt();

		if (num1 % 3 == 0 || num1 % 7 == 0) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		
		//3.
		for(int i=1; i<=30; i++) {
			if(i % 3 == 0 || i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		//4.
		int j = 0, k = 0, total = 0;
		for(int i=1; i<=30; i++) {
			if(i % 2 == 1) {
				j+=i;
			}
		}
		System.out.println("홀수의 합은:" + j);
		for(int i=1; i<=30; i++) {
			if(i % 2 == 0) {
				k+=i;
			}
		}
		System.out.println("짝수의 합은:" + k);
		
		total = j - k;
		System.out.println("홀수의 합과 짝수의 합의 차이는?" + total);
		//5.
		for(int i=30; i>=1; i--) {
			if(i % 5 != 0) {
				System.out.println(i);
			}
		}
		//6.
		Scanner in2 = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요:");
		int num3 = in.nextInt();
		
		
		for(int i=2; i<=9; i++) {
			for(int z=1; z<=9; z++) {
				System.out.println(i + z);
			}
		}

	}// main

}// class
