package Common;


import java.util.*;

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


    public static void printTree(TreeNode root)
    {
        List<List<String>> lines = new ArrayList<List<String>>();

        List<TreeNode> level = new ArrayList<>();
        List<TreeNode> next = new ArrayList<>();

        level.add(root);
        int nn = 1;

        int widest = 0;

        while (nn != 0) {
            List<String> line = new ArrayList<String>();

            nn = 0;

            for (var n : level) {
                if (n == null) {
                    line.add(null);

                    next.add(null);
                    next.add(null);
                } else {
                    String aa = Integer.toString(n.val);
                    line.add(aa);
                    if (aa.length() > widest) widest = aa.length();

                    next.add(n.left);
                    next.add(n.right);

                    if (n.left != null) nn++;
                    if (n.right != null) nn++;
                }
            }

            if (widest % 2 == 1) widest++;

            lines.add(line);

            List<TreeNode> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int) Math.floor(perpiece / 2f) - 1;

            if (i > 0) {
                for (int j = 0; j < line.size(); j++) {

                    // split node
                    char c = ' ';
                    if (j % 2 == 1) {
                        if (line.get(j - 1) != null) {
                            c = (line.get(j) != null) ? '┴' : '┘';
                        } else {
                            if (j < line.size() && line.get(j) != null) c = '└';
                        }
                    }
                    System.out.print(c);

                    // lines and spaces
                    if (line.get(j) == null) {
                        for (int k = 0; k < perpiece - 1; k++) {
                            System.out.print(" ");
                        }
                    } else {

                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? " " : "─");
                        }
                        System.out.print(j % 2 == 0 ? "┌" : "┐");
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? "─" : " ");
                        }
                    }
                }
                System.out.println();
            }

            // print line of numbers
            for (int j = 0; j < line.size(); j++) {

                String f = line.get(j);
                if (f == null) f = "";
                int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
                int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

                // a number
                for (int k = 0; k < gap1; k++) {
                    System.out.print(" ");
                }
                System.out.print(f);
                for (int k = 0; k < gap2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            perpiece /= 2;
        }
    }
}
