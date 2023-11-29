package javatest;

import java.util.Scanner;

public class Stringuplowlen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String s=sc.next();
		sc.close();
		//String s="LosAngeles";
		String s1=s.toUpperCase();
		String s2=s.toLowerCase();
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s.length());
	}

}
