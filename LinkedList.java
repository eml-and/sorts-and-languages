public class ListItem<T> {
  public T key;
  puublic ListItem<T> next;
}

public classMyLinkedList<T> implements List<T> {
  private ListItem<T> head;
  
// exam task: add all sorted elements in increasing order contained in the nested list
// beginning with ListItem<ListItem<T>> to a new ListItem<T> element at the end of ListItem<T> tail
// manipulating lst is not allowed
  
 public<T> void mergeLists(ListItem<ListItem<T>> lst, Comparator<T> cmp, ListItem<T> tail) {
   ListItem<ListItem<T>> lstCopy = lst;
   if (lst==null) {
     return;
   }
   while (lstCopy != null) {
     ListItem<T> item = lstCopy.key;
     while (item !=null) {
       ListItem<T> tailHead = tail;
       if (tailHead.next != null) {
         while (cmp.compare(item.key, tailHead.next.key) > 0) {
           tailHead = tailHead.next;
           if (tailHead.next == null) {
             break
             }
         }
       }
       ListItem<T> temp = tailHead.next;
       tailHead = tailHead.next = new ListItem<>();
       tailHead.key = item.key;
       tailHead.next = temp;
       item = item.next;
    }
    lstCopy = lstCopy.next
   }
   
  
  
  
  public boolean contains(T t) {
    for (ListItem<T>p=head; p!=null; p=p.next) {
      if (p.key.equals(t)) {
        return true;
      }
      return false;
    }
  }
  
  public void add(int pos, T key) throws IndexOutOfBoundsException {
    if (pos<0) {
      throw new IndexOutOfBoundsException("Wrong position: "+pos);
    }
    ListItem<T> tmp = new ListItem<T>();
    tmp.key = key;
    // add at head
    if(pos==0) {
      tmp.next = head;
      head = tmp;
      return;
    }
    else {
      for (ListItem<T>p=head; p!=null; p=p.next) {
        pos --;
        // add at pos
        if (pos==0) {
          tmp.next = next;
          p.next = tmp;
          return;
        }
      }
      throw new IndexOutOfBoundsException("Wrong position: "+pos);
    }
  }
  
  
  public boolean remove(Object obj) {
    // check if list is empty
    if (head==null) {
      return false;
    }
    // check if head equals the object to remove
    if ((head.key.equals(obj)) {
      head = head.next;
      return true;
    }
    else {
      for (ListItem<T>p=head; p.next!=null;p=p.next) {
        if (p.next.key.equals(obj))) {
          p.next = p.next.next;
          return true;
        }
      }
      return false;
    }
  }
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
