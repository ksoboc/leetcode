package ConstructQuadTree;

public class Solution2 {
    public Node construct(int[][] grid) {
        return construct(grid, 0, 0, grid.length);
    }

    private Node construct(int[][] grid, int i, int j, int w) {
        if (allSame(grid, i, j, w))
            return new Node(grid[i][j] == 1, true);

        Node node = new Node(true, false);
        int w2 = w / 2;
        node.topLeft = construct(grid, i, j, w2);
        node.topRight = construct(grid, i, j + w2, w2);
        node.bottomLeft = construct(grid, i + w2, j, w2);
        node.bottomRight = construct(grid, i + w2, j + w2, w2);
        return node;
    }

    private boolean allSame(int[][] grid, int i, int j, int w) {
        for (int x = i; x < i + w; ++x)
            for (int y = j; y < j + w; ++y)
                if (grid[x][y] != grid[i][j])
                    return false;
        return true;
    }
}
