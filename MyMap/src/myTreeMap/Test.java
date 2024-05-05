package myTreeMap;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {1,2,3,4};
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(Arrays.equals(a,b));
		
		String x = "hello";
		String y = "hello";
		System.out.println(x == y);
		
		double m = 1/10.0;
		double n = 1 - 9/10.0;
		System.out.println(m == n);
		if(Math.abs(m-n) < 0.0001)
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
