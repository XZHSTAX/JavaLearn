package myAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MyAnnotationDemo1 {
	// 测试元注解
	public static void main(String[] args) {
		

	}
	
	@MyAnnotation(value = "hello", count = 5)
	public void test() {
		
	}

}

@Target(value = ElementType.METHOD) // 使用元注解，限定该注解只能对方法使用
@Retention(RetentionPolicy.SOURCE) // 该注解只在源码有效
@interface MyAnnotation {
    // 定义注解的属性
    String value() default "default value";
    int count() default 0;
}

@Target(value = {ElementType.METHOD,ElementType.TYPE}) // 使用元注解，限定该注解只能对方法、类使用
@Retention(RetentionPolicy.RUNTIME)                    // 该注解在运行时也有效
@interface MyAnnotation2 {
    // 定义注解的属性
    String value() default "default value";
    int count() default 0;
}
