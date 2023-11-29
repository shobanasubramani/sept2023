package javatest;

import java.util.Scanner;

public class removechar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String s=sc.next();
		sc.close();
		//String s="computer";
		String s1=s.replaceAll("c","");
		System.out.println(s1);


	}

}
