package kr.ac.kopo.Algorithm.study;

import java.util.Scanner;

public class Prob1 {
	// 4번 입력받은 점수 평균 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		double result = 0;
		System.out.print("[더 입력할 점수가 없으면 -1을 입력]");
		
		while (true) {
			System.out.print("점수를 입력하십시오 : ");
			double inputSco = sc.nextDouble();
			if(inputSco < 0) {
				break;
			}
			result += inputSco;
			count ++;
		}
		result /= count;
		System.out.printf("점수들의 평균(double value) : %.3f \n", result);
		System.out.printf("점수들의 평균(int value) : %d", (int)result);
	}

}
