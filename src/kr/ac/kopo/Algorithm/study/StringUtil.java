package kr.ac.kopo.Algorithm.study;

public class StringUtil {
	public static void hokeyGraphics(char cell, int size, boolean isReact) {
		
		//문제 2
		
		// 그래픽 출력
		for (int i = 0; i < size; i++) {
			// 행을 출력하는 반복문!
			for (int j = isReact ? size : i+1; j > 0; j--) {
				// 열을 출력하는 반복문
				// isReact가 참/거짓인지에 따라, 도형을 다르게 해줌!
				System.out.print(cell);
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		hokeyGraphics('&',4,false);
	}

}
