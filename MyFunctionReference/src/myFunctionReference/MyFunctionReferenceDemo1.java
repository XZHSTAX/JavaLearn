package myFunctionReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class MyFunctionReferenceDemo1 {
	// 演示引用静态方法
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, "1","2","3","4");
		
		list.stream().map(new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		}).forEach(s -> System.out.println(s));
		
		list.stream().map(t ->Integer.parseInt(t)).forEach(s -> System.out.println(s));
		list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));

	}

}
