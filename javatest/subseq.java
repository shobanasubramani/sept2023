package javatest;

import java.util.Scanner;

public class subseq {

	public static void main(String[] args) {
		 
			  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.next();

		       sc.close();
		        System.out.println(str.subSequence(0, 7));
		  
		        
		        System.out.println(str.subSequence(10, 12));
		    }
		}
	
