package day4;

import java.util.Random;
import java.util.Scanner;

public class Ex6_Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.10부터 50까지 중 3의 배수이면서 짝수만 화면에 출력
		for (int i = 10; i <= 50; i++) {
			if (i % 3 == 0 && i % 2 == 0) {
				System.out.println(i);
			}
		}

		// 2.숫자를 두개 입력받고, 두 수의 합이 10이 넘을 경우 '큰 수' 아닐 경우 '작은 수' 출력
		Scanner input = new Scanner(System.in);
		int sum = 0;

		System.out.print("첫번째 숫자를 입력해 주세요: ");
		int in0 = input.nextInt();
		System.out.print("2번째 숫자를 입력해 주세요: ");
		int in1 = input.nextInt();

		sum = in0 + in1;
		if (sum > 10) {
			System.out.println("큰수");
		} else {
			System.out.println("작은수");
		}
		// 3. 숫자를 하나 입력받고, 해당 숫자의 구구단 출력
		// (ex, 2입력시 2*1=2, 2*2=4, 2*3=6 ... 2*9=18 출력)
		
		System.out.print("숫자 하나를 입력해 주세요: ");
		int in2 = input.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(in2 + " * " + i + " = " + (in2 * i));
		}
		/* 4. 1부터 100 사이의 랜덤한 숫자를 생성하고, 숫자를 입력 받아 랜덤한 숫자와 비교하여, 
		 * 큰 수 인지 아닌지 판별하기 (ex, 랜덤수 : 35, 입력 수 : 40 일 경우 '입력한 수가 더 큽니다
		 * ' 출력, 반대일 경우 작다고 출력)*/
		Random ran = new Random();
			
		int a = ran.nextInt(100) +1;
		System.out.println("랜덤으로 숫자 생성 됬습니다: " + a);
		 System.out.print("비교할 숫자를 입력해 주세요: ");
		 int in3 = input.nextInt();
		 
		 if(a < in3) {
			 System.out.println("입력한 수가 더 큽니다");
		 }else if(a > in3) {
			 System.out.println("입력한 수가 더 작습니다");
		 }else {
			 System.out.println("입력한 수가 똑같습니다");
		 }
		//5.2단부터 9단까지 구구단 출력
		 for(int j=2; j<=9; j++) {
			 System.out.println( "====="+ j + "단=====");
			 for(int i=1; i<=9; i++) {
				 System.out.println(j + " * " + i + " = " + (j * i));
			 }
		 }
		 /*6. 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
			단, 0이하의 수를 입력하면 넣지 말고 다시 입력 받을 것 
			=> 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 각정하고 진행하세요*/
			
			int b[] = new int [5];
			
			for(int i=0; i<b.length; i++) {
				System.out.print(i + "배열에 숫자를 입력해 주세요:");
				b[i] = input.nextInt();
				if(b[i] <= 0) {
					System.out.println("0이하의 숫자는 다시 입력해 주세요:");
					b[i]--;
				}
			}
			/*7. 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
			단, 0이하의 수를 입력하면 넣지 말고 다시 입력 받을 것 
			=> 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 각정하고 진행하세요*/
			
			int d[] = new int [5];
			int sum1 = 0;
			for(int i=0; i<d.length; i++) {
				System.out.print(i + "배열에 숫자를 입력해 주세요:");
				d[i] = input.nextInt();
				if(d[i] <= 0) {
					System.out.println("0이하의 숫자는 다시 입력해 주세요:");
				
				}if (d[i] % 2 == 1) {
					sum+=d[i];
			     }		
		   }
			System.out.println("홀수들의 합: " + sum);
			//8.6번에서 정의한 배열에서 가장 큰 수와 가장 작은 수의 차이 구하기
			Scanner input1= new Scanner(System.in);
			int c[] = new int [5];
			
			int sum2 = 0, Max = c[0], Min = c[0];
			for(int i=0; i<c.length; i++) {
				System.out.print(i + "배열에 숫자를 입력해 주세요:");
				c[i] = input1.nextInt();
				if(c[i] <= 0) {
					System.out.println("0이하의 숫자는 다시 입력해 주세요:");
				}if(c[i] > c[0]) {
					Max = c[i];
				}Min = (c[i] < Min)? c[i] :  Min;
				}
		   	System.out.println("가장 큰 수는 :" + Max + "입니다." );
			System.out.println("가장 작은 수는 :" + Min + "입니다." );	
			
	}// main

}// class
