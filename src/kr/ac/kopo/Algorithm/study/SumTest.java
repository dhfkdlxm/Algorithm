package kr.ac.kopo.Algorithm.study;

import java.util.Scanner;

public class SumTest {
	//문제 1번 홀짝 합산 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int inputNum = sc.nextInt();
		sc.nextLine();
		int sumResult = 0;
//		int sumResult1 = 0;
//		for (int i = 0; i <= inputNum; i++) {
//			if (i % 2 == 0) {
//				sumResult1 += i;
//			} else {
//				sumResult += i;
//			}
//		}
//		System.out.println("결과 값 : " + (inputNum % 2 == 0 ? sumResult1 : sumResult));

		for (int i = inputNum % 2; i <= inputNum; i += 2) {
			sumResult += i;
		}
		System.out.println("결과 값 : " + sumResult);

	}

}
