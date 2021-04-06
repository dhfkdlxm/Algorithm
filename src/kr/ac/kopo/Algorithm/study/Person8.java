package kr.ac.kopo.Algorithm.study;

public class Person8 {
	private static int numberOfPersons;
	private int age;
	private String name;
	
	
	
	public Person8(){
		numberOfPersons++;
		age = 12;
		name = "Anonymous";
		
	}
	
	public Person8(int age, String name){
		numberOfPersons++;
		this.age = age;
		this.name = name;
	}
	
	
	public void selfIntroduce(){
		System.out.println("내 이름은 " + name + "이며," + "나이는 " + age +"살 입니다.");
	}
	
	public int getPopulation(){
		return numberOfPersons;
	}
	
	
}
