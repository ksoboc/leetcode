package AllNodesDistanceKinBinaryTree;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(5);
        root.right=new TreeNode(1);
        root.left.left=new TreeNode(6);
        root.left.right=new TreeNode(2);
        root.left.right.left=new TreeNode(7);
        root.left.right.right=new TreeNode(4);

        root.right.left=new TreeNode(0);
        root.right.right=new TreeNode(8);
        var res = solution.distanceK(root,root.left,2);
        System.out.println("res = " + res);
        assertEquals(List.of(7,4,1),res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(1);
        var res = solution.distanceK(root,root,3);
        System.out.println("res = " + res);
        assertEquals(Collections.emptyList(),res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(0);
        root.left=new TreeNode(1);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(2);
        var res = solution.distanceK(root,root.left.right,1);
        System.out.println("res = " + res);
        assertEquals(List.of(1),res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(0);
        root.left=new TreeNode(1);
        root.left.right=new TreeNode(2);
        root.left.right.right=new TreeNode(3);
        root.left.right.right.right=new TreeNode(4);
        var res = solution.distanceK(root,root.left.right.right,0);
        System.out.println("res = " + res);
        assertEquals(List.of(3),res);
    }

}