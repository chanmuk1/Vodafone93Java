package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticOperationTest {

	@Test
	void testAdd() {
		//fail("Not yet implemented");
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

	@Test
	void testDiv() {
		//fail("Not yet implemented");
		ArithmeticOperation ob= new ArithmeticOperation();
		//assertThrows(ArithmeticException.class, () -> ob.div(1, 0), 
		//				"Divide should throw ArithmeticException when denominator is zero");
				
		assertThrows(ArithmeticException.class, () -> ob.div(10, 5), 
						"Divide should throw ArithmeticException when denominator is zero");
	}

}
