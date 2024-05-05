package myTreeMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;
import java.util.random.RandomGenerator;

public class TestTreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		String [] a = {"a","b","c","d"};
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < 80; i++) {
			int num = random.nextInt(4);
			list.add(a[num]);
		}
		
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		for (String key : list) {
			if(tm.containsKey(key)) {
				tm.put(key, tm.get(key)+1);
			}
			else {
				tm.put(key, 1);
			}
		}
		System.out.println(tm);
		
	}

}
