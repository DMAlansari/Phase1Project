package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List demo = new ArrayList<>();
		demo.add("B");
		demo.add("A");
		demo.add("C");
		demo.add("G");
		demo.add("F");
		demo.add("newfile");
		System.out.println(demo);
		System.out.println(Collections.binarySearch(demo, "F"));

		Collections.sort(demo);
		System.out.println(demo);
	
		File file = new File((String) demo.get(5)); // creating a file   
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

}
