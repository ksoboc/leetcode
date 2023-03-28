package ConstructQuadTree;

public class Solution {
    private final Node zeroLeaf = new Node(false,true);
    private final Node oneLeaf = new Node(true,true);

    public Node construct(int[][] grid) {
        return construct(grid, 0, 0, grid.length);
    }

    private Node construct(int[][] grid, int r, int c, int n) {
        if (n == 1) {
            return grid[r][c] == 1 ? oneLeaf:zeroLeaf;
        }
        int n2 = n / 2;
        Node n00 = construct(grid, r, c, n2);
        Node n01 = construct(grid, r, c + n2, n2);
        Node n10 = construct(grid, r + n2, c, n2);
        Node n11 = construct(grid, r + n2, c + n2, n2);
        if (n00.isLeaf && n01.isLeaf && n10.isLeaf && n11.isLeaf) {
            if (n00.val == n01.val && n01.val == n10.val && n10.val == n11.val) {
                return n00;
            }
        }
        return new Node(false, false, n00, n01, n10, n11);
    }
}

class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;


    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}