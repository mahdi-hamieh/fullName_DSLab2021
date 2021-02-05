/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINALEXAM;

public BinaryNode mirrorTree()
       {
           mirrorTree(Root);
       }
       private BinaryNode mirrorTree(BinaryNode n){
           if(n==null)
               return n;
           BinaryNode t = n;
           t.setLeft(mirrorTree(n.getRight()));
           t.getRight(mirrorTree(n.getLeft()));
           t.setElement(n.getElement());
           return t;
           
       }