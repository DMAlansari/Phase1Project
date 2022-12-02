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

		List<String> files = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int usersOption = 0;
		String filePath;
		String fileName;
// When you store the code edit the directorypath and put your own path not mine and uncomment
		// Uncomment here -----------------------------
		File directoryPath = new File("C:\\Users\\Dalal\\Phase1Project\\MySecondProject"); // You have to Edit this line
		// List of all files and directories
		String contents[] = directoryPath.list();
		for (int i = 0; i < contents.length; i++) // I did this step because I wanted to work with ArrayList not Arrays
			files.add(contents[i]);
		// end of uncomment

		System.out.println("LockedMe"); // Apps Name
		System.out.println(
				"Hello!, here at LockedMe application we make it easy for you to create and store your own files."); // Greeting
																														// msg
		System.out.println("Developed by Eng. Dalal Al-ansari"); // My credentials
		System.out.println("Let us help you create, modify or even delete your files\n");
		do { // menu
			System.out.println("Kindly choose from the following menu");
			System.out.println("To  add  a  new  file  type  1");
			System.out.println("To   delete   a  file  type  2");
			System.out.println("To  view   your  files type  3");
			System.out.println("To sort your files in ascending order type 4");
			System.out.println("To search for a  file  type  5");
			System.out.println("To exit type -1\n");
			System.out.print("Type your choice here: ");
			// end of menu

			try { // I put this exception because I don't want the program to crash after adding a
					// letter instead of integer
				usersOption = scan.nextInt();
				System.out.println();
			} catch (java.util.InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Enter an integer");
				usersOption = 6;
			}

			switch (usersOption) {
			case 1: { // creating new file
				System.out.print("Type the file name: ");
				fileName = scan.next();
				System.out.println();
				fileName += ".txt";
				System.out.println();
				files.add(fileName);
				new UserFiles().createFile(fileName);
				break;}
			case 2: {// deleting file
				System.out.println("Type the file name: ");
				fileName = scan.next();
				System.out.println();
				fileName += ".txt";
				new UserFiles().deleteFile(fileName);
				files.remove(fileName);
				break;}
			case 3: {// printing all the files
				System.out.println(files);
				break;}
			case 4: { // sorting files in ascending order.
				Collections.sort(files);
				System.out.println(files);
				break;}
			case 5: {// search for a file using binary search
				System.out.println("To search type the file name here: ");
				fileName = scan.next();
				fileName += ".txt";
				System.out.println(fileName);
				for (String ref : files){
					if (fileName.equalsIgnoreCase(ref)){
						new UserFiles().fileLocation(fileName);}}
				break;}
			case -1: {
				System.exit(0);} // to exit 
			default:
				// throw new IllegalArgumentException("Unexpected value: " + usersOption);
				System.out.println("Invalid option, kinldy choose from the menu");}
			do {
			System.out.println("To return to main menu type  6");
			System.out.println("To exit type -1");
			System.out.println("Type here: ");
			usersOption = scan.nextInt();
			
			if((usersOption!=6) & (usersOption !=-1)) 
				System.out.println("Invalid!!");} while((usersOption!=6) & (usersOption !=-1));
	
			
		} while (usersOption ==6);
	}

}

class UserFiles {
	private String fileName;
	File file;

	public UserFiles(String fileName) {
		this.fileName = fileName;
	}

	public UserFiles() {

	}

	public void createFile(String fileName) {
		this.file = new File(fileName); // creating a file
		boolean result;
		try {
			result = file.createNewFile(); // creates a new file
			if (result) // test if successfully created a new file
			{
				System.out.println("file created " + file.getCanonicalPath()); // returns the path string
			} else {
				System.out.println("File already exist at location: " + file.getCanonicalPath());
			}
		} catch (IOException e) {
			e.printStackTrace(); // prints exception if any
		}
	}

	public void deleteFile(String fileName) {

		try // delete files
		{
			this.file = new File(fileName); // file to be delete
			if (file.delete()) // returns Boolean value
			{
				System.out.println(file.getName() + " deleted");
				// getting and printing the file name

			} else {
				System.out.println("failed");
			}
		} catch (Exception e) {

		}

	}

	public void fileLocation(String fileName) {
		this.file = new File(fileName);
		try {
			System.out.println("File location: " + file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File does not exists");
		}
	}

}