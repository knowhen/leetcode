package com.when.leetcode.solution;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
@RunWith(Parameterized.class)
public class IsPalindromeTest {
	private Integer number;
	private Boolean expected;

	private IsPalindrome isPalindrome;

	public IsPalindromeTest(int number, boolean expected) {
		this.number = number;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static List EvenNumbers() {
		return Arrays.asList(new Object[][]{
				{1, false},
				{2, true},
				{3, false},
				{4, true},
				{5, false},
		});
	}

	@Before
	public void setUp() {
		isPalindrome = new IsPalindrome();
	}

	@Test
	public void testEvenNumber() {
		boolean evenNumber = isPalindrome.isEvenNumber(number);
		assertEquals(expected, evenNumber);
	}

	
}