class Solution {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return helper(root).node;
    }
    private Pair helper(TreeNode node) {
        if (node == null) return new Pair(null, 0);
        Pair left = helper(node.left);
        Pair right = helper(node.right);
        if (left.depth == right.depth) return new Pair(node, left.depth + 1);
        return left.depth > right.depth ? new Pair(left.node, left.depth + 1)
                                       : new Pair(right.node, right.depth + 1);
    }
    private static class Pair {
        TreeNode node;
        int depth;
        Pair(TreeNode n, int d) {
            node = n;
            depth = d;
        }
    }
}