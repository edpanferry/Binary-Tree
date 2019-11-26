/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstnode;

/**
 *
 * @author Edpan
 */
public class BST {
    private BSTNode root=null;
        
        public void add(int item){
            if(root==null)
                root= new BSTNode (item);
            else
                root.addV1(item);
        }
        
        public void display(){
            if(root !=null)
                root.inDisplay();
        }
        
        public int count(){
            return root.countNodes();
        }
        
        public int min(){
            return root.findMin(root);
        }
        
        public int max(){
            return root.findMax(root);
        }
        
        public boolean consist(int item){
            return root.consist(item);
        }
        
        public int countEven(){
            return root.countEven();
        }
}
