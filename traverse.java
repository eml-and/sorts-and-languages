public class TreeNode<T> {
  public T[] theKeys;
  public TreeNode<T>[] the Successors;
  public int numberOfKeys;
}
// good solution
ListItem<T> traverse(TreeNode<T> root) {
  if (root==null) {
    return null;
  }
  ListItem<T> dummy = new ListItem<T>();
  traverseTreeRec(root, dummy);
  return dummy.next;
}
ListItem<T> traverseTreeRec(TreeNode<T> node, ListItem<T> last) {
  if (node==null)
    return last;
  last = traverseTreeRec(node.theSuccessors[0], last);
  return traverseNodeRec(node, last);
}

ListItem<T> traveseNodeRec(TreeNode<T> node, ListItem<T> last, int index) {
  if (index==node.numberOfKeys)
    return last;
  last.next = new ListItem<T>();
  last = last.next;
  last.key = node.theKeys[index];
  last = traverseTreeRec(node.theSuccessors[index+1], last);
  return traverseNodeRec(node, last, index+1);
}


// own sad attempt
ListItem<T> traverse(TreeNode<T> root) {
  if (root==null) {
    return null;
  }
  
  
  
  
  
  
  
  

