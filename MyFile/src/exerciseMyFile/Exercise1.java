package exerciseMyFile;

import java.io.File;
import java.io.IOException;

public class Exercise1 {
	
	public static void main(String[] args) throws IOException{
		File file = new File("aaa");
		
		file.mkdirs();		
		
		File src = new File(file,"a.txt");
		src.createNewFile();
	}

}
