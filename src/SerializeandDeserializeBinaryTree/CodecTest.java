package SerializeandDeserializeBinaryTree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CodecTest {
    @Test
    void test1() {
        //root = [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);


        TreeNode nodeL = new TreeNode(9);


        TreeNode nodeR = new TreeNode(20);


        root.left = nodeL;
        root.right = nodeR;

        nodeL = new TreeNode(15);

        nodeR = new TreeNode(7);


        root.right.left = nodeL;
        root.right.right = nodeR;

        Codec codec = new Codec();
        System.out.println(codec.serialize(root));


    }

    @Test
    void test2() {
        Codec codec = new Codec();
        TreeNode treeNode = codec.deserialize("[3,9,20,null,null,15,7]");
        System.out.println(treeNode);
    }

    // [1,2,3,null,null,4,5,6,7]
    @Test
    void test3() {
        Codec codec = new Codec();
        TreeNode treeNode = codec.deserialize("[1,2,3,null,null,4,5,6,7]");
        System.out.println(treeNode);
    }
    // [4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]
    @Test
    void test4() {
        Codec codec = new Codec();
        String ex = "[4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]";
        TreeNode treeNode = codec.deserialize(ex);
        String s = codec.serialize(treeNode);
        assertEquals(ex,s);
    }

}