package com.mv.leetCode;

import java.util.ArrayList;
import java.util.List;

public class NQueensTwo {
    public int totalNQueens(int n) {
		char[][] board = new char[n][n];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = '.';
			}
		}
		return nQueens(0, board);
    }
    
	private int nQueens(int targetLevel, char[][] board) {
		if (targetLevel == board.length) {
			return 1;
		}
		int ans = 0;
		List<Boolean> candidates = getCandicates(board, targetLevel);
		for (int pos = 0; pos < candidates.size(); pos++) {
			if (candidates.get(pos)) {
				board[targetLevel][pos] = 'Q';
				ans = ans + nQueens(targetLevel + 1, board);
				board[targetLevel][pos] = '.';
				
			}
		}
		return ans;
	}

	private List<Boolean> getCandicates(char[][] board, int targetLevel) {
		List<Boolean> candicates = new ArrayList<>();
		for (int i = 0; i < board.length; i++) {
			candicates.add(true);
		}
		if (targetLevel > 0) {
			for (int i = 0; i < targetLevel; i++) {
				for (int j = 0; j < board.length; j++) {
					if (board[i][j] == 'Q') {
						candicates.set(j, false);
						// cross attack
						int rowPos = i, leftColPos = j, rightColPos = j;
						while (rowPos < targetLevel) {
							rowPos++;
							leftColPos--;
							rightColPos++;
						}
						if (leftColPos >= 0 && leftColPos < board.length)
							candicates.set(leftColPos, false);
						if (rightColPos >= 0 && rightColPos < board.length)
							candicates.set(rightColPos, false);
					}
				}
			}
		}
		return candicates;
	}

}
