package innerClass;

import java.util.Arrays;
import java.util.Collections;

public class AnonymousInnerClass {
	/*
	 * 演示抽象类的作用
	 * */
	public static void main(String[] args) {
		int i = 0;
		int[] a = {1,2,3,4};
		Dog dog1 = new Dog();
		functionA(dog1);
		// 使用抽象类实现
		functionA(
					new Animal(){
					    @Override
						public void eat(){
					        System.out.println("eat");
					        System.out.println(i);
					        a[0] = 666;
					    }
					}
				);
		System.out.println(Arrays.toString(a));
		Collections.addAll(null, null);
	}

	
	public static void functionA(Animal a) {
		a.eat();
	}
}


class Dog extends Animal{
    @Override
	public void eat(){
        System.out.println("eat");
    }
}