package com.tek.Lockedme;

import java.util.Scanner;

public class UserInterface {
	
	static  Scanner scanner= new Scanner(System.in);
	static String fileName;
	
	
    
	public static void input()        // input from the user
	{
		System.out.println("=================================================");
		System.out.println("welcome to LOCKEDME.COM");
		System.out.println("=================================================");
		System.out.println("select the option");
		System.out.println("-------------------------------------------------");
		System.out.println("1-----> Display the files");
		System.out.println("file operations");
		System.out.println("21---> add file");
		System.out.println("22---> delete  file");
		System.out.println("23---> search file");
	
		System.out.println("3----->    exit");
		
		int x=1;
		
		while(x>0)             //for the invalid input from the user 
		{
			x = scanner.nextInt();
			if(x!=1&&x!=21&&x!=22&&x!=23&&x!=24&&x!=3)
			{
				
			
				System.out.println("invalid option enter again");
		     }
			else
			{
				
				break;
			}
		}
		
			if(x==21||x==22||x==23)          //file name required from only some operation
			{
				System.out.println("enter the file name");
				fileName =scanner.next();
			}
			
		
		switch(x)
		{
		
		case 1:UserService.displayFiles();
		       break;
			
		case 21:
		        UserService.addFile(fileName);
		        break;
			
		case 22: 
			    UserService.deleteFile(fileName);
			    break;
			    
		case 23: 
			    UserService.searchFile(fileName);
			    break;
		case 3:
			    UserService.exitApp();
			    break;
			
			
		}
		
	}
	public static void navigate()          //navigate the user to home page to select option again
	{
		
		System.out.println("enter 24 to navigate to home page");
		int num=1;
		 while(num>0)
		 {
			 
			  num =scanner.nextInt();
		 if(num==24) 
		 {
		 UserInterface.input();
		 break;
		 }
		 else 
		 {
			 System.out.println("invalid input enter again");
			  
		 }
		 }
		 
	}
	

}
