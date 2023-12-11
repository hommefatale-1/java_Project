package day5;

import java.util.Arrays;

public class Ex1_BubbleSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { -3, 1, -2, 5, -4 };

		for (int j = array.length - 1; j > 0; j--) {

			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] > array[i + 1]) {

					int temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
				}
				if (array[i] < 0) {
					array[i] = Math.abs(array[i]);
				}
			}

		}
//3
		System.out.println(Arrays.toString(array));
	}// main

}// class
