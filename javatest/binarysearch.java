package javatest;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the element num:");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("Enter the elements:");
	
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	sc.close();
	boolean flag=false;
	int key=5;
	int l=0;
	int h=a.length-1;
	while(l<=h)
	{
		int m=(l+h)/2;
		if(a[m]==key)
		{
			System.out.println("Element found");
			break;
		}
		if(a[m]<key)
		{
			l=m+1;
		}
		if(a[m]>key)
		{
			h=m-1;
	    }
}if(flag==false)
{
	System.out.print("Element not found");
}
		}
	}
