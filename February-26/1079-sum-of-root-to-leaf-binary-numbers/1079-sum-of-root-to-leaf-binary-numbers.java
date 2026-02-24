/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
  int res = 0;

  public int sumRootToLeaf(TreeNode root) {

    return backtrack(root, 0);
  }

  public int backtrack(TreeNode temp, int num) {
    if (temp == null)
      return 0;
    if (temp.left == null && temp.right == null) {
      return (num << 1) | (temp.val);
    }
    return backtrack(temp.left, (num << 1) | (temp.val)) + backtrack(temp.right, (num << 1) | (temp.val));

  }
}