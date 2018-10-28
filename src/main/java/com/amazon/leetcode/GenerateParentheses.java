package com.amazon.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public List<String> generateParenthesis(int n) {
		if (n < 1) {
			return new ArrayList<>();
		}
		List<String> result = new ArrayList<>();
		StringBuilder sb = new StringBuilder("");
		sb.append('(');
		helper(1, 0, n, sb, result);
		return result;
	}

	private void helper(int left, int right, int n, StringBuilder sb, List<String> results) {
		if (right == n) {
			results.add(sb.toString());
			return;
		}
		if (left < n) {
			sb.append('(');
			helper(left + 1, right, n, sb, results);
			sb.deleteCharAt(sb.length() - 1);
		}
		if (left > right) {
			sb.append(')');
			helper(left, right + 1, n, sb, results);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
