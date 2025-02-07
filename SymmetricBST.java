// Time Complexity : O(n*n)
// Space Complexity :  O(1) 



public class SymmetricBST {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);    
    }
    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        
        if (left.val != right.val ){
            return false;
        }
        
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left) ;   
    }
}
