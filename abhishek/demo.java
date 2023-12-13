abstract class ABC
{
	 public void run()
	{
		System.out.println("Call ABC method");
	}
}
abstract class XYZ extends ABC
{
	public void run()
	{
		System.out.println("Call XYZ method");
	}
}
class MNP extends XYZ
{
	public void run()
	{
		System.out.println("Call MNP method");
	}
}
class demo
{
	public static void main(String[] args) {
		XYZ mnp=new MNP();

	mnp.run();
	}
}