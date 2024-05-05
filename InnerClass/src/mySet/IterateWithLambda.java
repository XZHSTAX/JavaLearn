package mySet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class IterateWithLambda {

	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<>();
		
		coll.add("a");
		coll.add("b");
		coll.add("c");
		coll.add("d");
		
		// 内部类写法
		coll.forEach( new Consumer<String>() {
			// t 即为集合中的每一个元素
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		// lambda 写法
		coll.forEach( (t) ->{
				System.out.println(t);
			}
		);
		
		coll.forEach( t ->t="a");	
		// lambda 省略写法
		coll.forEach( t ->System.out.println(t));		
		
	}

}
