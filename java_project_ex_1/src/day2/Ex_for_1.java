package day2;

public class Ex_for_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 반복문
		
		//1.숫자 20~0순으로 출력
			for(int i=20; i>=0; i--) {
			
			System.out.println(i);			
		}
		
		
		//2.1~100까지의 3의 배수합을 나타내기
		int sum1 = 0;
		for(int j=1; j<=100; j++) {
			if(j % 3 == 0) {
				sum1 += j; //sum1 = sum1+ j
			}//if
			
		}//for
		System.out.println(sum1);
	}//nain
		
}//class
