package lambda;

public class LambdaDemo {
	/*
	 * 演示lambda表达式的作用
	 * 
	 * */
	public static void main(String[] args) {
		// 使用内部类实现method的调用
		method(new Swim() {
			@Override
			public void swimming() {
				System.out.println("I'm Swimming");
				
			}
		});
		
		// 使用lambda表达式改写
		method(
				() ->{
					System.out.println("I'm Swimming");
				}
				);
	}
	
	
	
	public static void method(Swim s) {
		s.swimming();
	}

}
