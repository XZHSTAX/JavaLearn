package exerciseTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TestDemo {
	public static void main(String[] args) {
		
		NewStudent s1 = new NewStudent("xzh",24,100,100,100);
		NewStudent s2 = new NewStudent("xzh",24,100,100,100);
		NewStudent s3 = new NewStudent("xzha",25,99,100,100);
		NewStudent s4 = new NewStudent("xzhb",24,100,99,100);
		NewStudent s5 = new NewStudent("xzhc",24,100,100,99);
		
		TreeSet<NewStudent> ts = new TreeSet<NewStudent>();
		
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
		System.out.println(ts);
	}
}
