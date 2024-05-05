package myStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MyStreamDemo1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, "a","b","c","d","e");
		
		Stream<String> stream1 = list.stream();
		stream1.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		list.stream().forEach(t -> System.out.println(t));

	}

}
