package javatest;

import java.util.Scanner;

public class Palindromestr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
			System.out.println(rev);
			
		
		if(str.equals(rev))
		{
			System.out.println("it is palindrome");
		
		}else
		{
			System.out.println("it is not palindrome");
		}

}
}
