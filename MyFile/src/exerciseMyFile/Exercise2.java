package exerciseMyFile;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Exercise2 {
	//  寻找所有以.txt结尾的文件，使用递归方法
	public static void main(String[] args) throws IOException{
		findTXT();
	}
	public static void findTXT() {
		 File[] listRoots = File.listRoots();
		 for (File file : listRoots) {
			findTXT(file);
		}
	}
	
	
	public static void findTXT(File f) {
		File[] allFiles = f.listFiles();
		if(allFiles != null) {
			for (File file : allFiles) {
				if(file.isFile()) {
					String name = file.getName();
					if(name.endsWith(".txt")) {
						System.out.println(file);
					}
				}
				else {
					findTXT(file);
				}
			}			
		}
	}

}
