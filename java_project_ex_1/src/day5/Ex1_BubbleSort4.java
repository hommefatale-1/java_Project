package day5;

import java.util.Arrays;

public class Ex1_BubbleSort4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 9, 6, 7, 3, -5 };

		for(int i=0; i<array.length; i++) {
			if(array[i] > array[i+1]) {
				
				int temp = array[i+1];
				array[i+1] = array[i];
				array[i+1] = temp;
				
			}
		}
		System.out.println(Arrays.toString(array));
	}// main

}// class
