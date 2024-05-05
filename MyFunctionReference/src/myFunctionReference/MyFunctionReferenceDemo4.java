package myFunctionReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyFunctionReferenceDemo4 {
	// 直接引用其他方法
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, "aaa","bbb","ccc");
		
		list.stream().map(new Function<String, String>() {
			@Override
			public String apply(String s) {
				return s.toUpperCase();
			}
		}).forEach(s -> System.out.println(s));;
		
		list.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		list.stream().map(String::toUpperCase).forEach(s->System.out.println(s));
	}

}
