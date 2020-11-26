
package List;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class ArrayList implements List {

    private Object[] list;
    private int effectiveSize;
    private int BUFFER_SIZE = 5;

    public ArrayList() {
        list = new Object[BUFFER_SIZE];
        effectiveSize = 0;
    }

    
    public int size() {
        return effectiveSize;
    }

    
    public boolean isEmpty() {
        if (size() == 0)
            return true;
        else
            return false;
    }

    
    public void add(Object newElement) {
        if (list.length == effectiveSize)
        {
            list = Arrays.copyOf(list, list.length + BUFFER_SIZE);
        }
        list[effectiveSize] = newElement;
        effectiveSize++;
    }

    
    public Object get(int index) {
        if (index < 0 || index  >= effectiveSize)
            throw new ArrayIndexOutOfBoundsException("Index out of bounds. " + index);
        else
        {
            return list[index];
        }
    }

   
    public int indexOf(Object element) {
        for (int i = 0; i < effectiveSize; i++) {
            if(list[i].equals(element))
            {
                return i;
            }
        }
        return -1;
    }

    
    public void remove() {
        list = Arrays.copyOf(list, list.length - 1);
        effectiveSize--;
         if (effectiveSize % BUFFER_SIZE == 0) {
            list = Arrays.copyOf(list, list.length - BUFFER_SIZE);
    }
    }

    
    public Object remove(int index) {
        if (index < 0 || index >= effectiveSize) {
            throw new ArrayIndexOutOfBoundsException("Invlaid Index " + index);
        }
        final Object valueToRemove = list[index];
        for (int i = index + 1; i < effectiveSize; i++) {
            list[i - 1] = list[i];
        }
        effectiveSize--;

        if (effectiveSize % BUFFER_SIZE == 0) {
            list = Arrays.copyOf(list, list.length - BUFFER_SIZE);
        }

        return valueToRemove;
    }


    
    public Object remove(Object element) {
         final int indexOfElementToRemove = indexOf(element);
        if (indexOfElementToRemove == -1) {
            throw new ArrayIndexOutOfBoundsException("Index not found. " + indexOfElementToRemove);
        }
        remove(indexOfElementToRemove);
        return element;
    }

   public void print()
   {
       if(isEmpty())
       {
           throw new RuntimeException("List is empty.");
       }
       else
       {
           for (int i = 0; i < effectiveSize; i++) {

              System.out.println(list[i]);
           }
       }
   }
}