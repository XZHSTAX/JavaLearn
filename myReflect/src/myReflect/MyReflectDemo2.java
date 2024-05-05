package myReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.jar.Attributes.Name;

public class MyReflectDemo2 {
	// 获取构造方法
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class clazz = Class.forName("myReflect.Student");
		
		// 获取public的所有构造方法
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println("--------------------------------");
		
		// 获取所有的构造方法
		Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : declaredConstructors) {
			System.out.println(constructor);
		}
		System.out.println("--------------------------------");
		
		// 获取空参构造方法
		Constructor declaredConstructor1 = clazz.getDeclaredConstructor();
		System.out.println(declaredConstructor1);
		// 获取入参为String类型的构造方法
		Constructor declaredConstructor2 = clazz.getDeclaredConstructor(String.class);
		System.out.println(declaredConstructor2);
		// 获取入参为String,int类型的构造方法
		Constructor declaredConstructor3 = clazz.getDeclaredConstructor(String.class,int.class);
		System.out.println(declaredConstructor3);	
		
		// 获取权限修饰符：
		System.out.println(declaredConstructor3.getModifiers());
		
		// 创建对象
		declaredConstructor3.setAccessible(true); // 暴力反射：因为下面的构造方法是private的，所以要使用这一句临时取消权限校验
		Student s1 = (Student)declaredConstructor3.newInstance("xzh",24);
		

	}

}
