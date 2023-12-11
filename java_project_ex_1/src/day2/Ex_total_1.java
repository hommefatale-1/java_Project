package day2;

import java.util.Scanner;
public class Ex_total_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.숫자를 입력받고 해당 숫자가 10보다 클 경우 '큰 수',아닐경우
		//'작은 수'를 출력하시오.
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요:");
		int num = in.nextInt();
		
		if(num > 10) {
			System.out.println("큰수 입니다.");
		}else {
			System.out.println("작은수 입니다.");
		}
		
		//2.숫자를 입력받고 해당 숫자가 90점 이상일 경우 'A등급',
		//70점 이상일 경우 'B듭급', 50점 이상일 경우 'C등급',
		//그 외의 숫자일 경우 'F등급'을 출력하시오
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요:");
		int num1 = input.nextInt();
		
		if(num1 >= 90) {
			System.out.println("A등급");
		}else if(num1 >= 70) {
			System.out.println("B등급");
		}else if(num1 >= 50) {
			System.out.println("C등급");
		}else {
			System.out.println("F등급");
		}
		
		//3.2번에서 작성한 코드를 switch ~ case문으로 바꿔서 작성하시오.
		Scanner input1 = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요:");
		int num2 = input1.nextInt();
		
		switch(num2/10) {
		
		case 10:
		case 9 :
			System.out.println("A등급");
			break;
		case 8 :
		case 7 :
			System.out.println("B등급");
			break;
		case 6 :	
		case 5 :
			System.out.println("C등급");
			break;
		default:
			System.out.println("F등급");
			break;
		}
		
		//4.반복문을 통해 1부터 10까지 숫자를 차례대로 출력.
		for(int i=1; i<=10; i++) {
			System.out.print(i);
		}
		
		//5.반복문을 통해 1부터 100중에서 짝수만 화면에 차례대로 출력.
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		//6.반복문을 통해 1부터 100중 홀수의 합, 짝수의 합을 각각 구하시오
		int sum1 = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1) {
				sum1+=i;
			}
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				sum2+=i;
			}
		}
		System.out.println(sum2);
		
		//7.반복문을 통해 1부터 100중 3의 배수 이면서 동시에 5의 배수인 숫자
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	
		
	}//main
	

}//class
