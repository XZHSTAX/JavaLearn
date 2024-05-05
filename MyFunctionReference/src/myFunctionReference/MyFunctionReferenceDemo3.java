package myFunctionReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyFunctionReferenceDemo3 {
	// 演示引用构造方法
	public static void main(String[] args) {
		// 引用自定义类的构造方法
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, "xzh,24","ljy,18","xzh2,24","ljy2,24");
		
		List<Student> newlist = list.stream().map(new Function<String, Student>() {

			@Override
			public Student apply(String s) {
				String name = s.split(",")[0];
				int age = Integer.parseInt(s.split(",")[1]);
				Student student = new Student(name,age);
				return student;
			}
		}).collect(Collectors.toList());
		
		List<Student> newlist2 = list.stream().map(Student::new).collect(Collectors.toList());		
		
		System.out.println(newlist);
		
		// 引用数组的构造方法
		
		ArrayList<Integer> list2 = new ArrayList<>();
		Collections.addAll(list2, 1,2,3,4,5);
		
		Integer[] arr2 = list2.stream().toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr2));
			
	}
	
}