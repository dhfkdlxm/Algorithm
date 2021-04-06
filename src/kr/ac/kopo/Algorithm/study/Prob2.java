package kr.ac.kopo.Algorithm.study;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
			System.out.println(sb);
		}
		
		
		
	}

}
