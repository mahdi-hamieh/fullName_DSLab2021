public class assignment2 {
    
    public static void main(String args[]) {


    }
}
class assignment201{

static node head1 ;
static node head2 ;


static class node
{
  node next;
}


static node mergingLinkedLists()
{
  node tail = head1;
  while (tail != null) 
  {
    if (tail.next == null && head2 != null)

    {
      tail.next = head2;
      break;
    }
    tail = tail.next;
  }
  return head1;
}

    private static interface list {
    }
 public abstract class LinkedList1 implements list {


     private class Node {

         Object value1;
         Node next1;

        public Node (Object value){

            this.value1=value1;
     }

     }
     private Node head1;
     private Node tail1;
 }
 public abstract class LinkedList2 implements list {


     private class Node {

         Object value2;
         Node next2;

        public Node (Object value){

            this.value2=value2;
     }

     }
     private Node head2;
     private Node tail2;
 }


}
