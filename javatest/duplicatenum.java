package javatest;
import java.util.Arrays;
import java.util.Scanner;
public class duplicatenum {
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
		
		Boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		    {
	      	for(int j=i+1;j< a.length;j++)
	      	{
		      if(a[i]==a[j])
		      {
		      System.out.println(a[i]);
		       flag=true;
		      }
		    }
		   }
		if(flag==false)
		{
		System.out.println("Dup ele not found");
		}
		}
       }
