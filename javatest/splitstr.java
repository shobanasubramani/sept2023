package javatest;

import java.util.Scanner;

public class splitstr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.next();

		       sc.close();

		String a[]=str.split("@",2);
		for(String x:a)
		{
		System.out.println(x);
		}

	}

}
