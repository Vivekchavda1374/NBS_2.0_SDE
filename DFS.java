public class DFS {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static void dfs(TreeNode root, String order) {
        if (root == null) return;
        switch (order) {
            case "Pre":
                System.out.print(root.val + " ");
                dfs(root.left, order);
                dfs(root.right, order);
                break;
            case "In":
                dfs(root.left, order);
                System.out.print(root.val + " ");
                dfs(root.right, order);
                break;
            case "Post":
                dfs(root.left, order);
                dfs(root.right, order);
                System.out.print(root.val + " ");
                break;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.print("Preorder: ");
        dfs(root, "Pre");
        System.out.println();

        System.out.print("Inorder: ");
        dfs(root, "In");
        System.out.println();

        System.out.print("Postorder: ");
        dfs(root, "Post");
        System.out.println();
    }
}