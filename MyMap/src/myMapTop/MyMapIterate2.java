package myMapTop;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MyMapIterate2 {

	public static void main(String[] args) {
		// Map 集合遍历3，使用foreach
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("xzh", "ljy");
		map.put("jly","lmo");
		
		
		map.forEach(new BiConsumer<String, String>() {

			@Override
			public void accept(String key, String value) {
				System.out.println(key + " = " + value);
				
			}
		});
		
		// lambda模式
		map.forEach((key,value) ->System.out.println(key + " = " + value));
		

	}

}
