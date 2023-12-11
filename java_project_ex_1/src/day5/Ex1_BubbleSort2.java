package day5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex1_BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 3, 1, 2, 5, 4 };

		int temp = 0;
		for (int j = array.length - 1; j > 0; j--) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));

	}// main
	

}// class


