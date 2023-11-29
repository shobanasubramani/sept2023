package javatest;

public class Stringquestions {

	public static void main(String[] args) {
		String s="Shobi";//literal way to create String
		String st=new String("java");//using new
		
		String s1="ABCDE";
		System.out.println(s1.toLowerCase());  //to lower case
		
		String s2="abcde";
		System.out.println(s2.toUpperCase());   // to upper case
		
		
		String str="java@programming@tekarch";       //split
		String a[]=str.split("@");
		for(String x:a)
		{
		System.out.println(x);
		
		}
		
	}

}
