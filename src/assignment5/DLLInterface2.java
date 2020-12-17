  
package assignment5;

public interface DLLInterface2 {

    
    int size();

    
    boolean isEmpty();

    
    Object get(int index);

    
    int indexOf(Object element);

    
    void insertAtFront(Object newElement);
    
    
    void insertAtBack(Object newElement);

    
    void removeFromBack();
    
    
    void removeFromFront();

    
    void print();
}
