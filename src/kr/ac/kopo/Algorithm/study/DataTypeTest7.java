package kr.ac.kopo.Algorithm.study;

public class DataTypeTest7 {
	
	private int tom = -1;
	private char marry = '9';
	private boolean john;
	private String sarah = "Sarah Jang";
	
	

	public static void main(String[] args) {
		new DataTypeTest7().printMyType();
	}
	
	public void printMyType() {
		System.out.println("our friends..\n"+ tom + ","+marry + ","+john+"and" + sarah);
	}

}
