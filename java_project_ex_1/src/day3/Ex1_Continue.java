package day3;

public class Ex1_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//특정 조건을 만족하는 경우 특정 반복을 건너뛰고 다음 반복으로 진행
		for(int i=1; i<=5; i++) {
			if(i == 3) {
				continue;	
			}
			System.out.println(i);
		}//for
	}//main

}//class
