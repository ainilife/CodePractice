package com.ainilife.algorithm.twosum;

import junit.framework.Assert;

import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test() {
		int[] numbers = new int[] { 2, 7, 11, 15 };
		int target = 9;

		int[] result = solution.twoSum(numbers, target);

		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(2, result[1]);
	}

	@Test
	public void test1() {
		int[] numbers = new int[] { 2, 7, 11, 15 };
		int target = 13;

		int[] result = solution.twoSum(numbers, target);

		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(3, result[1]);
	}

	@Test
	public void test2() {
		int[] numbers = new int[] { 2, 7, 11, 15 };
		int target = 22;

		int[] result = solution.twoSum(numbers, target);

		Assert.assertEquals(2, result[0]);
		Assert.assertEquals(4, result[1]);
	}

	@Test
	public void test3() {
		int[] numbers = new int[] { 3, 2, 4 };
		int target = 6;

		int[] result = solution.twoSum(numbers, target);

		Assert.assertEquals(2, result[0]);
		Assert.assertEquals(3, result[1]);
	}
}
