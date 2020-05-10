package week1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rajuraghuwanshi
 */


public class Solution7 {
    //Definition for a binary tree node.
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static void traversal(TreeNode root, TreeNode parentNode, int x, int y, Map<Integer, Integer[]> map, int d) {

        if (root == null) {
            return;
        }
        if (root.val == x || root.val == x || root.val == y || root.val == y) {

            map.put(root.val, new Integer[]{d, parentNode == null ? root.val : parentNode.val});
        }
        traversal(root.left, root, x, y, map, d + 1);
        traversal(root.right, root, x, y, map, d + 1);
    }

    public boolean isCousins(TreeNode root, int x, int y) {

        if (root == null || (root.left == null && root.right == null)) {
            return false;
        }

        Map<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();
        traversal(root, null, x, y, map, 0);

        Integer[] a = map.get(x);
        Integer[] b = map.get(y);
        //System.out.println(a[0]+" "+b[0]+"  "+a[1]+" "+b[1]);
        return a[0] == b[0] && a[1] != b[1];


    }
}
