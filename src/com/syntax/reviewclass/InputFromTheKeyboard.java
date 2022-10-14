package com.syntax.reviewclass;

import java.util.Scanner;

public class InputFromTheKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner scanner=new Scanner(System.in);
		
		 System.out.println("Please Enter your name");
		 String yourName=scanner.nextLine();
		 
		 System.out.println("Please Enter your age");
		 int yourAge=scanner.nextInt();
		
		 System.out.println(yourName+" is "+yourAge+" years old");
		
		
	    /*
         * nextLine is a special method that can capture spaces and enters as well 
         * when we use any method like nextInt() or nextBoolean(), nextDouble() and after that if we use
         * nextLine() we need to discard that enter by using an extra nextLine() call 
         */

       
        System.out.println("Please Enter your age");
        int age=scanner.nextInt();

        System.out.println("Please Enter your name");
        scanner.nextLine();// if this method is not called, java will print a space in the console
        String name=scanner.nextLine();
        System.out.println(name+" is "+age+" years old");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
