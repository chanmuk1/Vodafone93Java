package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticOperationTest {
	
	private ArithmeticOperation ob;
	
	
	@BeforeAll
	static void initBeforeAll() {
		System.out.println("EXECUTE 1st.....");
	}
	
	@BeforeEach
	void initEach() {
		ob = new ArithmeticOperation();
		System.out.println("INSIDE BEFORE EACH INIT EACH");
	}
	
	@AfterEach
	void cleanmemory() {
		System.out.println("INSIDE AFTER EACH CLEAN MEMORY");
	}
	

	@Test
	void testAdd() {
		//fail("Not yet implemented");
		
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
		
		assertThrows(ArithmeticException.class, () -> ob.div(1, 0), 
				"Divide should throw ArithmeticException when denominator is zero");
		
//		assertThrows(ArithmeticException.class, () -> ob.div(10, 5), 
//				"Divide should throw ArithmeticException when denominator is zero");
	}

}
