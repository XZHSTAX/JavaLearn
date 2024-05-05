package myReflect;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Exercise2 {
	// 与配置文件结合，动态创建对象，并调用方法。
	public static void main(String[] args) throws IllegalAccessException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalArgumentException, InvocationTargetException {
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("prop.properties");
		prop.load(fis);
		fis.close();
		System.out.println(prop);
		
		String classname = (String) prop.get("classname");
		String methodname = (String) prop.get("method");
		
		// 利用反射创建对象并运行方法
		Class clazz = Class.forName(classname);
		Constructor con =  clazz.getDeclaredConstructor(); // 获得构造方法
		Method method =  clazz.getDeclaredMethod(methodname); // 获得方法
		
		
		Object o = con.newInstance(); // 创建对象
		method.setAccessible(true);  // 解除方法限制
		method.invoke(o);			// 调用方法
		
		
	}

}
