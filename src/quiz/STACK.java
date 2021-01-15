package quiz;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class STACK {
     private ArrayList list = new ArrayList() {
         @Override
         public boolean isEmpty() {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public Iterator iterator() {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public Object[] toArray() {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public Object[] toArray(Object[] ts) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public boolean add(Object e) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public boolean containsAll(Collection clctn) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public boolean addAll(Collection clctn) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public boolean addAll(int i, Collection clctn) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public boolean removeAll(Collection clctn) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public boolean retainAll(Collection clctn) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void clear() {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public Object set(int i, Object e) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void add(int i, Object e) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public int lastIndexOf(Object o) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public ListIterator listIterator() {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public ListIterator listIterator(int i) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public List subList(int i, int i1) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     };

    public int size()
    {
        return list.size();
    }

    public void push(Object element)
    {
        list.add(element);
    }

    public Object pop()
    {
        return list.remove(list.size()-1);
    }


    public void print(){
        list.print();
    }
     public STACK copy()
    {
        STACK list2 = new STACK();
        for(int i=0;i<list.size();i++){
            list2.push(list.getElement(i));
        }
        return list2;
    }
    public STACK copyReverse()
     {
         STACK list2 = new STACK();
        for(int i=0;i<list.size();i++){
            list2.push(list.getElement(i-1));
        }
        return list2;
     }


}
