package myDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
	// 用来创建代理
	public static Star createProxy(BigStar bigStar) {
		// 第一个参数指定类加载器，用于加载代理类
		// 指定接口
		// 指定代理要干什么
		Star star = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[] { Star.class },
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// proxy 代理的对象
						// method 要运行的方法
						// 调用方法method时要传递的入参
						if("sing".equals(method.getName())) {
							System.out.println("hhhhhh");
						}
						else if("dance".equals(method.getName())) {
							System.out.println("xxxxxxx");
						}
						
						return method.invoke(bigStar, args);
					}
				});

		return star;

	}
}
