package day5;

import java.security.AlgorithmParameterGenerator;
import java.util.Arrays;
import java.util.Random;

public class Ex1_BubbleSort7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.정수를 담을 수 있는 크기가 6인 배열 생성
		int arr[] = new int[6];

		// 2.랜덤한 숫자 6개 넣기 범위는 1 ~ 30
		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(30) + 1;
		}
		System.out.println("랜덤 배열 설정" + Arrays.toString(arr));

		// 3.배열 내의 있는 값들의 총합 구하기
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			num += arr[i];
		}
		System.out.println("총 합 : " + num);

		
		//4.배열의 짝수의 총합과 홀수를 구하고 그 차이를 구하시오
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] = -arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));

		int oddSum = 0, evenSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddSum += arr[i];
			} else {
				evenSum += arr[i];
			}

		}
		System.out.println(oddSum - evenSum);

		//5. arr 배열에서 가장 큰 값 구하기
		int max = arr[0];
		for (int i = 1; i < arr.length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		//6. 가장 큰 수의 위치 값찾기
		int index = 0;
		for (int i = 1; i < arr.length ; i++) {
			if(arr[index] < arr[i]) {
				index = i;
			}
		}
		
		//7.가장 큰 값의 위치랑 첫번째 값의 위치랑 변경
		int temp =arr[0];
		arr[0] = arr [index];
		arr[index] = temp;
		
				
		
	}// main

}// class
