package myObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class MyObjectStreamDemo2 {
	// 演示序列化与反序列化多个对象
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student s1 = new Student("xzh",24);
		Student s2 = new Student("xzh2",24);
		Student s3 = new Student("xzh3",24);
		Student s4 = new Student("xzh4",24);
		
		ArrayList<Student> list = new ArrayList<Student>();
		Collections.addAll(list, s1,s2,s3,s4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("4StudentRecord.txt"));
		oos.writeObject(list);
		oos.close();
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("4StudentRecord.txt"));
		ArrayList<Student> o = (ArrayList<Student>)ois.readObject();
		ois.close();
		
		o.forEach(s->System.out.println(s.toString()));

	}

}