package com.amazon.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amazon.leetcode.LongestPalindromicSubstring;

public class LongestPalindromicSubstringTest {
	
	private LongestPalindromicSubstring obj = new LongestPalindromicSubstring();

	@Test
	public void testLongestPalindrome() throws Exception {
		String s1 = "babad";
		assertEquals("bab", obj.longestPalindrome(s1));
		String s2 = "cbbd";
		assertEquals("bb", obj.longestPalindrome(s2));
	}

}
