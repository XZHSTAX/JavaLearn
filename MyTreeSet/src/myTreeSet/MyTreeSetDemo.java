package myTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int i = o1.length() - o2.length();
				i = i == 0 ? o1.compareTo(o2) : i;
				return i;
			}
		});

		
		TreeSet<String> ts2 = new TreeSet<String>((o1,o2) ->{
				int i = o1.length() - o2.length();
				i = i == 0 ? o1.compareTo(o2) : i;
				return i;
			});
		
		ts.add("a");
		ts.add("abc");
		ts.add("abcd");
		ts.add("aaaa");
		System.out.println(ts);
	}
}
