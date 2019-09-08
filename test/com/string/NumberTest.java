package com.string;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberTest {

	@Test
	void test() {
		Number number = new Number();
		assertTrue("SAME", number.testNumber(2, 2));
	}

}
