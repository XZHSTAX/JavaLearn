package myReflect;

public class MyReflectDemo1 {
	// 获取class对象的三种方式
	public static void main(String[] args) throws ClassNotFoundException {
		
		// 第一种方式 最为常用
		// 填写全类名，全类名即包名+类名
		Class clazz = Class.forName("myReflect.Student");
		
		// 第二种方式 作为参数进行传递
		Class clazz2 = Student.class;
		
		// 第三种方式 当已经有了该类对象时使用
		Student s = new Student();
		Class clazz3 = s.getClass();
		
		

	}

}