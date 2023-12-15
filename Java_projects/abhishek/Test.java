class Demofirst
{	
	void dis(int a)
	{
		System.out.println("Call Demofirst Method");
		System.out.println("A="+(a+a));
	}
}
class Demosecond extends Demofirst
{	
	void dis(int a)
	{
		System.out.println("Call DemoSecond Method");
		System.out.println("A="+(a*a));
		int d=a+a;
		super.dis(d);
	}
}
public class Test {
 public static void main(String [] args) {
	Demofirst df=new Demofirst();
	Demosecond ds=new Demosecond();
	
	df.dis(10);
	ds.dis(10);
 }
	
}
