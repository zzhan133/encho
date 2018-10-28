package com.amazon.leetcode;

public class EditDistance {
	public int minDistance(String word1, String word2) {
		if (word1 == null && word2 == null) {
			return 0;
		}
		if (word1 == null) {
			return word2.length();
		}
		if (word2 == null) {
			return word1.length();
		}
		int m = word1.length();
		if (m == 0) {
			return word2.length();
		}
		int n = word2.length();
		if (n == 0) {
			return word1.length();
		}
		int[][] matrix = new int[m + 1][n + 1];
		// calculate matrix[m][n]
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[0][i] = i;
		}
		for (int j = 0; j <= m; j++) {
			matrix[j][0] = j;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (word1.charAt(j) == word2.charAt(i)) {
					matrix[i][j] = Math.min(matrix[i - 1][j - 1], Math.min(matrix[i][j - 1] + 1, matrix[i - 1][j] + 1));
				} else {
					matrix[i][j] = Math.min(matrix[i - 1][j - 1] + 1,
							Math.min(matrix[i][j - 1] + 1, matrix[i - 1][j] + 1));
				}
			}
		}
		return Math.max(m, n) - matrix[m][n];

	}

}
