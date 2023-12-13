package com.first;
import java.util.Scanner;

public class Rupee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int a;
		int two_t,five_h,one_h,fifty,twenty,ten,five,two,one;
		
		two_t=0;
		five_h=0;
		one_h=0;
		fifty=0;
		twenty=0;
		ten=0;
		five=0;
		two=0;
		one=0;
		
		System.out.print("Enter amount:-");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();


		while (a!=0) {
			if(a>=2000) {
				a-=2000;
				two_t++;
			}else if (a>=500) {
				a-=500;
				five_h++;
			}else if (a>=100) {
				a-=100;
				one_h++;
			}else if (a>=50) {
				a-=50;
				fifty++;
			}else if (a>=20) {
				a-=20;
				twenty++;
			}else if (a>=10) {
				a-=10;
				ten++;
			}else if (a>=5) {
				a-=5;
				five++;
			}else if (a>=2) {
				a-=2;
				two++;
			}else if (a>=1) {
				a-=1;
				one++;
			}
		}
	
		System.out.println("2000:- "+two_t);
		System.out.println("500:- "+five_h);
		System.out.println("100:- "+one_h);
		System.out.println("50:- "+fifty);
		System.out.println("20:- "+twenty);
		System.out.println("10:- "+ten);
		System.out.println("5:- "+five);
		System.out.println("2:- "+two);
		System.out.println("1:- "+one);
	}

}
