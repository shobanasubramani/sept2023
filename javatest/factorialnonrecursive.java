package javatest;

import java.util.Scanner;

public class factorialnonrecursive {

	
		public static long multiplynum(int num)
		{
		if(num>=1)
		return num*multiplynum(num-1);
		else
		return 1;
		}
	
		
		public static void main (String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element num:");
		int num=sc.nextInt();
		sc.close();
		long factorial=multiplynum(num);
		System.out.println(factorial);
		}


}
