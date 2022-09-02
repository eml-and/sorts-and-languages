public class ListItem<T> {
  public T key;
  public ListItem<T> next;
}

public <T> ListItem<ListItem<T>> makeListOfLimitedListsFromArray ( T[] a, Comparator<T> cmp, Adder<T> adder, T limit ) {
  if (a.length==0) {
    return null;
  }
  ListItem<ListItem<T>> head = new ListItem<ListItem<T>>();
  head.key = inner;
  ListItem<ListItem<T>> p = head;
  
  // iterate over the array
  for (int i=0; i<a.length; i++) {
    T current_sum = new T;
    ListItem<T> inner = new ListItem<T>;
    p.key = inner;
    
  // populate inner list until limit
    while (cmp(current_sum, limit) > 0) {
      current_sum = adder(current_sum, a[i]);
      inner.key = a[i];
      inner.next = new ListItem<T>;
      inner = inner.next;
        i++;
    }
    p.next = new ListItem<ListItem<T>>();
    p = p.next;
  }
    
    
    
    
    
