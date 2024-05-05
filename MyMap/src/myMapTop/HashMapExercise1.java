package myMapTop;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class HashMapExercise1 {

	public static void main(String[] args) {
		
		HashMap<StudentExercise1, String> hm = new HashMap<>();
		
		StudentExercise1 s1 = new StudentExercise1("xzh",24,"Anhui");
		StudentExercise1 s2 = new StudentExercise1("ljy",24,"Hunan");
		StudentExercise1 s3 = new StudentExercise1("xzh",24,"Anhui");
		
		
		hm.put(s1, s1.getLoaction());
		hm.put(s2, s2.getLoaction());
		hm.put(s3, s3.getLoaction());
		
		hm.forEach(( key,value) -> System.out.println(key + " = " + value));
		
	}

}
