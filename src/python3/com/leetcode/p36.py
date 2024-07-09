from typing import List


class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        n = 9
        rows = [[False for _ in range(n)] for _ in range(n)]
        cols = [[False for _ in range(n)] for _ in range(n)]
        boxes = [[False for _ in range(n)] for _ in range(n)]

        for row in range(n):
            for col in range(n):
                if board[row][col] == '.':
                    continue
                num = ord(board[row][col]) - ord('1')
                # 가로행 중 num이 있는가?
                if rows[row][num]:
                    return False
                # 세로열 중 num이 있는가?
                if cols[col][num]:
                    return False
                # 3x3 중 num이 있는가?
                box = (row // 3 * 3) + (col // 3)
                if boxes[box][num]:
                    return False
                # 마킹
                rows[row][num] = True
                cols[col][num] = True
                boxes[box][num] = True

        return True
