package day4;

public class Ex2_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//for(int i=1; i<=5; i++) { for(int j=1; j<=i; j++) { System.out.print(i); } }
		 
		//구구단 역수
		for(int i=9; i>=2; i--) {
			System.out.println("====" + i + "단=====");
			for(int j=9; j>=1; j--) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			
		}
	}//main

}//class
