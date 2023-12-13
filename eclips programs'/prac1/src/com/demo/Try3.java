package com.demo;

import java.util.Scanner;

public class Try3 {
	int roll;
	String name;
	static String college="NSIT";
	
	Try3(int r,String n) {
		
	roll = r;
	name = n;
}
	void display()
	{
		System.out.println(roll+""+name+""+college);
	}
	static void change()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter college name : ");
		college=sc.next();
	}
	
	public static void main(String[]args) {
		
		Stati_c s1 = new Stati_c(11,"hi");
		Stati_c s2 = new Stati_c(12,"hi...");
		
		s1.display();
		Stati_c.college="NSIT";
		s2.display();
		
		Stati_c.coll();
	}
}
