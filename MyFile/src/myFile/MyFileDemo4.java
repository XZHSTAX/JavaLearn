package myFile;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class MyFileDemo4 {
	// 演示使用FilenameFilter过滤文件
	public static void main(String[] args) throws IOException {
        File f = new File(".\\src\\myFile");
        // 匿名内部类写法
        File[] files = f.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		});
        // lambda写法
        File[] files2 = f.listFiles((dir,name) ->name.endsWith(".txt"));   
        
        for (File file : files) {
			System.out.println(file);
		}
        System.out.println(f.getAbsolutePath());
        

	}

}
