package com.demo;

import java.util.Scanner;

 class Static_c
{ 
	 int roll;
	 int i;  
	 String name;
	static String college="NSIT";
	public Static_c(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}
	void Get() {
		// TODO Auto-generated constructor stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("----------Student"+i+"----------");
		
		System.out.print("Enter Name:-");
		name=sc.next();
		System.out.print("Enter Enrollment No.:-");
		roll=sc.nextInt();
	}
	void display()
	{
		System.out.println("----------Student"+i+"----------");
		
		System.out.println("Name:-"+name);
		System.out.println("Enrollment No.:-"+roll);
	}
	static void display_c()
	{
		System.out.println("College Name.:-"+college);
	}
	static void get_c()
	{	Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter College Name.:-");
		college=sc.next();
	}
}
public class Static {

	static class Demo
	{	
		static int no;
		static void get()
	{
		System.out.print("Enter No.:-");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
	}
		static void display()
		{
			System.out.println("Cube:-"+(no*no*no));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo.get();
		Demo.display();
		
		/* Static_c obj1=new Static_c(1);
		 Static_c obj2=new Static_c(2);
		 Static_c obj3=new Static_c(3);
		 
		 obj1.Get();
		 obj2.Get();
		 obj3.Get();

		 obj1.display();
		 Static_c.display_c();
		 obj2.display();
		 Static_c.display_c();
		 obj3.display();
		 Static_c.display_c();
		 
		 Static_c.get_c();		
		 obj1.display();
		 Static_c.display_c();
		 obj2.display();
		 Static_c.display_c();
		 obj3.display();
		 Static_c.display_c();
*/	}

}
