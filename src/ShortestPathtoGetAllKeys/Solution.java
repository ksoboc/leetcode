package ShortestPathtoGetAllKeys;

import java.util.*;

public class Solution {
    private class Position {
        int r;
        int c;
        int len;
        int keysBitmap;


        public Position(int r, int c, int len, int keysBitmap) {
            this.r = r;
            this.c = c;
            this.len = len;
            this.keysBitmap = keysBitmap;
        }


    }

    public int shortestPathAllKeys(String[] grid) {
        final int n = grid.length;
        final int m = grid[0].length();

        int sr = 0, sc = 0;
        int nrKeys = 1;
        for (int r = 0; r < grid.length; ++r) {
            var s = grid[r];
            var c = s.indexOf('@');
            if (c >= 0) {
                sr = r;
                sc = c;
            }
            for (int i = 0; i < 6; i++) {
                if (s.indexOf('a' + i) >= 0)
                    ++nrKeys;
            }
        }

        final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        boolean[][] visited = new boolean[1 << nrKeys][n * m];

        int allKeys = (1 << nrKeys) - 1;

        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(sr, sc, 0, 1));
        while (!queue.isEmpty()) {
            var currPos = queue.poll();
            var r = currPos.r;
            var c = currPos.c;
            var len = currPos.len;
            var keyBitmap = currPos.keysBitmap;
            if (keyBitmap == allKeys) {
                return len;
            }
            for (var dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    char ch = grid[nr].charAt(nc);
                    if (ch == '#')
                        continue;
                    if (Character.isLetter(ch) && Character.isUpperCase(ch)) {
                        int keyBit = 1 << (ch - 'A' + 1);
                        if ((keyBit & keyBitmap) == 0)
                            continue;
                    }
                    var nKeyBitMap = keyBitmap;
                    if (Character.isLetter(ch) && Character.isLowerCase(ch)) {
                        nKeyBitMap |= 1 << (ch - 'a' + 1);
                    }
                    if (!visited[nKeyBitMap][nr * m + nc]) {
                        visited[nKeyBitMap][nr * m + nc] = true;
                        var pos = new Position(nr, nc, len + 1, nKeyBitMap);
                        queue.offer(pos);
                    }
                }
            }
        }
        return -1;
    }
}
