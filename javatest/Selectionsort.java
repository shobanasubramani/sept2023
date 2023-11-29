package javatest;
import java.util.Arrays;
import java.util.Scanner;

public class Selectionsort {

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
		for(int i=0;i<a.length;i++)
		{
		int s=i;
		for(int j=i+1;j<a.length;j++)
		{
		if(a[s]>a[j])
		{
		s=j;
		}
		temp=a[i];
		a[i]=a[s];
		a[s]=temp;
		}
		}
System.out.print(Arrays.toString(a));
}

}
