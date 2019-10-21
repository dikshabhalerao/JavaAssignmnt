package com.Assignment.diksha.collections;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class AdditionTest {

	@Test
	public void testOfAdditionOfTwoNumbers() {
	assertEquals(12,Addition.addition(5,7));
	}
	
	@Test
	public void testOfAdditionOfTwoNegativeNumbers() {
	assertEquals(-15,Addition.addition(-5,-10));
	}
	
	@Test
	public void testOfAdditionOfOneNegativeOnePositiveNumber() {
	assertEquals(5,Addition.addition(-5,10));
	}
	
	}

