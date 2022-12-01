package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.kfh.SecondClass.UserDetails;

public class Lockers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int status=0;
		List<String> files = new ArrayList<>();
		files.add("music.txt");
		files.add("videos.txt");
		new UserFiles().createFile(files.get(0));
		new UserFiles().createFile(files.get(1));
		status = new UserFiles().deleteFile(files.get(0));
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