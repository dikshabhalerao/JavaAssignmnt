package assignment1;

public class CommandLineArg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // check if length of args array is greater than 0 
        if (args.length > 0) 
        { 
            System.out.println("The command line"+" arguments are:"); 
  
            //printing 
            // the command line arguments 
            for (String val:args) 
                System.out.println(val); 
        } 
        else
            System.out.println("No command line "+ 
                               "arguments found."); 
 

	}

}
