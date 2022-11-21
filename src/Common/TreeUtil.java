package Common;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeUtil {
    public static TreeNode arrayToTree(Integer[] array) {
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

    public static Integer[] treeToArray(TreeNode root) {
        if (root==null)
            return new Integer[0];

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node=deque.poll();
                if (node!=null)
                    list.add(node.val);
                else
                    list.add(null);
                if (node==null || (deque.isEmpty() && node.left==null && node.right==null))
                    continue;
                deque.offer(node.left);
                deque.offer(node.right);
            }

        }
        int j= list.size()-1;
        while (j >0 && list.get(j)==null ) {
            --j;
        }
        return list.subList(0,j+1).toArray(new Integer[0]);
    }
}
