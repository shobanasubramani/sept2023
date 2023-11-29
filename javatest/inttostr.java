package javatest;

import java.util.Scanner;

public class inttostr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element num:");
		int i=sc.nextInt();
		sc.close();

		
		String s=String.valueOf(i);
		System.out.println(i+10);
		System.out.println(s+10);
	}

}
