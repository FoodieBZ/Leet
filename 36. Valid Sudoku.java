class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> grid = new HashSet<>();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char num = board[r][c];
                if (num == '.') {
                    continue;
                }
                if (grid.contains(num + " in row " + r) || grid.contains(num + " in column " + c) || grid.contains(num + " in block " + r / 3 + ", " + c / 3)) {
                    return false;
                }
                grid.add(num + " in row " + r);
                grid.add(num + " in column " + c);
                grid.add(num + " in block " + r / 3 + ", " + c / 3);
            }
        }
        return true;
    }
}
