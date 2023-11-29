package javatest;

import java.util.Scanner;

public class palindromenum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element num:");
		int num=sc.nextInt();
		int newnum=num;
		sc.close();
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
        System.out.println(rev);
        if(newnum==rev)
        {
        	System.out.println("it is palindrome num");
        	
        }else
        {
        	System.out.println("it is not palindrome num");
        	
        }
	}

}
