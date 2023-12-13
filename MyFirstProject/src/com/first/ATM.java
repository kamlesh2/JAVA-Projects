package com.first;
import java.text.BreakIterator;
import java.util.Scanner;
class Bank{
	int amount=0;
	public void debit(int deb)
	{ amount=amount+deb; }
	public void creadit(int cre)
	{ amount=amount-cre; }
	public int show()
	{ return amount; }
}

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank obj=new Bank();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("...............Welcome ATM System...............");
		System.out.print("Enter Account Number:-  ");
		
		int no=sc.nextInt();
		
		if(no<90 && no>10)
			return;
		
		System.out.print("Enter PIN:-  ");
		int pin=sc.nextInt();
		
		if(pin!=1111)
			return;
		
		System.out.println("...............Log IN SUCCESS...............");
		int i=0;
		int option;
		int deb,cre;
		
		while (i==0) {
			System.out.println("Chose any [1] Option:-");
			System.out.println("1.		Debit");
			System.out.println("2.		Creadit");
			System.out.println("3.		Show Amount");
			System.out.println("4.		Exit");
			System.out.print("Answer:-  ");
			option=sc.nextInt();
			
			switch (option){
				case 1:
					System.out.println("Enter amount to be Debited:-  ");
					deb=sc.nextInt();
					obj.debit(deb);
					break;
				case 2:
					System.out.println("Enter amount to be Creadited:-  ");
					cre=sc.nextInt();
					obj.creadit(cre);
					break;
				case 3:
					System.out.println("Your Amount:-	"+obj.show());
					break;
				case 4:
					i=1;
					break;
				default:
					System.out.println("Enter Right Choise....");
			}
			
			
		}
	}

}
