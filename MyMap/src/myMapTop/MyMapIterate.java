package myMapTop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MyMapIterate {

	public static void main(String[] args) {
		// Map 集合遍历1，使用keySet()
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("xzh", "ljy");
		map.put("jly","lmo");
		
		Set<String> keys =  map.keySet();
		
		for (String key : keys) {
			String value = map.get(key);
			System.out.println(key + " = "+ value);
		}
		// 匿名内部类
		keys.forEach(new Consumer<String>() {

			@Override
			public void accept(String key) {
				String value = map.get(key);
				System.out.println(key + " = "+ value);
				
			}
		});
		// lambda
		keys.forEach(key ->{
				String value = map.get(key);
				System.out.println(key + " = "+ value);
		});

	}

}
