package CheckifMoveisLegal;

public class Solution {
    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        int nRows = board.length;
        int nCols = board[0].length;
        int [][] directions = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{-1,1},{-1,-1},{1,-1}};

        for (var dir :
                directions) {
            if (isValidLine(board, rMove, cMove, color, nRows, nCols, dir))
                return true;
        }
        return false;

    }

    private boolean isValidLine(char[][] board, int rMove, int cMove, char color, int nRows, int nCols, int[] dir) {
        int dx = dir[0];
        int dy = dir[1];
        int length = 1;
        int x= rMove +dx;
        int y= cMove +dy;
        while (x>=0 && x< nRows && y>=0 && y< nCols) {
            ++length;
            if (board[x][y]=='.')
                break;
            if (board[x][y]== color)
                return length>=3;
            x+=dx; y+=dy;
        }
        return false;
    }
}
