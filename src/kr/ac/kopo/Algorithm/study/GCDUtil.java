package kr.ac.kopo.Algorithm.study;

import java.util.Scanner;

public class GCDUtil {
	//3번 문제 최대공약수
	public static int GCD(int num, int num2) {
		
		if(num < num2) {
			num += num2;
			num2 = num - num2;
			num -= num2;
		}

		if(num2 == 0) return num;
		else return GCD(num2,num%num2);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[ 최대 공약수 구하기 ]");
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("숫자 입력 2: ");
		int num2 = sc.nextInt();
		System.out.println("최대 공약수 : "+ GCD(num, num2));
		
		

	}

}
