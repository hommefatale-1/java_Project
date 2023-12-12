package day5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex0_yester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		Scanner input = new Scanner(System.in);
		int array[] = new int [6];
		Random ran = new Random();
		
		for(int i=0; i<array.length; i++) {
			array[i] =ran.nextInt(30) + 1;
		}
		System.out.println(Arrays.toString(array));
		
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		System.out.println(sum);
		
		int oddSum = 0, evenSum = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] % 2 == 0) {
				oddSum += array[i];
			}else {
				evenSum += array[i];
			}
		}
		System.out.println("짝수의 값: " + oddSum + " 홀수의 값 : " + evenSum);
		System.out.println("짝수와 홀수의 차이 값: "+ Math.abs(oddSum - evenSum ));
		
		int sum1 = array[0];
		for(int i=1; i<array.length -1; i++) {
			 if(sum1 < array[i]) {
				 sum1 =array[i];
			 }
		 }
		System.out.println("가장 큰 값: " + sum1);
		
		int sum2 = 0;
		for(int i=1; i<array.length -1; i++) {
			if(array[sum2] < array[i]) {
				sum2 =i;
			}
		}
		System.out.println("가장 큰 수의 위치 값 : " + sum2);
		
		int total=0;
		total = array[sum2];
		array[sum2] = array[0];
		array[0] =total;
		System.out.println("가장 큰 값의 위치와 첫번째 값의 위치 변경 : " + Arrays.toString(array));
		
		for(int k=array.length -1; k>0; k--) {
			for(int i=0; i<array.length -1; i++) {
				if(array[i] > array[i+1]) {
					int temp3 = array[i];
					array[i] = array[i+1];
					array[i+1] = temp3;
				}
			}
		}
			System.out.println("배열의 숫자 오름차순으로 나열하세여 : " + Arrays.toString(array));
			input.close();
	}// main
}// class
