package com.diksha.lambda;

import java.util.HashMap;
import java.util.Map;

public class IterationOfMapDemo {


public static void main(String[] args) {
	Map<Integer, String> watches=new HashMap<>();
	watches.put(1, "Mi");
	watches.put(2, "Titan");
	watches.put(3, "Sonata");
	watches.put(4,"fastrack");
	System.out.println(watches);

    StringBuilder str=new StringBuilder();
    for(Map.Entry<Integer, String> keyvalue :watches.entrySet()) {
    	str.append(keyvalue.getKey());
    	str.append(keyvalue.getValue());
    	    	
    }
    System.out.println(str.toString());
   
    
    
}}