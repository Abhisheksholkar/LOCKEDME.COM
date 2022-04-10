package com.tek.Lockedme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserService {
	
	
	
	static List<String> fileNames= new ArrayList<String>();   //to store the files name
	
	static                     // to add the initial data to list
	{
	fileNames.add("project2");
	fileNames.add("project5");
	fileNames.add("project1");
	fileNames.add("project4");
	fileNames.add("project3");
	
	}
	
	public static void displayFiles()       // display the file names in ascending order
	{

		
		Collections.sort(fileNames);       //Ascending output
		System.out.println(fileNames);
		UserInterface.navigate();
	}
	
	
	public static void addFile(String fileName)// to add a file to list
	{

		
		int c=0;
		for(int i =0;i<fileNames.size();i++)
			
		{
			
			if(fileName.equals(fileNames.get(i)))  // verify the name if same name then the application will not allow
			{
				System.out.println(fileName+"     "+"this file is alredy exists");
				c++;
				
			}
		}
		
		if(c==0) 
		{
			fileNames.add(fileName);
			System.out.println(fileName+   "   "+" file is added");
			
			
		}
	
		UserInterface.navigate();
		
		
		
	}
	
	public static void deleteFile(String fileName)   //delete the file with the help of file name
	{
//          value();
		
		int c=0;
		for(int i =0;i<fileNames.size();i++)
			
		{
			
			if(fileName.equals(fileNames.get(i)))
			{
				fileNames.remove(i);
				System.out.println(fileName+"     "+"file is deleted");
				c++;
				
			}
		}
		
		if(c==0) 
		{
			
			System.out.println(fileName+   "   "+" file  not found");
			
			
		}
		
		UserInterface.navigate();
		
	}
	public static void searchFile(String fileName)  //to search a file
	{
//		 value();
			
			int c=0;
			for(int i =0;i<fileNames.size();i++)  //to check in the each index
				
			{
				
				if(fileName.equals(fileNames.get(i)))
				{
					
					System.out.println(fileName+"     "+"is present at c/teksystem/projects location");
					c++;
					
				}
			}
			
			if(c==0) 
			{
				
				System.out.println(fileName+   "   "+" file  not found");
				
				
			}
			
			UserInterface.navigate();
		
	}
	public static void exitApp() // exit from the application
	{
		System.out.println("thank you for your time ");
		
	}
	
	

}
