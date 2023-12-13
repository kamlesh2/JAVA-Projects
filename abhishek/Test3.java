class Test1{
	public void run()
	{
		System.out.println("hi");
	}
	protected void run(int a)
	{
		System.out.println("Hello");
	}
}
class Test2
{
	public static void main(String[] args) {
		
		Test1 t=new Test1();
		t.run(10);
		t.run();	
	}
}