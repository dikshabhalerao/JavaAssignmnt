package assignment2;

public class Armstrong1 {
	public static void main(String[] args) {
        int number = 230, originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result=result+(remainder*remainder*remainder);
          //  result += Math.pow(remainder, 3);
           // originalNumber /= 10;
            originalNumber=originalNumber/10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
