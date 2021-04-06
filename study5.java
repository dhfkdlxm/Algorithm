package kr.ac.kopo;

public class study5 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			int a = i / 10;
			// 두자리수 판단
			int b = i % 10;
			// 한자리수 판단
			if (a == 3 | a == 6 | a == 9) {
				if (b == 3 || b == 6 || b == 9) {
					System.out.println(i + "짝짝");
					continue;
				}

			} else if (b == 3 || b == 6 || b == 9) {
				System.out.println(i + "짝");
			}
		}

	}
}
