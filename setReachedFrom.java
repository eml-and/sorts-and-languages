public class Arc<T> {
  public Node<T> head;
}
public class Node<T> {
  public List<Arc<T>> outgoingArcs;
  public Collection<Node<T>> reachedFrom;
}

public <T> void setReachedFrom (<Node<T>> currNodes) {
  
  while (! currNodes.empty())
    Node<T> current = currNodes.remove(0)
    for (Arc<T> arc : current.outgoingArcs)
      Node<T> head = arc.head;
        if (head.reachedFrom.emtpy()) {
          head.reachedFrom.add(current);
          currNodes.add(add);
        }
}
