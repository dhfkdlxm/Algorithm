package kr.ac.kopo.Algorithm.School;

public class Teacher {
	private String name;
	private int age;
	private String subject;

	/**
	 * @param name
	 * @param age
	 * @param subject
	 */
	public Teacher(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print() {
		System.out.println("이  름 : " + name + "\t나  이 : " + age + "\t담당과목 : " + subject );
	}
}
