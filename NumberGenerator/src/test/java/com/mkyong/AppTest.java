package com.mkyong;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(10, obj.generateUniqueKey().length());

	}
}
