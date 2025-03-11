package com.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.Service;

public class ServiceTest {
	@Test
	public void TestEmailOne() {
		Service s=new Service();
		assertTrue(s.validateEmail("abc@xyz.com"));
	}
	
	@Test
	public void TestEmailTwo() {
		Service s=new Service();
		assertFalse(s.validateEmail("abcxyz.com"));
	}

}
