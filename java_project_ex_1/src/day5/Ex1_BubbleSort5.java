package day5;

import java.util.Arrays;

public class Ex1_BubbleSort5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 9, 6, 7, 2, 5 };
		
		int minInx = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[minInx] > array[i]) {
				minInx = i;
			}
		}
		int temp = array[minInx];
		array[minInx] = array[0];
		array[0] = temp;
		System.out.println(Arrays.toString(array));
		
		minInx = 1;
		for (int i = 1; i < array.length ; i++) {
			if (array[minInx] > array[i]) {
				minInx = i;
			}

		}
		temp = array[minInx];
		array[minInx] = array[1];
		array[1] = temp;
		System.out.println(Arrays.toString(array));
	}// main

}// class
