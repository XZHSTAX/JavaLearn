package myIOExercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyIOExercise1 {
	// 文件夹拷贝、考虑子文件夹
	public static void main(String[] args) throws IOException {
		File root = new File("Test");
		File rootCopy = new File("Test_Copy");
		rootCopy.mkdir();
		CopyFile(root, rootCopy);
		

	}
	
	public static void CopyFile(File src,File targetFile) throws IOException {
		File[] listFiles = src.listFiles();
		for (File file : listFiles) {
			if(file.isFile()) {
				myCp(file,new File(targetFile,file.getName()));
			}
			else {
				File copy = new File(targetFile,file.getName()); // 在父级路径下创建这个文件夹
				copy.mkdir();
				CopyFile(file,copy);
			}
		}
	}
	
	public static void myCp(File oriFile,File targetFile) throws IOException {
		FileOutputStream fos = new FileOutputStream(targetFile);
		FileInputStream fis = new FileInputStream(oriFile);
		
		int len;
		byte[] bytes = new byte[1024*1024*5];
		while((len = fis.read(bytes)) != -1) {
			fos.write(bytes,0,len);
		}
		
		fos.close();
		fis.close();

	}

}