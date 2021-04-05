package com.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void callBeforeClass() {
		System.out.println("called before all");
	}
	@Before
	public void callBefore() {
		System.out.println("called before");
	}
	@Before
	public void callBefore2() {
		System.out.println("called before 2");
	}
	@Test
	public void testAdd() {
		assertEquals(30, new Calculator().add(15, 15));
	}
	
	@Test
	public void testMul() {
		assertEquals(225, new Calculator().mul(15, 15));
	}

}
