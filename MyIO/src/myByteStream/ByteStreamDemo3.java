package myByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
	// 复制文件，简单复制，每次只复制一个字节
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt"); // true表示续写
		FileOutputStream fos = new FileOutputStream("a_copy.txt");
		
		int b;
		while((b = fis.read())!=-1) {
			fos.write(b);
		}
		
		fis.close();
		fos.close();
	
	}

}