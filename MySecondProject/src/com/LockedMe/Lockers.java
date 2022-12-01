package com.LockedMe;

import java.io.File;
import java.io.IOException;

public class Lockers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//---------------------------------------------------------------------------------------------------------------------
File file = new File("test.txt"); // creating a file   
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
} // end of creating a file
//---------------------------------------------------------------------------------------------------------------------
try  // delete files
{         
	 file = new File("C:\\Users\\Dalal\\eclipse-workspace\\MySecondProject\\test.txt");          //file to be delete  
if(file.delete())                      //returns Boolean value  
{  
System.out.println(file.getName() + " deleted");   //getting and printing the file name  
}  
else  
{  
System.out.println("failed");  
}  
}  
catch(Exception e)  
{  
e.printStackTrace();  
} // end of delete files
//---------------------------------------------------------------------------------------------------------------------
// creating 	
	}
	

}
