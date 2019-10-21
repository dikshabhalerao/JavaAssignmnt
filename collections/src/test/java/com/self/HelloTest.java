package com.self;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	 String message = "Hello World";	
	   Message messageUtil = new Message(message);

	   @Test
	   public void testPrintMessage() {
	      assertEquals(message,messageUtil.printMessage());
	   }
}
