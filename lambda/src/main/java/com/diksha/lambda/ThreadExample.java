package com.diksha.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ThreadExample extends Thread {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(412);
		numbers.add(345);
		numbers.add(214);
		numbers.add(324);
		numbers.add(232);
		Thread t=new Thread(new Runnable()
				{
			
			@Override
			public void run() {
				Consumer<Integer> display=(i)->System.out.println(i);
				numbers.forEach(display);
				
			}});
		t.start();
		
		
	}

}
