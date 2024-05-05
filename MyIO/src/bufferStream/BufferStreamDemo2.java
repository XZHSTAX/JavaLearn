package bufferStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class BufferStreamDemo2 {
	// 为sortwords排序
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("SortWords.txt"));
		TreeMap<String, String> tm= new TreeMap<>();
		String s;
		while( (s = br.readLine())!= null) {
			tm.put(s.split("\\.")[0], s);
		}
				
		BufferedWriter bw = new BufferedWriter(new FileWriter("SortWords_copy.txt"));
		
		tm.forEach(new BiConsumer<String, String>() {

			@Override
			public void accept(String t, String u) {
				try {
					bw.write(u);
					bw.newLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		br.close();
		bw.close();
	}

}
