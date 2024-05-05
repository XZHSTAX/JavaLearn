package myMapTop;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class MyMapIterate3 {

	public static void main(String[] args) {
		// Map 集合遍历2，使用entrySet
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("xzh", "ljy");
		map.put("jly","lmo");
		
		
		Set<Map.Entry<String, String>>  entries = map.entrySet();
		// 匿名内部类模式
		entries.forEach(new Consumer<Map.Entry<String, String>>() {

			@Override
			public void accept(Entry<String, String> entry) {
				System.out.println(entry.getKey() + " = " + entry.getValue());
			}
		});
		
		// lambda 模式
		entries.forEach(entry ->System.out.println(entry.getKey() + " = " + entry.getValue()));
		

	}

}
