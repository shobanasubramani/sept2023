package javatest;

import java.util.Scanner;

public class strtoint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String s=sc.next();
		sc.close();
		int i=Integer.parseInt(s);
		System.out.println(i+10);




	}

}
