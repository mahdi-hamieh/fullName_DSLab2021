 public abstract class RemoveFunctions implements list {
     
     private class Node {
     
         Object value;
         Node next;
     
        public Node (Object value){
        
            this.value=value;
     }
     
     }
     private Node head;
     
     
     public int size()
     {
         int count = 0;
        Node current = head;
        while(current != null)
        {
            current = current.next;
            count++;
        }
        return count;
     }
     
    
    public Object remove(int index) {
        
        Node currentNode = head;
        Node previousNode;
        int counter=0;
        while(currentNode!=null)
        {
            if(counter == index)
            {
                previousNode = currentNode.next;
                currentNode = null;
                return currentNode;
                
            }
            counter++;
            currentNode=currentNode.next;
        }
        throw new ArrayIndexOutOfBoundsException("index not found: " +index );
    }

    
    public boolean remove(Object element) {
        Node currentNode = head;
        Node previousNode;
        while(currentNode != null)
        {
            if(currentNode.value.equals(element))
            {
                previousNode = currentNode.next;
                currentNode = null;
                return true; 
            }
            currentNode=currentNode.next;
        }
        
        return false;
    }
   
    public Object remove()
    {
        if (this.size() == 0)
        {
            throw new RuntimeException("List is empty");
        }
        else
        {
            Node currentNode = head;
            while(currentNode != null)
                {
                    if(currentNode.next == null)
                        {
                            currentNode = null;
                        }
                    currentNode = currentNode.next;
           
            }
       }
        return null;
    }
     
 }
