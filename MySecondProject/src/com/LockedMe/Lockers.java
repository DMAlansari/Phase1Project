package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;




public class Lockers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int status=0;
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
		System.out.println(status);
		if(status==1) {
			files.remove(0);
		}
		

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
	 
	 public int deleteFile(String fileName) {
		 int status=-1;
		try  // delete files
		{         
	    File file = new File(fileName);          //file to be delete  
		if(file.delete())                      //returns Boolean value  
		{  
		System.out.println(file.getName() + " deleted");  
		//getting and printing the file name  
		status =1;
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
		return status;
	 }
	 
 }