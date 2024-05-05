package myMapTop;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class HashMapExercise2 {

	public static void main(String[] args) {
		HashMap<StudentExercise2, Integer> hm = new HashMap<StudentExercise2, Integer>();
		
		StudentExercise2 s1 = new StudentExercise2("xzh",0);
		StudentExercise2 s2 = new StudentExercise2("xzh1",1);
		StudentExercise2 s3 = new StudentExercise2("xzh2",2);
		StudentExercise2 s4 = new StudentExercise2("xzh3",3);
		StudentExercise2 s5 = new StudentExercise2("xzh4",0);
		StudentExercise2 s6 = new StudentExercise2("xzh5",1);
		StudentExercise2 s7;
		
		hm.put(s1, s1.getPlace());
		hm.put(s2, s2.getPlace());
		hm.put(s3, s3.getPlace());
		hm.put(s4, s4.getPlace());
		hm.put(s5, s5.getPlace());
		hm.put(s6, s6.getPlace());
		
		hm.forEach((key, value) ->{
			int a = 0,b=0,c=0,d=0;
				switch (value){
				case 0: {a +=1;break;}
				case 1:{b +=1;break;}
				case 2:{c +=1;break;}
				case 3:{d +=1;break;}
				default:
					throw new IllegalArgumentException("Unexpected value: " + value);
				}
				
			}
		);


	}

}
