package com.practice.tests;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.is;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.collection.IsIn;
import org.hamcrest.collection.IsMapContaining;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import com.practice.code.BrainTeasers;

public class TestFizzBuzz {

	@Rule
	public ErrorCollector collector = new ErrorCollector();
	
	private Map<Integer, String> _expected;
	
	@Before
	public void Init() {
		_expected = new HashMap<>();
		_expected.put(3, BrainTeasers.FIZZ);
		_expected.put(6, BrainTeasers.FIZZ);
		_expected.put(9, BrainTeasers.FIZZ);
		_expected.put(12, BrainTeasers.FIZZ);
		_expected.put(5, BrainTeasers.BUZZ);
		_expected.put(10, BrainTeasers.BUZZ);
		_expected.put(15, BrainTeasers.FIZZBUZZ);
	}
	
	@Test
	public void testFizzBuzz1() {		
		Map<Integer, String> actual = BrainTeasers.fizzBuzz1(16);
	    check(actual);
	}

	@Test
	public void testFizzBuzz2() {		
		Map<Integer, String> actual = BrainTeasers.fizzBuzz2(16);
	    check(actual);
	}
	
	/**
	 * @param actual
	 */
	private void check(Map<Integer, String> actual) {
		// positive - equality
	    collector.checkThat(actual, is(_expected));
	 
	    // positive - equality
	    collector.checkThat(actual.entrySet(), everyItem(IsIn.isIn(_expected.entrySet())));
	    
	    // positive - size
	    collector.checkThat(actual.size(), is(7));
	    
	    // positive - entry
	    collector.checkThat(actual, IsMapContaining.hasEntry(15, BrainTeasers.FIZZBUZZ));
	    
	    // positive - multiple entries
	    collector.checkThat(actual,
	            allOf(IsMapContaining.hasEntry(3, BrainTeasers.FIZZ),
	                    IsMapContaining.hasEntry(5, BrainTeasers.BUZZ),
	                    IsMapContaining.hasEntry(15, BrainTeasers.FIZZBUZZ)));
/*
	    // negative - entry incorrect value
	    collector.checkThat(actual, IsMapContaining.hasEntry(15, "fizzy"));
	 
	    // negative - entry incorrect key
	    collector.checkThat(actual, IsMapContaining.hasEntry(16, BrainTeasers.FIZZBUZZ));
	 
	    // positive - key
	    collector.checkThat(actual, IsMapContaining.hasKey(16));
	 
	    // positive - value
	    collector.checkThat(actual, IsMapContaining.hasValue("fizzy"));
*/
	}	
}