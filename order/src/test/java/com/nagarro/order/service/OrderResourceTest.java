package com.nagarro.order.service;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OrderResourceTest {
	
	@Test
	public void testOrder() {
		MatcherAssert.assertThat("Chetan", CoreMatchers.is("Chetan"));
	}

}
