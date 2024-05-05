package myGeneric;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Grand> list1 = new ArrayList<>();
		ArrayList<parent> list2 = new ArrayList<>();
		ArrayList<son> list3 = new ArrayList<>();
		
		method(list1);
		method(list2);
		method(list3);

	}
	
	public static void method(ArrayList<? extends Grand> g){
		
	}
	
	

}

class Grand{
	public void show() {
		System.out.println("Hello");
	}
}

class parent extends Grand{
	
}

class son extends parent{
	
}
