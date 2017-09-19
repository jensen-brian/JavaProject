package com.practice.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.practice.code.MyTestObject;

public class TestMyObject {

	@Test
	public void testEquals() {
		MyTestObject one = new MyTestObject("Luke", "Skywalker", 21);
		MyTestObject two = new MyTestObject("Luke", "Skywalker", 21);
		assertEquals(one, two);
	}
	
	@Test
	public void testNotEquals() {
		MyTestObject one = new MyTestObject("Luke", "Skywalker", 21);
		MyTestObject two = new MyTestObject("Han", "Solo", 34);
		assertNotEquals(one, two);
	}
	
	@Test
	public void testNotEqualsFirstName() {
		MyTestObject one = new MyTestObject("Anakin", "Skywalker", 21);
		MyTestObject two = new MyTestObject("Luke", "Skywalker", 21);
		assertNotEquals(one, two);
	}
	
	@Test
	public void testNotEqualsLastName() {
		MyTestObject one = new MyTestObject("Luke", "Jedi", 21);
		MyTestObject two = new MyTestObject("Luke", "Skywalker", 21);
		assertNotEquals(one, two);
	}
	
	@Test
	public void testNotEqualsAge() {
		MyTestObject one = new MyTestObject("Luke", "Skywalker", 21);
		MyTestObject two = new MyTestObject("Luke", "Skywalker", 12);
		assertNotEquals(one, two);
	}

	@Test
	public void testHashCodeLookupSuccessDifferentObjects() {
		MyTestObject one = new MyTestObject("Luke", "Skywalker", 21);
		MyTestObject two = new MyTestObject("Luke", "Skywalker", 21);
		
		Map<MyTestObject, Integer> map = new HashMap<>();
		map.put(one, one.getAge());
		
		assertTrue(map.containsKey(two));
		assertFalse(one == two);
	}

	@Test
	public void testHashCodeLookupSuccessSameObjects() {
		MyTestObject one = new MyTestObject("Luke", "Skywalker", 21);
		MyTestObject two = one;
		
		Map<MyTestObject, Integer> map = new HashMap<>();
		map.put(one, one.getAge());
		
		assertTrue(map.containsKey(two));
		assertTrue(one == two);
	}

	@Test
	public void testHashCodeLookupFailure() {
		MyTestObject one = new MyTestObject("Luke", "Skywalker", 21);
		MyTestObject two = new MyTestObject("Han", "Solo", 34);
		
		Map<MyTestObject, Integer> map = new HashMap<>();
		map.put(one, one.getAge());
		
		assertFalse(map.containsKey(two));
	}
}