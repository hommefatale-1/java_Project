package day3;

import java.util.Scanner;

public class EX2_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.특정 조건을 만족하는 경우 반복문을 중지.
		int cnt = 0;
		Scanner in = new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {	
		System.out.print(i + "번째숫자 입력:");
		cnt += in.nextInt();
		}	
		System.out.println("5개의 숫자의 합 : " + cnt);
		//2.반복문을 이용해서 숫자를 10개 입력받고 입력받의 수의 합를 구하시오
		//단, 0을 입력하면 그 즉시 종류
		int cnt1 = 0, sum = 0;
		Scanner in1 =new Scanner(System.in);
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + "숫자를 입력해 주세요:");
			cnt1 = in1.nextInt();
			if(cnt1 == 0) {
				break;
			}
			sum += cnt1;
		}
		System.out.println("합은:" + sum);
		
		//3.
		Scanner in3 = new Scanner(System.in);
		for(;;) {
			System.out.println("종료(0),  계속(1)");
			int num1 = in3.nextInt();
			if(num1 == 0) {
				break;	
			}
		}
		System.out.println("종료되었습니다");
		
	}//main

}//class
