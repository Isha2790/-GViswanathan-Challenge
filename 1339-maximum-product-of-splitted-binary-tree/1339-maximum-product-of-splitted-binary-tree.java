class Solution {
    long total = 0, max = 0;
    int mod = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        total = sum(root);
        findMax(root);
        return (int)(max % mod);
    }

    private long sum(TreeNode node) {
        if (node == null) return 0;
        return node.val + sum(node.left) + sum(node.right);
    }

    private long findMax(TreeNode node) {
        if (node == null) return 0;
        long curr = node.val + findMax(node.left) + findMax(node.right);
        max = Math.max(max, curr * (total - curr));
        return curr;
    }
}