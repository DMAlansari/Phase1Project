package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		List<String> files = new ArrayList<>();
//		files.add("Intesting.txt");
//		String fileName = "Intesting.txt";
//		File file = new File(fileName); // initialize File object and passing path as argument
//		boolean result;
//		try {
//			result = file.createNewFile(); // creates a new file
//			if (result) // test if successfully created a new file
//			{
//				System.out.println("file created " + file.getCanonicalPath()); // returns the path string
//			} else {
//				System.out.println("File already exist at location: " + file.getCanonicalPath());
//			}
//		} catch (IOException e) {
//			e.printStackTrace(); // prints exception if any
//		}
//
//		System.out.println(file.getPath());
//	
//			
	      //Creating a File object for directory

	      //Creating a File object for directory
	      File directoryPath = new File("C:\\Users\\Dalal\\Phase1Project\\MySecondProject");
	      //List of all files and directories
	      String contents[] = directoryPath.list();
	      System.out.println("List of files and directories in the specified directory:");
//	      for(int i=0; i<contents.length; i++) {
//	         System.out.println(contents[i]);
//	      }
	      List<String> files = new ArrayList<>();
	      for(int i=0; i<contents.length; i++) {
	   files.add(contents[i]);
	      }
	     // System.out.println(files);
	      
	      files.remove("smeagol");
	      System.out.println(files);
    }
	}

