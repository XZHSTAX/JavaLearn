package myCommonsio;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class CommonsIODemo1 {

	public static void main(String[] args) throws IOException {
		File  src = new File("a.txt");
		File  dest = new File("a_copy_commonsIO.txt");
		
		// 复制文件
		FileUtils.copyFile(src,dest);

	}

}
