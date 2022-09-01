package SerializeandDeserializeBinaryTree;

import java.util.*;
import java.util.stream.Collectors;

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {


        LinkedList<TreeNode> deque = new LinkedList<>();
        if (root != null)
            deque.add(root);

        List<Integer> nodes = new ArrayList<>();
        while (!deque.isEmpty()) {
            TreeNode node = deque.removeLast();
            if (node == null) {
                nodes.add(null);
            } else {
                nodes.add(node.val);

                deque.addFirst(node.left);
                deque.addFirst(node.right);

            }


        }
        var i = nodes.size() - 1;
        while (nodes.get(i) == null) {
            nodes.remove(i--);
        }

        String res = nodes.stream().map(x -> x == null ? "null" : Integer.toString(x)).collect(Collectors.joining(",", "[", "]"));
        return res;

    }

    // Decodes your encoded data to tree.

    public TreeNode deserialize(String data) {

        data = data.substring(1);
        data = data.substring(0,data.length()-1);
        data = data.trim();
        String[] values = data.split(", *");
        Deque<String> deque = new ArrayDeque<String>(Arrays.asList(values));


        return ds(deque, 1).get(0);
    }

    public List<TreeNode> ds(Deque<String> values, int lvlSize) {

        if (values.isEmpty())
            return null;

        List<TreeNode> list = new ArrayList<>();
        int numOfNonNullNodes = 0;
        for (int i=0;i< lvlSize;++i) {
            String val = values.poll();
            TreeNode node;
            if ("null".equals(val) || val==null || val.isBlank()) {
                node = null;
            } else {
                node = new TreeNode(Integer.parseInt(val));
                ++numOfNonNullNodes;
            }
            list.add(node);
        }

        List<TreeNode> nextLevel = ds(values, numOfNonNullNodes*2);
        if (nextLevel!=null) {
            int j = 0;
            for (int i = 0; i < list.size(); ++i) {
                if (list.get(i)==null) continue;
                list.get(i).left = j < nextLevel.size() ? nextLevel.get(j) : null;
                ++j;
                list.get(i).right = j < nextLevel.size() ? nextLevel.get(j) : null;
                ++j;
            }
        } else {
            for (TreeNode treeNode:list) {
                if (treeNode!=null) {
                    treeNode.left = null;
                    treeNode.right = null;
                }
            }
        }




        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
