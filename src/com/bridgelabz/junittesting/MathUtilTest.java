package com.bridgelabz.junittesting;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.util.MathUtil;

public class MathUtilTest {

	@Test
	public void addTesting1() {
		int result  = MathUtil.add(5, 10);
		int expected = 16;
		Assert.assertEquals(expected, result);;
	}
	
	@Test
	public void addTesting2() {
		int result  = MathUtil.add(6, 10);
		int expected = 16;
		Assert.assertEquals(expected, result);;
	}
	
	@Test
	public void addTesting3() {
		int result  = MathUtil.add(1000, 10);
		int expected = 1010;
		Assert.assertEquals(expected, result);;
	}
	
	@Test
	public void subTesting() {
		int result  = MathUtil.sub(15, 10);
		int expected = 5;
		Assert.assertEquals(expected, result);
	}
}
