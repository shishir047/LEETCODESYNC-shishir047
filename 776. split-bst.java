/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public TreeNode[] splitBST(TreeNode root, int target) {
        // Base case: if root is null, return an array with two null elements
        if (root == null) {
            return new TreeNode[2];
        }

        // If root's value is greater than target, recursively split left subtree
        if (root.val > target) {
            TreeNode[] left = splitBST(root.left, target);
            // Attach the right part of the split to root's left subtree
            root.left = left[1];
            return new TreeNode[] { left[0], root };
        } else {
            // Otherwise, recursively split right subtree
            TreeNode[] right = splitBST(root.right, target);
            // Attach the left part of the split to root's right subtree
            root.right = right[0];
            return new TreeNode[] { root, right[1] };
        }
    }
}