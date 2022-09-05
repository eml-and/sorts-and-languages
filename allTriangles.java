public class Arc<T> {
  public Node<T> head;
}

public class Node<T> {
  public List<Arc<T>> outgoingArcs;
}

public class Triple<T> {
  ...
  public Triple(T t1, T t2, T t3) {
    ...
    }
  
  // finds triangles in a given graph in the given List: startNodes
  public List<Triple<Node<T>>> void allTriangles (List<Node<T>> startNodes) {
    LinkedList<TripleNode<T>> listOfTrianlges = new LinkedList<Triple<Node<T>>();
    
    for (Node<T> first: startNodes)
      for (Arc<T> arc1: first.outgoingArcs())
        for (Arc<T> arc2: arc1.head.outgoingArcs())
          for (Arc<T> arc3: arc2.head.outgoingArcs())
            if (arc3.head == first && arc1.head != first && arc2.head != first && arc1.head != arc2.head)
              listOfTriangles.add (new Triple<Node<T> (first, arc1.head, arc2.head));
  }
  
  public class Quartuple<T> {
    ...
    public Quartuple(T t1, T t2, T t3, T t4) {
      ...
      }
    
 // find rectangle
    LinkedList<QuartupleNode<T>> listOfRectanlges = new LinkedLIst<Quartuple<Node<T>>();
    for (Node<T> first: startNodes)
      for (Arc<T> arc1: first.outgoingArcs())
        for (Arc<T> arc2: arc1.head.outgoingArcs())
          for (Arc<T> arc3: arc2.head.outgoingArcs())
            for (Arc<T> arc4: arc3.head.outgoingArcs())
              if (arc4.head==first && arc2.head != first && arc3.head != first && arc4.head != first)
                listOfRectangles.add (new QuartupleNode<T> (first, arc1.head, arc2.head, arc3.head))
    
              
    
    
    
