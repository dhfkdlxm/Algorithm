package kr.ac.kopo.Algorithm.study;

public class GameUtil369 {

	public static void main(String[] args) {
		//6번 369게임
		//369131619
		String str = "";
		for (int i = 0; i < 100; i++) {
			str = str.valueOf(i+1);
			
			if (str.contains("3") || str.contains("6") || str.contains("9")) {
				System.out.print(i);
			}
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 3 || str.charAt(j) == 6 || str.charAt(j) == 9) {
					System.out.print("짝");
				}
			}
			System.out.println();
			
			
			
			
		}
		
		
	}
}