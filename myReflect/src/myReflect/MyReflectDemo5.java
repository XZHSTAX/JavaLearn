package myReflect;

import java.io.FileInputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.jar.Attributes.Name;

import javax.sound.midi.Soundbank;

public class MyReflectDemo5 {
	// 解析注解
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		
		Class clazz = Class.forName("myReflect.TestMyAnnoation");
		
		// 判断该类是否包含MyAnnotationTest这个注解
		Boolean result = clazz.isAnnotationPresent(MyAnnotationTest.class);
		System.out.println(result);		
		
		// 获取该类的MyAnnotationTest注解
		MyAnnotationTest myAnnotation = (MyAnnotationTest) clazz.getDeclaredAnnotation(MyAnnotationTest.class);
		
		System.out.println(myAnnotation.value());
		System.out.println(myAnnotation.aaa());
		System.out.println(myAnnotation.value());
		
		System.out.println("------------------------------------");
		
		// 获取方法
		Method m = clazz.getDeclaredMethod("test");
		Boolean result2 = m.isAnnotationPresent(MyAnnotationTest.class);
		System.out.println(result2);		
		
		// 获取该类的MyAnnotationTest注解
		MyAnnotationTest myAnnotation2 = (MyAnnotationTest) m.getDeclaredAnnotation(MyAnnotationTest.class);
		
		System.out.println(myAnnotation2.value());
		System.out.println(myAnnotation2.aaa());
		System.out.println(myAnnotation2.value());		
		
		
	}
	
	public static void parseClass() throws ClassNotFoundException {
		Class clazz = Class.forName("myReflect.TestMyAnnoation");
		
		// 判断该类是否包含MyAnnotationTest这个注解
		Boolean result = clazz.isAnnotationPresent(MyAnnotationTest.class);
		System.out.println(result);
	}

}
