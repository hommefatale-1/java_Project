package day4;

import java.util.Random;
import java.util.Scanner;

public class Ex0_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (//1.특정조건 만족시 까지 반복
		Scanner input = new Scanner(System.in)) {
			Random ran = new Random();
			int random = ran.nextInt(100) + 1;
					
			int cnt = 0;
			while(true) {
				cnt++;
				System.out.println(cnt + "번째 숫자 입력중 : ");
				int in = input.nextInt();
				if(in < 1 || in > 100  ) {
					System.out.println("잘못 기입했습니다. 1 ~ 100사이의 숫자를 입력해 주세요");
					cnt--;
				}else if(in == random) {
					System.out.println(cnt + "번째" +  "정답입니다");
							break;
				}else if(in > random) {
					System.out.println("다운");
				}else {
					System.out.println("업");
				}
			}
		}
	}//main
		
}//class