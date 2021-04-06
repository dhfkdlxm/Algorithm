package kr.ac.kopo.Algorithm.School;

public class Employee {
	private String name;
	private int age;
	private String dept;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, String dept) {
		this.age = age;
		this.dept = dept;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println("이  름 : " + name + "\t나  이 : " + age + "\t부  서 : " + dept );
	}


}
