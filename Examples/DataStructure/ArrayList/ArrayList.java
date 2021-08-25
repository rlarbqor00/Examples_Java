package Examples.DataStructure.ArrayList;

public class ArrayList {
    private int size = 0;
    Object [] elementData = new Object[100];

    public boolean addFirst(Object element) {
        add(0, element);

        return true;
    }

    public boolean addLast(Object element) {
        elementData[size] = element;
        size++;

        return true;

    }
    public boolean add(int index, Object element) {
        for(int i = size-1; i>=index; i--) {
            elementData[i+1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return  true;
    }
    public Object remove(int index) {
        Object removed = elementData[index];

        for(int i = index; i<size; i++) {
            elementData[i] = elementData[i+1];


        }
        elementData[size] = null;
        size--;
        return removed;
    }
    public Object removeFirst() {
        return remove(0);

    }
    public Object removeLast() {
        return remove(size-1);
    }

    public String toString() {
        String str = null;
        str = "[";

        for(int i=0; i<size; i++) {
            str+=elementData[i];
            if(i < size-1) {
                str+=", ";

            }
            
        }
        return str+"]";
    }
    public Object get(int index) {
       return elementData[index];
    }
    public int indexOf(Object element) {
        for(int i=0; i<size; i++) {
            if(elementData[i].equals(element)) {
                return i;
            }
        }
        return -1;
        
    } 
    public ListIterator listIterator() {
        return  new ListIterator();

    }
    

    
    class ListIterator {
        private int nextIndex = 0;

        public Object next() {
            return elementData[nextIndex++];

        }
        public boolean hasnext() {
            return nextIndex < size;
        }
        public Object previous()  {
            return elementData[--nextIndex];
        }
        public boolean hasprevious() {
            return nextIndex>0;
        }
        
    
    }    
}

     

