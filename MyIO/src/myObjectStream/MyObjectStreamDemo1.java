package myObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyObjectStreamDemo1 {
	// 演示序列化与反序列化
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student s1 = new Student("xzh",24);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentRecord.txt"));
		
		oos.writeObject(s1);
		
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("StudentRecord.txt"));
		
		Student o = (Student)ois.readObject();
		
		ois.close();
		
		System.out.println(o.toString());

	}

}