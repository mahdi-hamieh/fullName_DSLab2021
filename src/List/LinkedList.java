
package List;

public class LinkedList implements List {

    private class Node
    {
        Object value;
        Node next;

        public Node (Object value)
        {
            this.value = value;
        }
    }

    private Node head;

    
    public void add(Object newElement) {

        if (head == null) {
            head = new Node(newElement);
        }
        else
        {
            Node currentNode = head;
            while(currentNode.next != null)
            {  
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(newElement);
          }
        }


    
    public Object get(int index) {
       Node currentNode = head;
       int counter = 0;
       while(currentNode != null)
       {
           if(counter == index)
           {
               return currentNode;
           }
           counter++;
           currentNode = currentNode.next;
       }
       throw new IndexOutOfBoundsException("Invalid index " + index); 
    }

    
    public int indexOf(Object element) {
       Node currentNode = head;
       int counter =0;
       while(currentNode != null)
       {
           if(currentNode.value.equals(element))
           {
               return counter;
           }
           counter++;
           currentNode = currentNode.next;
       }
       return -1;
    }

    
    public Object remove(int index) {
        if (this.size() == 0)
        {
            throw new RuntimeException("List is empty.");
        }
        else
        {
            Node nodeAtIndex = (Node) this.get(index);
            Node current = head;

            while(!current.next.equals(nodeAtIndex))
            {
                current = current.next;

            }
            current.next= nodeAtIndex.next;
            return nodeAtIndex.value;
        }
    }

   
    public Object remove(Object element) {
        int indexOfObjToRemove = indexOf(element);
        return remove(indexOfObjToRemove); 
    }

    
    public int size() {
        Node currentNode = head;
        int counter = 0;
        while(currentNode != null)
        {
            currentNode = currentNode.next;
            counter++;
        }
        return counter;
    }

    
    public void remove() {
        if (head == null)
        {
            throw new RuntimeException("List is empty");
        }
        else if (head.next == null)
        {
            head = null;
        }
        else
        {

            Node previousNode =head;
            Node currentNode = previousNode.next;
            while(currentNode.next != null)
            {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            currentNode = null;
            previousNode.next = null;
        }
    }

     
    public boolean isEmpty() {
        return head == null;
    }

}
