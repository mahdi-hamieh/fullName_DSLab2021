
package assignment5;


public class DLLInterface<T> {
    protected DLLNode<T> head;		 
	protected DLLNode<T> tail;		
	protected DLLNode<T> gender;	 
	protected int numElements;		 
	protected boolean found;       

	
 
    public DLLInterface() {
        
        
    }
	{
		head = null;
		tail = null;
		numElements = 0;
		location = null;
	}
	
	public boolean isEmpty()
	
	{
		return (head == null);
	}
	
	public int size()
	
	{
		return numElements;
	}
	
	protected void find(T target)
   
    {
      location = head;
      found = false;
      if(!isEmpty()){ 	  
    	  do 
          {
            if (location.getData().equals(target))  
            {
             found = true;
             return;
            }
            else
            {
                location = location.getNext();
            }
          }while(location != tail.getNext());
      }
      
    }

    public boolean contains (T element)
	
	{
		 find(element);
		 return found;
	}
    
	protected void findPosition(int position) 
	
	{
		int start = 0;
		location = head;
		found = false;
	
		if ((!isEmpty()) && (position >= 0) && (position <= size())) {
			do {
				
				location = location.getNext();
				start++;

			} while ((location != head) && start < position);
			found = true;
		}

	}
	
	public T get(T data)
	  
	  {
	    find(data);    
	    if (found)
	      return location.getData();
	    else
	      return null;
	  }
	
	public void reset()
	
	  {
	      location  = head;
	  }
	
	
	public void add(T data)
	
	{
		DLLNode<T> newNode = new DLLNode<T>(data);  
	   	
	   	 if (isEmpty())           
	   	 {
	   		 head = newNode;
	   	     tail = newNode;   	    
	   	     head.setPrevious(tail);
	   	     tail.setNext(head);	   	 
	   	 }
	   	 else                   
	   	 {
	             tail.setNext(newNode);
	             newNode.setPrevious(tail);
	   	     tail = newNode;
	   	     tail.setNext(head);
	   	 }
	   	 numElements++;
	}

    
    public void addFront(T data) 
    
    {
    	DLLNode<T> newNode = new DLLNode<T>(data);   
    	if (isEmpty())            
	   	 {
    		 head = newNode;
	   	     tail = newNode;   	    
	   	     head.setPrevious(tail);
	   	     tail.setNext(head);
	   	 }
	   	 else                       
	   	 {
	            newNode.setNext(head);
	            head.setPrevious(newNode);
	   	    head = newNode;
	   	    head.setPrevious(tail);
	   	    tail.setNext(head);
	   	 }
	   	 numElements++;
	   	
    }
    
    public void addBack(T data)
   
    {
    	DLLNode<T> newNode = new DLLNode<T>(data);  
	   	
	   	 if (isEmpty())           
                     

    

