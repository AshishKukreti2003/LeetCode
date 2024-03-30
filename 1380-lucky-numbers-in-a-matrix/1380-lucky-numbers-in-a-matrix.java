class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] minInRow = new int[rows];
        for (int i = 0; i < rows; i++) {
            int minRow = Integer.MAX_VALUE;
            for (int j = 0; j < cols; j++) {
                minRow = Math.min(minRow, matrix[i][j]);
            }
            minInRow[i] = minRow;
        }

        int[] maxInCol = new int[cols];
        for (int j = 0; j < cols; j++) {
            int maxCol = Integer.MIN_VALUE;
            for (int i = 0; i < rows; i++) {
                maxCol = Math.max(maxCol, matrix[i][j]);
            }
            maxInCol[j] = maxCol;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == minInRow[i] && matrix[i][j] == maxInCol[j]) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }

        return luckyNumbers;
    }
}