package myFunctionReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyFunctionReferenceDemo2 {
	// 演示引用其他类的方法
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, "xzh","lzh2","lzh3","xzh666","xz","xz2");
		
		// 去除长度小于3，去除不以x开头的数据,hhhh
		
		// 匿名内部类
		list.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String s) {
				return s.startsWith("x") && s.length()>=3;
			}
		}).forEach(s->System.out.println(s));
		// lambda 
		list.stream().filter(s->s.startsWith("l") && s.length()<3).forEach(s->System.out.println(s));
		list.stream().filter(new StringOperation()::test).forEach(s->System.out.println(s));
		list.stream().filter(new MyFunctionReferenceDemo2()::stringfilter).forEach(s->System.out.println(s));
		
	}
	
	public boolean stringfilter(String s) {
		return s.startsWith("l") && s.length()<3;
		
	}

}
