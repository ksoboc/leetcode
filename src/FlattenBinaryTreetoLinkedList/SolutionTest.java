package FlattenBinaryTreetoLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        solution.flatten(root);

        System.out.println("root.val = " + root.val);

        for (var node=root;node.right!=null;node=node.right)
            System.out.print(node.val + " ");
    }

}