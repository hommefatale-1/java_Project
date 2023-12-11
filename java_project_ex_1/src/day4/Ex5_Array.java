package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Array 기본구성
		int a[] = new int [10];
		a[0] = 10;	//{10, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		a[3] = 30;	//{10, 0, 0, 30, 0, 0, 0, 0, 0, 0}
		System.out.println(a[0]);
		
		int b[] = {1, 2, 3, 4};	//b[0] = 1, b[1] = 2
		System.out.println(b.length);
		
		//2.Array 응용
		int c[] = new int[5];
		Scanner input = new Scanner(System.in);
				
		for(int i=0; i<c.length; i++) {
			System.out.println(i + "번째 인덱스에 숫자를 기입해주세요: ");
			c[i] =input.nextInt();
		}
		System.out.println(Arrays.toString(c));	//인덱스 값 구하기
		//3.평균구하기
		int sum = 0;
		for(int i=0; i<c.length; i++) {
			sum += c[i];
		}
		System.out.println((double) sum / c.length);
		
		//4.배열에서 큰 값 구하기
		int max = c[0];
		for(int i=0; i<c.length; i++) {
			if(c[i] > max) {
				max = c[i];
			}// max1 = ( max > c[i]) ?  c[i] : max;
		}
		System.out.println(max);
		//5. 가장 큰 값의 위치
		int index = 0;
		for(int i=1; i<c.length; i++) {
			if(c[i] > c[index]) {
				index = i;
			}
		}
		System.out.println("큰 수의 위치 index : " + index);
		//6. 가장 작은 값의 위치변경
		int index1 = 0;
		for(int i=1; i<c.length; i++) {
			if(c[i] < c[index1]) {
				index1 = i;
			}//maxmi
		}
		System.out.println("작은수의 위치 index1 : " + index1);
		
		int total = c[index];
			c[index] = c[index1];
			c[index1] = total;
			System.out.println("큰 수의 위치를 작은위치로 이동 index : " + c[index]);
			System.out.println("작은수 의 위치를 큰위치로 이동 index1 : " + c[index1]);
			
	}//main
	
}//class
