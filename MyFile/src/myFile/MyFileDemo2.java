package myFile;

import java.io.File;
import java.io.IOException;

public class MyFileDemo2 {

	public static void main(String[] args) throws IOException {
        File f = new File(".\\src\\myFile");
        File[] files = f.listFiles();
        for (File file : files) {
			System.out.println(file);
		}
        System.out.println(f.getAbsolutePath());
        

	}

}
