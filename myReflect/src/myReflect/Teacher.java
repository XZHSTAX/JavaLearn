package myReflect;

public class Teacher {
	private String name;
	private int Workage;
	public Teacher(String name, int workage) {
		super();
		this.name = name;
		Workage = workage;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWorkage() {
		return Workage;
	}
	public void setWorkage(int workage) {
		Workage = workage;
	}
	
	public void teach() {
		System.out.println("Teaching!");
	}
	
	
}
