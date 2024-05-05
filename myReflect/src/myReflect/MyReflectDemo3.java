package myReflect;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.jar.Attributes.Name;

public class MyReflectDemo3 {
	// 获取成员变量
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class clazz = Class.forName("myReflect.Student");
		
		// 获取所有public的成员变量
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println("-----------------------------------");
		
		// 获取所有成员变量
		Field[] fields2 = clazz.getDeclaredFields();
		for (Field field : fields2) {
			System.out.println(field);
		}
		System.out.println("-----------------------------------");
		
		// 获取某个成员变量
		Field name = clazz.getDeclaredField("name");
		System.out.println(name);
		
		// 获取权限修饰符
		System.out.println(name.getModifiers());
		System.out.println(name.getName()); // 获取名称
		System.out.println(name.getType()); // 获取数据类型
		
		// 获取成员变量记录的值
		Student s = new Student("xzh",24);
		name.setAccessible(true);
		String value = (String) name.get(s);
		System.out.println(value);
		
		// 修改对象中的值
		name.set(s,"xzh2");
		System.out.println(s);
	}

}
