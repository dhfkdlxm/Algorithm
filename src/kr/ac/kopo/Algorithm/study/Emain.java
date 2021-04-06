package kr.ac.kopo.Algorithm.study;

public class Emain {

	public static void main(String[] args) {
		Employee9 e1 = new Employee9("이부장","부장",15_000_000);
		Employee9 e2 = new Employee9("김과장","과장",13_000_000);
		Employee9 e3 = new Employee9("최대리","대리",12_000_000);
		Employee9 e4 = new Employee9("박사원","사원",10_000_000);

		e1.print();
		e2.print();
		e3.print();
		e4.print();
		
	}

}
