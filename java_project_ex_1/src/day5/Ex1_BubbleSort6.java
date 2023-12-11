package day5;

import java.util.Arrays;

public class Ex1_BubbleSort6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 6, 9, 7, 3, 5 };
		
		int maxInt = 0;
		for(int i=1; i<array.length -1; i++) {
			if(array[maxInt] < array[i]) { 
				maxInt = i; //배열2번째
			}
			int iemp = array[i];
			array[i] = array[maxInt];
			array[maxInt]=iemp;
			
		}
		
	System.out.println(Arrays.toString(array));
	}// main

	
}// class
