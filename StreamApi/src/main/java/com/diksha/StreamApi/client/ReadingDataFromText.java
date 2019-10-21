package com.diksha.StreamApi.client;



import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ReadingDataFromText {

	
	  public static void main(String[] args) throws FileNotFoundException {
		  Set<Integer> numbers=new TreeSet<Integer>((p1,p2)->Integer.compare(p2,p1));
		  String filename="C:\\Users\\dibhaler\\eclipse-workspace\\StreamApi\\src\\main\\java\\example.txt";
		    Scanner scanner=new Scanner(new File(filename));
		    while (scanner.hasNextInt()) {
		    	numbers.add(scanner.nextInt());
		    }
		    Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) { 
                System.out.println(iterator.next()); 
            } 
	}

		  
	    
	    
	  
	}

