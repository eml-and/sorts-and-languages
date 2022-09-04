public class Listitem <T> {
  public T Key;
  public ListItem<T> next;
}

public class BinaryTreeNode<T> {
  public T key;
  public BinaryTreeNode<T> left;
  public BinaryTreeNode<T> right;
}

public <T> BinaryTreeNode<T> makeBinaryTree(ListItem<T> list) {
  if (list==null) {
    return null;
  }
  
  if (list.next.next!=null) {
    BinaryTreeNode<T> even = new BinaryTreeNode<>();
    even.key = list.key;
    list = list.next;
    BinaryTreeNode<T> odd = new BinaryTreeNode<>();
    odd.key = list.key;
    odd.left = even;
    list = list.next;
    odd.right = makeBinaryTree(list);
    return odd;
  } else {
    BinaryTreeNode<T> second_last = new BinaryTreeNode<>();
    second_last.key = list.key;
    list = list.next;
    BinaryTreeNode<T> last = new BinaryTreeNode<>();
    last.key = list.key;
    second_last.right = last;
    odd.right = second_last;
  }
  // tree is build but how to return the root of it ?...
  return 
  }
   

/// good solution:
public <T> BinaryTreeNode<T> makeBinaryTree(ListItem<T> list) {
  if (list==null) {
    return null;
  }
  BinaryTreeNode<T> node = new BinaryTreeNode<T>();
  node.key = list.key;
  if (list.next==null) {
    return node;
  }
  BinaryTreeNode<T> root = new BinaryTreeNode<>();
  root.key = list.next.key;
  root.left = node;
  root.right = makeBinaryTree(list.next.next);
  return root;
}

  
  
