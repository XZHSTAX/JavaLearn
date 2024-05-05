package myDynamicProxy;

public class BigStar implements Star{
	private String name;

	public BigStar(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String sing(String name) {
		System.out.println(this.name + " sing " + name);
		return "哎呀你干嘛";
	}
	
	public void dance() {
		System.out.println(this.name + " dances.");
	}
	
}
