package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;




public class Lockers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Apps name
		int usersOption=0;
		System.out.println("Hello!, here at LockedMe application we make it easy for you to safley create your own files.");
		System.out.println("Developed by Eng. Dalal Al-ansari");
		System.out.println("Let us help you create, modify or even remove your files");
		System.out.println("Kindly choose from the following to options");
		System.out.println("To  add  a  new  file  type 1");
		System.out.println("To   delete   a  file  type 2");
		System.out.println("To  view   your  files type 3");
		System.out.println("To search for a  file  type 4");
		System.out.println("To return to home page type 5");
		System.out.println("To exit type -1");
		System.out.println("Type here:");
		usersOption = scan.nextInt();
		
		switch (usersOption) {
		case 1: {
			
			break;}
		case 2: {
			
			break;}
		case 3: {
			
			break;}
		case 4: {
			
			break;}
		case 5: {
			
			break;}
		case -1: {
			
			break;}
		default:
			throw new IllegalArgumentException("Unexpected value: " + usersOption);
		}


		
		
// status=0;
		List<String> files = new ArrayList<>();
		files.add("music.txt");
		files.add("videos.txt");
		files.add("file1.txt");
		files.add("file2.txt");
		files.add("newfile.txt");
		files.add("test.txt");
		files.add("file2.txt");
//		for(int i=0;i<files.size();++i) {
//		new UserFiles().createFile(files.get(i));}
		System.out.println(files);
		Collections.sort(files); // sorting in ascending order
		System.out.println(files);
		
	  	String fileName = "test.txt";
 	    for(String ref : files) {
 			  
 			  if(fileName.equalsIgnoreCase(ref)){
 			    System.out.println(ref);
 			 files.remove(ref); }
 	    }
 	    System.out.println(files);
 	    
   
		
		
		//status = new UserFiles().deleteFile(files.get(0));

		

	}
	

}

 class UserFiles {
	 private String fileName;
	 public UserFiles (String fileName) {
		 this.fileName = fileName;
	 }
	 public UserFiles() {
		 
	 }
	 public void createFile(String fileName) {
		File file = new File(fileName); // creating a file   
		boolean result;  
		try   
		{  
		result = file.createNewFile();  //creates a new file  
		if(result)      // test if successfully created a new file  
		{  
		System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
		}  
		else  
		{  
		System.out.println("File already exist at location: "+file.getCanonicalPath());  
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();    //prints exception if any  
		}
	 }
	 
	 public void deleteFile(String fileName) {
		 int status=-1;
		try  // delete files
		{         
	    File file = new File(fileName);          //file to be delete  
		if(file.delete())                      //returns Boolean value  
		{  
		System.out.println(file.getName() + " deleted");  
		//getting and printing the file name  
		
		}  
		else  
		{  
		System.out.println("failed");  
		}  
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}
		
	 }
	 
 }