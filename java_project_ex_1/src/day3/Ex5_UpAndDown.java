package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex5_UpAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		// 1 ~ 100사이의 숫자 맞추기

		int random = ran.nextInt(100) + 1;
		int cnt = 0;

		for (;;) {
			cnt++;
			System.out.print(cnt + "번째 시도 숫자를 입력:");
			int answer = input.nextInt();
			if (answer == random) {
				System.out.println("정답!" + cnt + "번째");
				break;
			} else if (answer > random) {
				System.out.println("다운이야");
			} else {
				System.out.println("업이야");
			}

		}

	}// main

}// class
