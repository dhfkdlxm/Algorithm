package kr.ac.kopo;

import java.util.Scanner;

public class study1 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if ((num % 2) == 1) {
			int sum = 0;
			for (int i = 1; 2 * i - 1 <= num; i++) {
				sum += (2 * i) - 1;
			}
			System.out.println("결과 값" + sum);
		}

		if ((num % 2) == 0) {
			int sum1 = 0;
			for (int i = 0; 2 * i <= num; i++) {
				sum1 += (2 * i);
			}
			System.out.println("결과 값" + sum1);
		}

	}

}
