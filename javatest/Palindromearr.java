package javatest;

import java.util.Arrays;
import java.util.Scanner;

public class Palindromearr {static void palindrome(int a[], int n)
{
    
 int flag = 0;
for (int i =0; i <= n /2 &&  n!=0; i++)
{
if (a[i] != a[n-i-1]) 
        {
            flag = 1;
            break;
        }
}
        if (flag == 1)
        System.out.println("Not Palindrome");
    else
        System.out.println("Palindrome");
}


public static void main(String[] args)
{
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
    palindrome(a, n);
}
}




	


