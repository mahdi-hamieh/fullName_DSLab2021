
package FINALEXAM;

public int CountTwoChildNodes(int nb)
       {
          return CountTwoChildNodes(Root,nb);
       }
    
 private int CountTwoChildNodes(BSTNode M,int nb) { 
    if (M == null){
        return 0;
    }
     int counter=0;
        if (M.getRight.getLeft()!=null)  
            counter++;

   int Left= CountTwoChildNodes(M.getLeft(),nb);
   int Right= CountTwoChildNodes(M.getRight(),nb);
    return counter+=Left+Right;
}
