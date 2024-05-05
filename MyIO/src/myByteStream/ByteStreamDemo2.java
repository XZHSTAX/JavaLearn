package myByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
	// 演示字节输入流的使用
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt"); // true表示续写
		
//		int b1 = fis.read(); // 只读取第一个字节
//		System.out.println(b1);
//		System.out.println((char)b1);
		
//		int b;
//		while ( (b = fis.read()) != -1) {
//			System.out.print((char)b);
//		}
		
		byte[] bytes = new byte[2]; // 创建一个长度为2的数组
		
		int len = fis.read(bytes);
		String str = new String(bytes);
		
		System.out.println(len + " " + str);
		
		fis.close();
	
	}

}
