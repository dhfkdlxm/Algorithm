package kr.ac.kopo;

import java.util.Scanner;

public class study3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("더 입력 점수가 없다면 -1입력");
		
		int b = 0;
		b = sc.nextInt();
		int sum =0;
		int i= 1;
		
		while (b != -1) {
			System.out.println("점수를 입력하세요");
			sum += b;
			i++;
			b = sc.nextInt();
			}
		System.out.println("입력된 점수들의 의 수"+i);
		System.out.println("점수들의 평균(double value)" + (double)(sum/i));
		System.out.println("점수들의 평균(int value)" + (int)(sum/i));
		
		}

	}


