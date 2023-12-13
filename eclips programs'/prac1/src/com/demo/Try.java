package com.demo;

class Stati_c
{
	int roll;
	String name;
	static String college="NSIT";
	
	Stati_c(int r,String n) {
		
	roll = r;
	name = n;
	}
	void display()
	{
		System.out.println(roll+""+name+""+college);
	}
	
	public static void main(String[]args) {
		
		Stati_c s1 = new Stati_c(11,"hi");
		Stati_c s2 = new Stati_c(12,"hi...");
		
		s1.display();
		Stati_c.college="NSIT";
		s2.display();
	}
	
	}















//class Ab
//{static int no=1;
//public Ab() {
	// TODO Auto-generated constructor stub
	
	//System.out.println(no++);
//}
//	}
//public class Try {

  

	
	//public static void main(String[] args) {
		//Ab obj1=new Ab();
		//Ab obj2=new Ab();
		//Ab obj3=new Ab();
						
		
	//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//static
	//{
	//	System.out.println("static 1 block");
	//}
	//static
	//{
	//	System.out.println("static 2 block");
	//}
	
	//public static void main(String []args) {
		
		//System.out.println("method");
		
	
	

