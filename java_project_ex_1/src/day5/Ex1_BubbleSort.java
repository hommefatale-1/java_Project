package day5;

import java.util.Arrays;

public class Ex1_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 7, 4, 5, 1, 3 };

		
		for (int k = array.length -1; k > 0; k--) {
			for (int i = 0; i < array.length -1; i++) {
				if (array[i] > array[i + 1]) {
					
					int temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));

	}// main

}// class
