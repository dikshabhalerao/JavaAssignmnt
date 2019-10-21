package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.Addition;

public class MyappTest {

	@Test
	public void testAdditionCheckWithPositiveNumbers() {
		assertEquals(12, Addition.add(7,5));
	}
	@Test
	public void testAdditionCheckWithNegativeNumbers() {
		assertEquals(-10, Addition.add(-4, -6));
	}
	@Test
	public void testAdditionCheckWithOnePositiveAndOneNegativeNumbers() {
		assertEquals(9, Addition.add(19,-10));
	}

}
