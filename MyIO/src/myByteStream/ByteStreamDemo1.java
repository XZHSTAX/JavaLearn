package myByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
	// 演示字节输出流的使用
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("a.txt",true); // true表示续写
		fos.write(97);
		
		
		byte[] bytes = {97,98,99,100,101};
		
		fos.write(bytes,1,3); // 数组，起始位置，个数
		
		// 换行
		String wrap = "\n";
		fos.write(wrap.getBytes());
		
		// 写入String
		String s = "hello world";
		fos.write(s.getBytes());
		
		fos.close();
	}

}