package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class Test1 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
	
	@Test
	public void test() {
		
		String msg ="thank you for sharing of project";
		
		Thank thank = new Thank();
		String show = thank.show();
		
		
		assertEquals(msg, show);
		
	}

}
