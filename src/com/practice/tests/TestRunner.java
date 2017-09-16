package com.practice.tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] arsg) {
		Result result = JUnitCore.runClasses(TestFizzBuzz.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result == " + result.wasSuccessful());
	}
}