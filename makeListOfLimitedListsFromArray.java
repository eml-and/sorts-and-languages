public class ListItem<T> {
  public T key;
  public ListItem<T> next;
}

public <T> ListItem<ListItem<T>> makeListOfLimitedListsFromArray ( T[] a, Comparator<T> cmp, Adder<T> adder, T limit ) {
  if (a.length==0) {
    return null;
  }
  ListItem<ListItem<T>> head = new ListItem<ListItem<>>();
  head.key = inner;
  ListItem<ListItem<T>> p = head;
  
  // iterate over the array
  for (int i=0; i<a.length; i++) {
    T current_sum = new T;
    ListItem<T> inner = new ListItem<T>;
    p.key = inner;
    
  // populate inner list until limit
    while (cmp(current_sum, limit) < 0) {
      current_sum = adder.add(current_sum, a[i]);
      inner.key = a[i];
      inner.next = new ListItem<T>;
      inner = inner.next;
        i++;
    }
    p.next = new ListItem<>();
    p = p.next;
  }
  return head;
}
 
  
/// alternative (good) solution when scope is not a problem
  
 public <T> ListItem<ListItem<T>> makeListOfLimitedListsFromArrayNicely ( T[] a, Comparator<T> cmp, Adder<T> adder, T limit ) {
  if (a.length==0) {
    return null;
  }
   ListItem<ListItem<T>> head = new ListItem<>();
   ListItem<T> inner = new ListItem<>();
   inner.key = a[0];
   current_sum = a[0];
   ListItem<ListItem<T>> p = head;
   
   for (int i=1; i<a.length(); i++) {
     if (cmp(current_sum, limit) < 0) {
       current_sum = adder.add(current_sum, a[i]);
       inner.next = new ListItem<T>();
       inner.next.key = a[i];
     }
     else {
       ListItem<ListItem<T>> p.next = new ListItem<>();
       ListItem<T> inner = new ListItem<T>;
       p = p.next;
       p.key = inner;
       inner.key = a[i];
       current_sum = a[i];
     }
   }
   return head;
       
       
   
  
   
   
    
    
    
    
