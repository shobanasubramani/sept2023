package javatest;

import java.util.Scanner;

public class Duplicatechar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.next();
		sc.close();
		char[] carray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++)
	      {
	         for (int j = i + 1; j < str.length(); j++)
	         {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[j] + " ");
	               break;}

	         }
	         }
	         }
	}

