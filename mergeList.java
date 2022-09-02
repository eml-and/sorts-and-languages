public class ListItem<T> {
  public T key;
  public ListItem<T> next;
}


public<T> void mergeLists (ListItem<ListItem<T>> lst, Comparator<T> cmp, ListItem<T>tail) {
  if (lst==null) {
    return;
  }
  ListItem<ListItem<T>> lstCopy = lst;
  ListItem<T> sorted = new ListItem<T>;
  for (ListItem<ListItem<T> p = lstCopy; p!=null; p=p.next) {
    for (ListItem<T> i = lstCopy.key, i!=null; i=i.next) {
      // find minimum
      
      
      
    
