package kr.ac.kopo.Algorithm.School;

public class Student {
	private String name;
	private int age;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name
	 * @param age
	 * @param id
	 */
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public void print() {
		System.out.println("이  름 : " + name + "\t나  이 : " + age + "\t학  번 : " + id );
	}

}
