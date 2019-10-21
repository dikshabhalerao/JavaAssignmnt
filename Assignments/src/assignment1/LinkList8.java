package assignment1;

import java.util.LinkedList;

public class LinkList8 {
	public static void main(String [] args)  
    {  
       LinkedList<String> dll=new LinkedList<String>();  
       dll.add("Ravi");  
       dll.add("Vijay");  
       dll.add("Ajay");  
       dll.add("Anuj");  
       dll.add("Gaurav");  
       dll.add("Harsh");  
       dll.add("Virat");  
       dll.add("Gaurav");  
       dll.add("Harsh");  
       dll.add("Amit");  
       System.out.println("Initial list of elements: "+dll);  
     //Removing specific element from arraylist  
          dll.remove("Vijay");  
          System.out.println("After invoking remove(object) method: "+dll);   
     //Removing element on the basis of specific position  
          dll.remove(0);  
          System.out.println("After invoking remove(index) method: "+dll);   
          LinkedList<String> ll2=new LinkedList<String>();  
          ll2.add("Ravi");  
          ll2.add("Hanumat");  
     // Adding new elements to arraylist  
          dll.addAll(ll2);  
          System.out.println("Updated list : "+dll);   
     //Removing all the new elements from arraylist  
          dll.removeAll(ll2);  
          System.out.println("After invoking removeAll() method: "+dll);   
     //Removing first element from the list  
          dll.removeFirst();  
          System.out.println("After invoking removeFirst() method: "+dll);  
      //Removing first element from the list  
          dll.removeLast();  
          System.out.println("After invoking removeLast() method: "+dll);  
      //Removing first occurrence of element from the list  
          dll.removeFirstOccurrence("Gaurav");  
          System.out.println("After invoking removeFirstOccurrence() method: "+dll);  
      //Removing last occurrence of element from the list  
          dll.removeLastOccurrence("Harsh");  
          System.out.println("After invoking removeLastOccurrence() method: "+dll);  

          //Removing all the elements available in the list       
          dll.clear();  
          System.out.println("After invoking clear() method: "+dll);   
   }  

}
