package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;




public class Lockers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> files = new ArrayList<>();
		files.add("music.txt");
		files.add("videos.txt");
		files.add("file1.txt");
		files.add("file2.txt");
		files.add("newfile.txt");
		files.add("test.txt");
		files.add("file2.txt");
		Scanner scan = new Scanner(System.in);
		// Apps name
		int usersOption=0;
		String fileName ;
		System.out.println("LockedMe");
		System.out.println("Hello!, here at LockedMe application we make it easy for you to safley create your own files.");
		System.out.println("Developed by Eng. Dalal Al-ansari");
		System.out.println("Let us help you create, modify or even remove your files");
		System.out.println("Kindly choose from the following to options");
		System.out.println("To  add  a  new  file  type  1");
		System.out.println("To   delete   a  file  type  2");
		System.out.println("To  view   your  files type  3");
		System.out.println("To sort your files in ascending order type 4");
		System.out.println("To search for a  file  type  5");
		System.out.println("To exit type -1");
		System.out.println("Type your choice here: ");
		
		
		try {
			usersOption = scan.nextInt();
		} catch (java.util.InputMismatchException e) {
			// TODO: handle exception 
			System.out.println("Inter an integer");
			usersOption = 6;
		}
		
		switch (usersOption) {
		case 1: { // creating new file
			System.out.println("Type the file name: ");
			fileName = scan.next();
			files.add(fileName+".text");
			new UserFiles().createFile(fileName+".text");
			break;}
		
		case 2: {// deleting file
			System.out.println("Type the file name: ");
			fileName = scan.next();
			fileName +=".text";
			new UserFiles().deleteFile(fileName);
	 	    for(String ref : files) {
	 			  
	 			  if(fileName.equalsIgnoreCase(ref)){
	 			 files.remove(ref); }
	 	    }
			break;}
		case 3: {// printing all the files
			System.out.println(files);
			break;}
		case 4: { // sorting files in ascending order.
			Collections.sort(files);
			System.out.println(files);
			break;}
		case 5: {// search for a file using binary search
			System.out.println("Type the file name: ");
			fileName = scan.next();
			fileName +=".text";
	 	    for(String ref : files) {	  
	 			  if(fileName.equalsIgnoreCase(ref)){
	 			    System.out.println(ref);
	 			    new UserFiles().fileLocation(fileName);
	 			 }
	 	    }
			break;}
		case -1:{
			System.exit(0);
		}
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + usersOption);
		}
		System.out.println("To return to main menu type  6");
		System.out.println("To exit type -1");
		usersOption = scan.nextInt();
	
	}
	

}

 class UserFiles {
	 private String fileName;
	 File file;
	 public UserFiles (String fileName) {
		 this.fileName = fileName;
	 }
	 public UserFiles() {
		 
	 }
	 public void createFile(String fileName) {
		this.file = new File(fileName); // creating a file   
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
		 
		try  // delete files
		{         
	    this.file = new File(fileName);          //file to be delete  
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
	 
	 public void fileLocation(String fileName) throws IOException {
		 this.file = new File(fileName);
		 System.out.println("File location: "+file.getCanonicalPath()); 
		 
	 }
	 
 }