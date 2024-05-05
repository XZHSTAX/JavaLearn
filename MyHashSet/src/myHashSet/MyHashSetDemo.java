package myHashSet;

import java.util.HashSet;

public class MyHashSetDemo {

	public static void main(String[] args) {
	
		
		Student s1 = new Student("xzh",24);
		Student s2 = new Student("ljy",24);
		Student s3 = new Student("666",66);
		Student s4 = new Student("666",66);
		
		HashSet<Student> hs = new HashSet<>();
		
		System.out.println(hs.add(s1));
		System.out.println(hs.add(s2));
		System.out.println(hs.add(s3));
		System.out.println(hs.add(s4));
	
		System.out.println(hs);
		
	}

}
