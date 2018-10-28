package com.amazon.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
	public List<List<String>> partition(String s) {
		List<List<String>> ans = new ArrayList<List<String>>();
		if (s == null || s.length() == 0) {
			return ans;
		}
		List<String> walker = new ArrayList<>();
		helper(ans, walker, 0, s);
		return ans;
	}

	private void helper(List<List<String>> ans, List<String> walker, int curPos, String s) {
		if (curPos == s.length()) {
			ans.add(walker);
			return;
		}
		for (int i = curPos + 1; i <= s.length(); i++) {
			if (isPalindrome(curPos, i, s)) {
				walker.add(s.substring(curPos, i));
				helper(ans, walker, i, s);
				walker.remove(walker.size() - 1);
			}
		}
	}

	private boolean isPalindrome(int curPos, int i, String s) {
		int left = curPos;
		int right = i - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
