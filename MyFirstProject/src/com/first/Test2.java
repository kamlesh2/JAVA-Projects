package com.first;

class Test1 {
	public void run()
	{
		System.out.println("hi");
	}
}
class Test2 extends Test1
{
	public void run()
	{
		System.out.println("hello");
	}
	
	public static void main(String[]args) {

		Test2 t2=new Test2();
		t2.run();
	}
}
