package myTreeSet;

import java.util.TreeSet;

public class MyTreeSetDemo2 {
	public static void main(String[] args) {
		
		Student s1 = new Student("xzh",24);
		Student s2 = new Student("ljy",24);
		Student s3 = new Student("666",66);
		Student s4 = new Student("666",66);
		
		TreeSet<Student> ts = new TreeSet<>();
		
		System.out.println(ts.add(s1));
		System.out.println(ts.add(s2));
		System.out.println(ts.add(s3));
		System.out.println(ts.add(s4));
	
		System.out.println(ts);		
		
	}
}
