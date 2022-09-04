public class ListItem<T> {
  public T key;
  public ListItem<T> next;
}
public <T> ListItem<T> makeAscending (ListItem<T> list, Comparator<T> cmp, Calculator<T> calc) {
  (if list==null) {
    return null;
  }
  ListItem<T> head = new ListItem<>();
  ListItem<T> tail = new ListItem<>();
  head.key = list.key;
  head.next = tail;
  T delta;
  T diff;
  
  for (ListItem<T>p=list; p.next!=null; p=p.next) {
    diff = calc.subtract(p.key, p.next.key)
    if (cmp.compare(diff, 0) > 0) {
      delta = calc.add(delta, diff);
    }
    ListItem<T> temp = new ListItem<>();
    temp.key = adder.add(p.key, delta);
    tail.next = temp;
    temp = tail;
  }
  return head;
}
      
    
    
    
