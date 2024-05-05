package fakeJunit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FakeJunitDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("fakeJunit.FakeJunitDemo1");
		
		Method[] mArray = clazz.getDeclaredMethods();  // 获取方法
		
		// 遍历所有方法
		for (Method method : mArray) {
			// 如果方法有注解Mytest
			if(method.isAnnotationPresent(Mytest.class)) {
				// 获得构造函数，以创建对象
				Constructor constructor = clazz.getConstructor();
				// 创建对象
				FakeJunitDemo1 newInstance = (FakeJunitDemo1)constructor.newInstance();
				// 调用方法
				method.invoke(newInstance);
				
			}
		}

	}
	
	@Mytest
	public void test1() {
		System.out.println("===test1===");
	}
	
	public void test2() {
		System.out.println("===test2===");
	}
	
	@Mytest
	public void test3() {
		System.out.println("===test3===");
	}

}
