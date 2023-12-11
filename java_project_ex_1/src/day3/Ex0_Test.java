package day3;

import java.util.Scanner;

public class Ex0_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (//0.1부터 내가 입력한 숫자까지의 합
		Scanner in = new Scanner(System.in)) {
			System.out.print("숫자를 입력해 주세요:");
			int num = in.nextInt();
			
			int total = 0;
			for(int i=1; i<=num; i++) {
				total += i;
			}
			System.out.println(total);
			
			try (//1.내가 입력한 숫자의 구구단 출력
			Scanner in1 = new Scanner(System.in)) {
				System.out.print("내가 입력한 숫자의 구구단:");
				int num1 = in1.nextInt();
						
				for(int i=1; i<=9; i++) {
					System.out.println(num1 + " * " + i + " = " + (num1 * i));
				}
			}
			try (//2.1부터 내가 입력한 숫자까지 출력
			Scanner in2 = new Scanner(System.in)) {
				System.out.print("1부터 내가 입력한 숫자까지 출력:");
				int num2 = in2.nextInt();
				
				for(int i=1; i<=num2; i++) {
					System.out.println(i);
				}
			}
			try (//3.1부터 30중 내가 입력한 숫자의 배수를 제외하고 출력
			Scanner in3 = new Scanner(System.in)) {
				System.out.print("1부터 내가 입력한 숫자까지 출력:");
				int num3 = in3.nextInt();
				
				for(int i=1; i<=30; i++) {
					if(i % num3 != 0) {
						System.out.println(i);
					}
				}
			}
			try (//4.1부터 내가 입력한 숫자까지 중에서 3의 배수의 개수 구하기
			Scanner in4 = new Scanner(System.in)) {
				System.out.print("1부터 내가 입력한 숫자까지 출력:");
				int num4 = in4.nextInt();
				
				int cnt = 0;
				for(int i=1; i<=num4; i++) {
					if(i % 3 == 0) {
						cnt++;
					}
					
				}
				System.out.println(cnt);
				
				try (//5.
				Scanner input = new Scanner(System.in)) {
					int sum = 0, cnt1 =0;
					for(;;) {
						
						System.out.print("합산할 숫자를 입력해 주세여:");
						int num5 = input.nextInt();
						sum += num;
						cnt++;
						
						System.out.print("종료(0), 계속(1) 입력해주세요:");
						int num6 = input.nextInt();
						if(num6 == 0) {
							System.out.println("종료되었습니다.");
							break;
							
						}
					}
					System.out.println("총" + cnt1 + "개의 숫자의 합은:" + sum );
				}
			}
		}
		
	}// main

}// class
