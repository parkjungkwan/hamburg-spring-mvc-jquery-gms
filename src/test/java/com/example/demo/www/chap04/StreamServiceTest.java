package com.example.demo.www.chap04;

import static org.junit.jupiter.api.Assertions.*;
import static java.util.Arrays.asList;
import org.junit.jupiter.api.Test;
class StreamServiceTest {
	StreamService s = new StreamService();
	@Test
	void bookTitle() {
		assertTrue(asList("Java8", "Lambdas", "In", "Action").equals(s.bookTitle()));
	}
	@Test
	void menu() {
		assertEquals(9,s.menu().size());
	}
	@Test
	void filterByWeight() {
		assertTrue(asList(new Dish("pork", false, 800, Type.MEAT))
				.equals(s.filterByWeight(700)) );
	}

}
