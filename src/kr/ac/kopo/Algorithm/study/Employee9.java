package kr.ac.kopo.Algorithm.study;

public class Employee9 {
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	
	
	public Employee9() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee9(String name, String title, int baseSalary) {
		this.baseSalary = baseSalary;
		this.name = name;
		this.title = title;
		getTotalSalary();
	}

	public void getTotalSalary() {
		if(title.equals("부장")) {
			totalSalary = baseSalary+(int) (baseSalary*0.25);
		}else if(title.equals("과장")) {
			totalSalary = baseSalary+(int) (baseSalary*2*0.15);
		}else {
			totalSalary = baseSalary+(int) (baseSalary*2*0.05);
		}
	}
	
	public void print() {
		System.out.println(title+"직급의 " + name +"씨의 본봉은 "+baseSalary+" 원이고, 총급여는 " + totalSalary+"원입니다.");
		
	}
	
	
	
	
	
}
