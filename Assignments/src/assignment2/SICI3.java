package assignment2;

import java.util.Scanner;

public class SICI3 {

	public static void main(String[] args) 
		{
		double amount=0,principle=1000,rate=10,time=3,ci,si;			
		
		System.out.println("Principle= "+principle);
	 
		System.out.println("Rate="+rate);
	 
		System.out.println("Time="+time);
	 
		amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
	 
		System.out.println("Amount="+amount);
	 
		ci=amount-principle;
		si = (rate * time * principle) / 100;
	 
		System.out.println("compound interest is="+ci);
		System.out.println("simple interest is="+si);
	 
		}

}
