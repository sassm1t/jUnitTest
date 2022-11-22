package junitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	public void test() {
		junitFunction junit = new junitFunction();
		int result = junit.AddNumbers(100, 200);
		assertEquals(300,result);
	}

}
