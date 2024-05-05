package myMapTop;

import java.util.Objects;

public class StudentExercise1 {
	private String name;
	private int age;
	private String loaction;
	
	public StudentExercise1() {}
	public StudentExercise1(String name, int age, String loaction) {
		super();
		this.name = name;
		this.age = age;
		this.loaction = loaction;
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
	public String getLoaction() {
		return loaction;
	}
	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, loaction, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		StudentExercise1 other = (StudentExercise1) obj;
		
		return this.getName().equals(other.getName()) && this.getAge() == other.getAge();
	}
	@Override
	public String toString() {
		return "StudentExercise1 [name=" + name + ", age=" + age + ", loaction=" + loaction + "]";
	}

	
	
}
