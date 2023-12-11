package day2;

import java.util.Scanner;

public class Ex1_string {

	public static void main(String[] args) {
		
		//문자열 클래스
		String num = "01029594125";
		String addr = "서울시 구로구 항동";
		System.out.println(num);
		System.out.println(addr);
		
		
		Scanner in2 = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요:");
		int num3 = in2.nextInt();
		
		for(int i=1; i<=9; i++) {
	
			System.out.println(num3 + " * " + i + " = " + ( num3 * i ));
		
		}
		
		Scanner in3 = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요:");
		int num4 = in3.nextInt();
		
		for(int i=1; i<=num4; i++) {
			System.out.println(num4);
		}
		}//main
		
	
	}//class
