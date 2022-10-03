package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateNameTest {

	@Test
	void testIsValidUserName() {
		
		ValidateName obj = new ValidateName();
		
		String userName = "Chandan";
		assertTrue(obj.isValidUserName(userName));
		
		String userName1 = "Chan dan";
		assertFalse(obj.isValidUserName(userName1));
		
		String userName2 = "Chan@dan";
		assertFalse(obj.isValidUserName(userName2));
		
		String userName3 = "Chan_Dan";
		assertFalse(obj.isValidUserName(userName3));
		
		String userName4 = "Chan/Dan";
		assertFalse(obj.isValidUserName(userName4));
		
		String userName5 = "Chan#Dan";
		assertFalse(obj.isValidUserName(userName5));

	}

}
