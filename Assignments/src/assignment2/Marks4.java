package assignment2;

public class Marks4 {
	public static void main(String[] args){
		
	int subject1,subject2,subject3;
    if( subject1 >= 60 && subject2 >= 60 && subject3 >=60 ){
      System.out.println( "Passed" );
    }
    else if(subject1 >= 60 || subject1 >= 60 || subject3 >=60){
      System.out.println( "Outstanding !");
    }
//    else if(subject1 == 'C'){
//      System.out.println( "Good !" );
//    }
//    else if(subject1 == 'D'){
//      System.out.println( "Can do better" );
//    }
//    else if(subject1 == 'E'){
//      System.out.println( "Just passed" );
//    }
//    else if(subject1 == 'F'){
//      System.out.println( "You failed" );
//    }
    else{
      System.out.println( "Invalid grade" );
    }
	}
}
