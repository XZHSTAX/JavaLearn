package myHutool;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cn.hutool.core.io.FileUtil;

public class MyHutoolDemo1 {

	public static void main(String[] args) {
		File file = FileUtil.file("a.txt");
		System.out.println(file);
		
		// hutool 在创建File对象时，可以传入多个String，会自动进行拼接
		File file2 = FileUtil.file("C:\\Code\\Java\\Learning\\myHutool","newFile","newFile2","a.txt");
		// hutool 如果一个File的父级路径是不存在的，FileUtil在创建文件时不会报错，而是会自动新建文件夹
		File touch = FileUtil.touch(file2);
		
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, "hello","world","!");
		
		FileUtil.writeLines(list, file2, "UTF-8",true);
		FileUtil.appendLines(list, file2, "UTF-8");
		
		
		List<String> list2 =  FileUtil.readLines(file2, "UTF-8");
		list.stream().forEach(s->System.out.println(s));
		

	}

}