package myReflect;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.jar.Attributes.Name;

public class MyReflectDemo4 {
	// 获取成员变量
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class clazz = Class.forName("myReflect.Student");
		
		// 获取所有public方法，包含父类中的public方法
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("---------------------");
		
		// 获取所有方法，不包含父类中的public方法
		Method[] methods2 = clazz.getDeclaredMethods();
		for (Method method : methods2) {
			System.out.println(method);
		}
		System.out.println("---------------------");
		
		// 获取成员方法
		Method m = clazz.getDeclaredMethod("eat",String.class);
		System.out.println(m);
		
		System.out.println("---------------------");
		// 获取方法入参
		Parameter[] parameters = m.getParameters();
		for (Parameter parameter : parameters) {
			System.out.println(parameter);
		}
		System.out.println("---------------------");
		
		// 获取方法抛出的异常
		Class[] exceptionTypes = m.getExceptionTypes();
		for (Class class1 : exceptionTypes) {
			System.out.println(class1);
		}
		
		// 运行方法
		Student s = new Student("xzh",24);
		
		m.setAccessible(true);
		Object result = m.invoke(s, "apple");
		System.out.println(result);
		
	}

}
