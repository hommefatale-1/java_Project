package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex6_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		
		int total=0, cnt = 0;
		
		for(int i=1; i<=5; i++) {
			int random = ran.nextInt(8) + 2;
			int random1 = ran.nextInt(9) + 1;
			System.out.print(random + " * " + random1 + "=");
			int in1 = input.nextInt();
			total =random * random1;
			
			if(in1 == total) {
				System.out.println("정답이유~");
				cnt++;
			}else {
				System.out.println("오답 정답은 " + total + " 입니다");
			}
		}
	System.out.println("5문제 끝났습니다.");
	System.out.println(cnt+ " 개수 맞아 "+cnt * 20 + "점입니다.");
	}// main

}// class
