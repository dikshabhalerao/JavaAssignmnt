package assignment2;

import java.util.Scanner;

public class Tax5 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the amount of income: ");
        double income = sc.nextDouble();
        double tax = 0;
        
        if (income>0 && income <= 180000 ) {
            tax = income * 1;
        }
        else if (income <= 180001) {
            tax = 180000 * 1 + (income - 300000) * 0.10;
        }
        else if (income <= 300001) {
            tax = 180000 * 1 + (181001 - 300000) * 0.10+ (income - 500000) * 0.20;
        }
        else if (income <= 500001) {
            tax = 180000 * 1 + (181001 - 300000) * 0.10+ (300001 - 500000) * 0.20 + (income - 1000000) * 0.30;
        }

        if (income <=  180000)
            System.out.println("You have entered the nil bracket="+tax);
        else if (income <= 180001)
            System.out.println("You have entered the 10% bracket="+tax);
        else if (income <= 300001)
            System.out.println("You have entered the 20% bracket="+tax);
        else if (income <= 500001)
            System.out.println("You have entered the 30% bracket="+tax);
        else
        	System.out.println("Salary is too high");
    

}
}