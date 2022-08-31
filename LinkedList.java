public class ListItem<T> {
  public T key;
  puublic ListItem<T> next;
}

public classMyLinkedList<T> implements List<T> {
  private ListItem<T> head;
  
  
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
