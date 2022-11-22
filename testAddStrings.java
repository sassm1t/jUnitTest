package junitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	public void test() {
		junitFunction junitstring = new junitFunction();
		String result = junitstring.AddStrings("hello", "sir");
		assertEquals("hellosir",result);
	}

}
