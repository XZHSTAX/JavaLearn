package myGeneric;

public class TestReflect {

	public static void main(String[] args) {
		Grand g = new Grand();
		parent p = new parent();
		son s = new son();
		method(g);
		method(p);

	}
	
	public static <E> void method(E g){
	}
	
	

}

