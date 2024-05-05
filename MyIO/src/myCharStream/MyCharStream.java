package myCharStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyCharStream {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("a2.txt");
		FileReader fr2 = new FileReader("a2.txt");
		int en;
		while((en = fr.read())!=-1) {
			System.out.print((char)en);
		}
		
		char[] chars = new char[2];
		while((en = fr2.read(chars))!=-1) {
			System.out.print(new String(chars,0,en));
		}		
		
		fr.close();
		fr2.close();
		
		FileWriter fw = new FileWriter("a2.txt",true);
		String s = "\n我是宇宙之王\n";
		fw.write(s);
		fw.close();
		
	}
}