package kr.ac.kopo;

import java.util.Scanner;

public class study4 {
	public static void main(String[] args) {

		System.out.println("문자열을 입력하세요.:");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		for (int i = 0; i < a.length(); i++) {
			for (int j = 1; j < a.length(); j++) 
			
				System.out.print(a.charAt(i));
				System.out.print(a.charAt(i));
			
			}
	
		}
	}
