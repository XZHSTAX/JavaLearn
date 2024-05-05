package myAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MyAnnotationDemo2 {
	// 自定义注解
	public static void main(String[] args) {
		

	}
	
	@MyAnnotationX()
	public void test() {
		
	}
	
	@MyAnnotationY("xzh") // 如果只有一个属性，可以不写属性名
	public void test2() {
		
	}
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationX{
	String name() default "xzh"; // 定义注解的参数
	int id() default -1; // 默认-1表示不存在
	
	String[] words() default {"BUCT","USTC"};
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationY{
	String value();
}
