package myTreeMap;

import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;


public class TestTreeMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdkladkmasoifdjwdfjsdawfw";
		
		
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		
		for (int i =0;i < s.length(); i++) {
			char key = s.charAt(i);
			if(tm.containsKey(key)) {
				tm.put(key, tm.get(key)+1);
			}
			else {
				tm.put(key, 1);
			}
		}
		System.out.println(tm);
		
		StringBuilder sb = new StringBuilder();
		
		tm.forEach((key,value) ->sb.append(key).append("(").append(value).append(") "));
		System.out.println(sb);
		
		StringJoiner sj = new StringJoiner("","","");
		tm.forEach((key,value) ->sj.add(key+"").add("(").add(value+"").add(") "));
		
		System.out.println(sj);
		
	}

}
