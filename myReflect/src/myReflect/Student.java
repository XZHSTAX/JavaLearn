package myReflect;

import java.io.IOException;

public class Student {
	private String name;
	private int age;
	public String gender;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private Student(String name) {
		this.name = name;
	}
	private Student(int age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public void sleep() {
		System.out.println("sleeping");
	}
	
	public String eat(String something) throws IOException{
		System.out.println("eating " + something);
		return "shit";
	}
	
	  
	
}
