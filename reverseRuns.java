public class ListItem<T> {
  public T key;
  public ListItem<T> next;
}

// run: max sequenz, such that following elements are sorted

public ListItem<T> reverseRuns(ListItem<T> head, Comparator<T> cmp) {
  for (ListItem<T> p=head; p!=null; p=p.next) {
    currentHead = head;
    // during a run
    while (cmp.compare(p.key, p.next.key) <0) {
      currentHead.next = p;
      p=currentHead;
      p=p.next;
    }
    // set head to the "new" run 
    p.next = head;
    p = head;
  }
  return headM
}


// good sulution:

    
