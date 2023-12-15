interface Abc 
{
static void display1()
{
	System.out.println("hi");
}
}
class Xyz implements Abc
{
static void display1(){}
}
class demo2
{
	public static void main(String[] args) {
		Abc.display1();
		//Xyz x=new Xyz();

	}
}
