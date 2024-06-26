package exerciseMyFile;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashMap;

public class Exercise4 {
	//  统计各种文件夹总大小
	static int fileSpace = 0;
	public static void main(String[] args) throws IOException{
		// 首先创建path2delete这个目录
		String path  = "aaa";
		File f = new File(path);
		countSpace2(f);
		System.out.println(fileSpace);
		System.out.println(countSpace(f));
	
	}
	
	public static int countSpace(File f) {
		int len = 0;
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			if(file.isFile()) {
				len += file.length();
			}
			else {
				len += countSpace(file);
			}
		}
		return len;
	}
	
	public static void countSpace2(File f) {
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			if(file.isFile()) {
				fileSpace += file.length();
			}
			else {
				countSpace2(file);
			}
		}
	}
}
