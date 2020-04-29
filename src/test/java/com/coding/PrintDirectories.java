package com.coding;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDirectories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listf("C:\\Users\\Suresh Mylam\\Documents\\Appium");

	}

	public static List<File> listf(String directoryName) {
		File directory = new File(directoryName);
		File[] files = directory.listFiles();

		List<File> list = new ArrayList<File>();
		list.addAll(Arrays.asList(files));
		for (File f : files) {
			if (f.isFile()) {
				System.out.println(f.getName());
			} else if (f.isDirectory()) {
				list.addAll(listf(f.getAbsolutePath()));
			}
		}
		return list;
	}
}
