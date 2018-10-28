package com.amazon.leetcode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class GenerateParenthesesTest {

	@Test
	public void testGenerateParenthesis() throws Exception {
		GenerateParentheses obj = new GenerateParentheses();
		List<String> actual = obj.generateParenthesis(3);
		System.out.println(actual);
		assertThat(actual.size(), is(5));
	}

	@Test
	public void testGenerateParenthesis1() throws Exception {
		GenerateParentheses obj = new GenerateParentheses();
		List<String> expected = obj.generateParenthesis(1);
		assertThat(expected.size(), is(1));
	}

	@Test
	public void testGenerateParenthesis2() throws Exception {
		GenerateParentheses obj = new GenerateParentheses();
		List<String> expected = obj.generateParenthesis(2);
		assertThat(expected.size(), is(2));
	}

}
