package javatest;

import java.util.Arrays;
import java.util.Scanner;

public class Sortingint {

	public static void main(String[] args) {
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
		int temp=0;
		
		for(int i=0;i<n-1;i++)
		{
		     for(int j=0;j<n-1;j++)
		     {
		        if(a[j]>a[j+1])
		        {
		        temp=a[j];
		        a[j]=a[j+1];
		        a[j+1]=temp;
		        }
		     }
		 }
		     
		 System.out.println(Arrays.toString(a));
		
	}
}



