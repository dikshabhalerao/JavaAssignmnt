package assignment1;

import java.util.Scanner;

public class Account6 {
	
	    double bal=2409.76;
	    Scanner sc = new Scanner(System.in);
	   // Account6()
	    {
	        System.out.println("Enter Account Number:");
	     int acno = sc.nextInt();
	            
	    }
	    void deposit()
	    {
	        float amount;
	        System.out.println("Enter Amount to be Deposited:");
	        amount = sc.nextFloat();
	        bal = bal+amount;
	        System.out.println("Deposited! Account Balance is "+bal);
	    }
	    void withdraw()
	    {
	        float amount;
	        System.out.println("Enter Amount to be Withdrawn:");
	        amount = sc.nextFloat();
	        if(amount<bal)
	        {
	            bal = bal-amount;
	            System.out.println("Amount Withdraw and Available Balance: "+bal);
	        }
	        else
	        {
	            System.out.println("Insufficient funds!!");
	        }
	    }

}
