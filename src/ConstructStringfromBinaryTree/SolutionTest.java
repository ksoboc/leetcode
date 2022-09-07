package ConstructStringfromBinaryTree;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        TreeNode root = arrayToTree(new Integer[]{1,2,3,4});
        Solution solution=new Solution();
        var str = solution.tree2str(root);
        System.out.println("str = " + str);
        assertEquals("1(2(4))(3)", str);
    }
    @Test
    void test2() {
        TreeNode root = arrayToTree(new Integer[]{1,2,3,null,4});
        Solution solution=new Solution();
        var str = solution.tree2str(root);
        System.out.println("str = " + str);
        assertEquals("1(2()(4))(3)",str);
    }

    private TreeNode arrayToTree(Integer[] array) {
        if (array.length==0)
            return null;
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int pos=1;
        while (!queue.isEmpty()) {
            TreeNode left=null;
            TreeNode right=null;
            if (pos<array.length && array[pos]!=null) {
                left=new TreeNode(array[pos]);
                queue.offer(left);
            }
            ++pos;
            if (pos<array.length && array[pos]!=null) {
                right=new TreeNode(array[pos]);
                queue.offer(right);
            }
            ++pos;

            TreeNode parent= queue.poll();
            parent.left=left;
            parent.right=right;


        }
        return root;
    }
}