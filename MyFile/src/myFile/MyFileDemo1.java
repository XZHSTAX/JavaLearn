package myFile;

import java.io.File;
import java.io.IOException;

public class MyFileDemo1 {

	public static void main(String[] args) throws IOException {
        File f = new File("test.txt");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());

	}

}
