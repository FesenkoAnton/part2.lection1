package part2.lection1;

public class Student {

	public Student(String name, int age, double averageGrade) { 
		this.name = name;
		this.age = age;
		this.averageGrade = averageGrade;
	}

	private String name;
	private int age;
	private double averageGrade;

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public double getAverageGrade() {
		return this.averageGrade;
	}

	public Student changeGrade(double newgrade) {
		averageGrade = newgrade;
		return this;
	}

	public Student becomeOlder() {
		++age;
		return this;
	}

	@Override
	public String toString() {
		return "Name - " + name + ", Age - " + age + ", Average Grade - "
				+ averageGrade;
	}
}