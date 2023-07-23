package AllPossibleFullBinaryTrees;


import java.util.ArrayList;
import java.util.List;

public class SolutionDP {

    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) {
            return new ArrayList<>();
        }

        List<List<TreeNode>> dp = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            dp.add(new ArrayList<>());
        }

        dp.get(1).add(new TreeNode(0));
        for (int count = 3; count <= n; count += 2) {
            for (int i = 1; i < count - 1; i += 2) {
                int j = count - 1 - i;
                for (TreeNode left : dp.get(i)) {
                    for (TreeNode right : dp.get(j)) {
                        TreeNode root = new TreeNode(0);
                        root.left=left;
                        root.right=right;
                        dp.get(count).add(root);
                    }
                }
            }
        }

        return dp.get(n);
    }


}


