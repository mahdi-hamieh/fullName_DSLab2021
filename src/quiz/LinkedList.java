package quiz;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public abstract class LinkedList implements List {

    @Override
    public boolean contains(Object o) {
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
    public void replaceAll(UnaryOperator uo) {
        List.super.replaceAll(uo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sort(Comparator cmprtr) {
        List.super.sort(cmprtr); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public Spliterator spliterator() {
        return List.super.spliterator(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeIf(Predicate prdct) {
        return List.super.removeIf(prdct); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stream stream() {
        return List.super.stream(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stream parallelStream() {
        return List.super.parallelStream(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEach(Consumer cnsmr) {
        List.super.forEach(cnsmr); //To change body of generated methods, choose Tools | Templates.
    }

  private class Node {

        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;

        }

        public Node() {
        }


        public Node getNext() {
            return next;
        }


        public void setNext(Node next) {
            this.next = next;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }


    }

    private Node head;

    /**
     *
     * @param newElement
     */
    

     
     public int size() {
        if (head == null) {
            return 0;
        } else {
            // head != null
            int size = 1;
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                size++;
            }
            return size;
        }
     }
    public Object get(int index){
        if(head == null){
            return 0;
        }
        Node current = head;
        int count = 0;
        while(current!=null){
           if(count == index){
               return current.value;
           }

        count++;
        current = current.next;
    }
        throw new RuntimeException("");
    }

    
    public int indexOf(Object element) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.value.equals(element)) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public boolean isEmpty(){
        if(head == null){
            return false;
        }
        else
            return true;
    }
    public void makeEmpty(){
        this.head = null;
    }

    public Node getHead(){
        if(head == null)
        {
            throw new RuntimeException("List is empty.");
        }
        else
            return this.head;
    }
    public Object getHeadValue(){
        return this.head.value;
    }

    public Object remove() { // Remove Tail
        if(this.isEmpty())
        {
            throw new RuntimeException("list is empty");
        }
        Node current = head;
        while(this.isEmpty()==false){ // while(head!=null)
          if(current.next == null){
              current = null;
          }
          current = current.next;
        }
        return current.next.value;
    } 
    
    public boolean remove(Object element) { // Remove the node which is = to the element(from the middle)
        Node current = head;
        Node previousNode;
        while(current != null)
        {
            if(current.value.equals(element))
            {
                previousNode = current.next;
                current = null;
                return true; 
            }
            current=current.next;
        }

        return false;
    }

    
    public Object remove(int index) { 

        Node current = head;
        Node oldNode;
        int counter=0;
        while(current!=null)
        {
            if(counter == index)
            {
                oldNode = current;
                return current;

            }
            counter++;
            current=current.next;

        }
         throw new RuntimeException("index "+index+" not found." );

    }
    public Node getTailNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch tail.");
        }
        //initialize
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public static LinkedList merge(LinkedList list1, LinkedList list2) {

        if (list1.isEmpty()) // if(list1 == null)
        {
            return list2;
        }
        if (list2 == null) { // if(list2.isEmpty())
            return list1;
        }
        if(list1 == null && list2 == null){ // if(list1.isEmpty() && list2.isEmpty())
            throw new RuntimeException("No list found");
        }

        LinkedList merged = list1;
        merged.getTailNode().setNext(list2.getHead());

        return merged; 
    }
    public Node reverse(Node node){
     Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
   public Object search(Object element){
       Node current = head;
       int counter = 0;
       while(current != null){
           if(current.value.equals(element)){
               System.out.println(counter);
           }
           counter++;
           current = current.next;
       }
       return element;
   }

   public void replace(int index, Object newElement){
       if(head == null){
           throw new RuntimeException("list not found");
       }
       Node current = head;
       int counter = 0;
       while(current!=null){
           if(counter == index){
              current.value = newElement;
           }
           counter++;
           current=current.next;
       }

   }
   public void insert(int index, Object newElement){
       Node node = new Node();
       node.value = newElement;
       node.next = null; // here I've created a node and specified its value and its next
        if (this.head == null) {
            if (index != 0) {
                throw new RuntimeException("index out of range");
            } else { // if(index == 0)
                this.head = node;
            }
        } // index is the position of the node
        if (head != null && index == 0) {
            node.next = this.head;
            this.head = node;
        } // here I've created the head node when the position is 0

        Node current = this.head;
        Node previous = null;

        int counter = 0;

        while (counter < index) { // counter is less than the position that I'm inserting the element in
            previous = current;
            current = current.next;

            if (current == null) {
                break;
            } // exiting the loop when the current node have reached the tail node

            counter++;
        }

        node.next = current;
        previous.next = node;
    }




   public void clear(){
       Node current = head;
       while(current!=null){
           current.value = null;
       }
   }


       void print() {
          Node currentNode = head;
        if (head==null){
            System.out.println("The list is empty.");
        }

            while (currentNode != null) {
                System.out.print(currentNode.value + " --> ");
                currentNode = currentNode.next;
            }
            System.out.println("");
       }
        Object getPrevious(Object element){ // quiz
       Node current = head;
       Node node = new Node();
       Node prev = null;
       while(current!=null){
           if(current.value.equals(element)){
               return prev;
           }
       }
      return null;
   }
    public void replaceAll(Object existingElement, Object newElement){
        Node current = head;
        while(current!=null){
            if(current.value.equals(existingElement)){
                current.value = newElement;
            }
            current = current.next;

        }
    }
    public Object getMiddle(){
        Node current = head;
        int n = this.size();
        while(current!=null){
            if(n/2 == 0 || n/2 != 0){
                return current.value;
            }

        }
        return null;
    }
}
