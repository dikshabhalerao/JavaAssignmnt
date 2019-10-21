package assignment1;

import java.util.Scanner;

public class Result7 {
	
	public static void main(String args[])
    {
        int marks[] = new int[3];
        int i;
        //float sum ;
        float total=0;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<3; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
       // scanner.close();
        
        System.out.print("The student  is: ");
        if(total>=180)
        {
            System.out.print("Passed");
        }
        else if(total>=120)
        {
           System.out.print("promoted");
        } 
        else
        {
            System.out.print("Failed");
        }
       
    }
	

}
