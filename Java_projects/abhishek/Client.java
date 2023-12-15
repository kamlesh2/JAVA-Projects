import org.eclipse.jdt.internal.compiler.ast.SuperReference;

class Bank
{
	public static void main(String [] args) {
	System.out.println("hello Bank");
}
	void interest()
	{
		System.out.println("Interest 7%");
		System.out.println("--------------------------------------------------------");
	}
}
class SBI extends Bank
{
	public static void main(String [] args) {
		System.out.println("hello SBI");
		
	}
	void interest()
	{
		System.out.println("Interest 7.5%");
		System.out.println("Simple interest is:-");
		super.interest();
	}
}
class HDFC extends Bank
{	public static void main(String [] args) {
	System.out.println("hello");
}
	void interest()
	{
		System.out.println("Interest 8%");
		System.out.println("Simple interest is:-");
		super.interest();
	}
}
class AXIS extends Bank
{
	void interest()
	{
		System.out.println("Interest 8.5%");
		System.out.println("Simple interest is:-");
		super.interest();
	}
}
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI b1=new SBI();
//		SBI b1_1=b1;
		HDFC b2=new HDFC();
		AXIS b3=new AXIS();
		
		b1.interest();
		b2.interest();
		b3.interest();
		
		b1.main(null);
		
/*		boolean b=b1.equals(b1_1);
		System.out.println(b);
		int a=b1.hashCode();
		System.out.println(a);*/
 	}

}
