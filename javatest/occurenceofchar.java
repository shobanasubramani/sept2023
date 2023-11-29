package javatest;

import java.util.Scanner;

public class occurenceofchar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String s=sc.next();
        sc.close();
        int totalcount=s.length();
        int totalcount_rem=s.replace("a", "").length();
        int count=totalcount-totalcount_rem;
        System.out.println("num of occurence"+count);

	}

}
