package myDynamicProxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigStar bigStar = new BigStar("LJY");
		Star proxy =  ProxyUtil.createProxy(bigStar);
		
		String result = proxy.sing("鸡你太美");
		System.out.println(result);
		
		
	}

}
