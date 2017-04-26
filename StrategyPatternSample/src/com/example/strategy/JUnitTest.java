package com.example.strategy;

import org.junit.Test;

public class JUnitTest {

	Context context;
	
	@Test
	public void testFirstStrategy() {
		System.out.println("!!!first context");
		context = new Context(new FirstStrategy());
		context.operate();
	}

	@Test
	public void testSecondStrategy(){
		System.out.println("!!!second context");
		context = new Context(new SecondStrategy());
		context.operate();
	}
	
	@Test
	public void testThirdStrategy(){
		System.out.println("!!!third context");
		context = new Context(new ThirdStrategy());
		context.operate();
	}
}
