class Solution {

    public int countServers(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int communicableServersCount = 0;

        for (int rowIndex = 0; rowIndex < rows; ++rowIndex) {
            int rowCounts = 0;
            int serverColumnIndex = -1;

            for (int colIndex = 0; colIndex < cols; ++colIndex) {
                if (grid[rowIndex][colIndex] == 1) {
                    if (rowCounts == 0) {
                        serverColumnIndex = colIndex;
                    }
                    rowCounts++;
                }
            }

            boolean canCommunicate = (rowCounts != 1);

            if (!canCommunicate) {
                for (int i = 0; i < rows; ++i) {
                    if (i != rowIndex && grid[i][serverColumnIndex] == 1) {
                        canCommunicate = true;
                        break;
                    }
                }
            }

            if (canCommunicate) {
                communicableServersCount += rowCounts;
            }
        }

        return communicableServersCount;
    }
}