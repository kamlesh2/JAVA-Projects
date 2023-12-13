import java.util.*;

 class Cobj{
	int id;
	String name;
	 Cobj(int i,String s) {
		// TODO Auto-generated constructor stub
		id=i;
		name=s;
	} 
	public void out() {
		System.out.println("Id="+id);
		System.out.println("Name="+name);
	}
}

public class hi {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Cobj o1=new Cobj(12, "abc");
		Cobj o2=o1;
		System.out.println("Object1:-");
		o1.out();
		System.out.println("Object1:-");
		o2.out();
	}

}
