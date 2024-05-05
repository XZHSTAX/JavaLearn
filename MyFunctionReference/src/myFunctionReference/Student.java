package myFunctionReference;

public class Student{
	private String name;
	private int age;
	
	public Student() {

	}

	public Student(String s) {
		this.name = s.split(",")[0];
		this.age = Integer.parseInt(s.split(",")[1]);
	}
	

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
