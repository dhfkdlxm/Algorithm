package kr.ac.kopo.Algorithm.study;

public class GameUtil369 {

	public static void main(String[] args) {
		//6번 369게임
		for (int i = 0; i < 100; i++) {
			int j = i%10;
			if(j != 0 && j%3==0) System.out.println(i + "짝");
		}
	}
}
