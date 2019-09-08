package com.string;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;





class DemoTest {

	private static final String ArithmeticException = null;

	// FIRST TEST CASE   Method "assertTrue"
	
	  /*@Test 
	   * void testCompareString() {
	   *  Demo demo = new Demo();
	  assertTrue(demo.compareString("hello", "hello")); }*/
	
	
	// SECOND TEST CASE
	 
	/*@Test
	void testConcatString() {
		Demo demo = new Demo();
		//Second Method "assertEquals".
		assertEquals("HELLOWORLD", demo.concatString("HELLO", "WORLD"));
		assertEquals("HELLOWORLD", demo.concatString("HELLo", "WORLD"));
		assertEquals("HELLOWORLD", demo.concatString("HELLO", "WORLD"));
	}*/
  
	// THIRD TEST CASE
	/*
	@Test
	public void testAddOneToArray()
	{
		Demo demo = new Demo();
		int expected[] = new int[] {3, 8, 4};
		assertArrayEquals( expected, demo.addOneToArray(new int[] {2, 7, 3}));
		
	}*/
	
	// TEST PERFORMANCE OF A METHOD
	/*@Test
	public void testPerformance()
	{
		Demo demo = new Demo();
		demo.performance();
	}*/
	
	
	// EXCEPTION CASES
	@Test
	public void testException() {
		Demo demo = new Demo();
		demo.exception(1);
	}
}
