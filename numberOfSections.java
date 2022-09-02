public class ListItem<T> {
  public T key;
  public ListItem<T> next;
}

// counts number of sections in list where the element is NOT sep
int numberOfSections(ListItem<T> list, T sep, Comparator<T> cmp) {
 if (list==null) {
   return null;
 }
  ListItem<T> head = list;
  int count = 0;
  for (var p=head; p!=null; p=p.next) {
    boolean same_sequence = false;
    if (cmp.compare(sep, p.key)==0 && same_sequence) {
      same_sequence =false;
    } else if {
      (cmp(sep, p.key)!=0) && !same_sequence {
        same_sequence = true;
        count++;
      }
    }
  }
  return count;
  
}
