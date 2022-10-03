package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticOperationTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		//System.out.println("INSIDE JUNIT TEST CASE");
		
		ArithmeticOperation ob= new ArithmeticOperation();
		int expected = 20;
		
		//int actual = ob.add(15, 5);
		//int actual = ob.add(15, 10);
		//assertEquals(expected, actual);
		//assertEquals(expected, actual,"SUM SHOULD BE 20");
		
		int actual = ob.add(15, 10);
		//int actual = ob.add(15, 5);
		assertNotEquals(expected, actual,"NOT EQUAL TO 20");
	}

}
