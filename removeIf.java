public class BinaryTree<T> {
  public T key;
  public BinaryTreeNode<T> left;
  public BinaryTreeNode<T> rigth;
}

// removes keys which match pred but binary search tree stays consistent
public <T> BinaryTreeNode<T> removeIf (BinaryTreeNode<T> root, Predicate<T> pred) {
  if (root==null) {
    return null;
  }
  if (root.left != null) {
    root.left = removeIf(root.left, pred);
    return root.left;
  }
  if (root.right != null) {
    root.right = removeIf(root.right, pred);
    return root.right;
    
  if (pred.test(root.key)) {
    // remove key and key s.t. search tree consistency
    if (root.left == null && root.right == null) {
      root=null;
      return root;
    }
    if (root.right == null) {
      root = root.left;
      return root;
    }
    if (root.left = null) {
      root=root.right;
      return root;
    }
    else {
      root.key = removeRightMostDescandantAndReturnItsKey(root.left);
      return root;
    }
  }
 }
  public T removeRightMostDescandantAndReturnItsKey(BinaryTreeNode<T> root) {
    if (root.right.right!=null) {
      root=root.right;
      root.key = removeRightMostDescandantAndReturnItsKey(root);
    }
    else {
      returnValue = root.right.key;
      if (root.right.left !=null) {
        root.right = root.right.left;
        root.right.left = null;
      }
      return returnValue;
    }
      
    
      
      
    
    
  
