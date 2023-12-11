package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner s = new Scanner(System.in);
				int array[] = new int[5];
				int cnt = 0;
				while(true) {
					System.out.print((cnt + 1) + "번째 숫자 입력 : ");
					int input = s.nextInt();
					if(input > 0) {
						array[cnt] = input;
						cnt++;
					} else {
						System.out.println("0보다 큰 수 입력하셔");
					}
					if(cnt >= 5) {
						break;
					}
					
				}
				System.out.println(Arrays.toString(array));
	
	}//main

}//class
