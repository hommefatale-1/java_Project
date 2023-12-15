package day10;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 2, 3, 4, 5};
		TestArray.changeArr(arr);
		
		System.out.println(Arrays.toString(arr));
		
		String name ="홍길동";
		name = TestArray.changeString(name);
		System.out.println(name);
	}
	
}