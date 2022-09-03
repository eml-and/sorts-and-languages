public class TernaryTreeNode<T> {
  public T key1;
  public T key2;
  public TernaryTreeNode<T> left;
  public TernaryTreeNode<T> middle;
  public TernaryTreeNode<T> right;
  }
  
public void makeBinary(TernaryTreeNode<T> root) {
  if (root==null) {
  return null;
  }
  if (root.key2 != null) {
    
    if (root.right.key2 !=null) {
      makeBinary(root.right);
    }
    if (root.middle.key2 != null) {
      makeBinary(root.middle)
      }
    if (root.left.key2 != null) {
      makeBinary(root.left)
      }
  }
  else {
    TernaryTreeNode<T> NewNode = new TernaryTreeNode<>();
    NewNode.key1 = root.key2;
    root.key2 = null;
    if (root.right != null) {
      newNode.middle = root.right;
    }
    if (root.middle !=null) {
      newNode.left = root.middle
      }
  root.middle = NewNode;
  }
  
}
    
