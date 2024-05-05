package exerciseMyFile;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Exercise3 {
	//  删除整个delete
	public static void main(String[] args) throws IOException{
		// 首先创建path2delete这个目录
		String path  = "path2delete\\path2delete2\\path2delete3";
		File f = new File(path);
		f.mkdirs();
		
		// 创建一个文件
		File fTXT = new File(f,"test.txt");
		fTXT.createNewFile();
		
		File fDel = new File("path2delete");
		deleteAll(fDel);
	}
	
	public static void deleteAll() {
		
	}
	
	
	public static void deleteAll(File f) {
		if(f.isFile()) {
			f.delete();
		}
		else if(f.isDirectory()) {
			File[] listFiles = f.listFiles();
			for (File file : listFiles) {
				deleteAll(file);
			}
		}
		f.delete();
	}
}
