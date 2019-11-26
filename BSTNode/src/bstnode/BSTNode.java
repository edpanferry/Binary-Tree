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
public class BSTNode {

    private int item;
    private BSTNode left;
    private BSTNode right;
    private BSTNode parent;
    
    public BSTNode(int item){
        this.item=item;
    }
    
    public void setLeft (int item){
        BSTNode temp= new BSTNode (item);
        this.left= temp;
        temp.parent= this;
    }
    
    public void setRight(int item){
        BSTNode temp= new BSTNode (item);
        this.right=temp;
        temp.parent= this;
    }
    
    public BSTNode getLeft(){
        return this.left;
    }
    
    public BSTNode getRight(){
        return this.right;
    }
    
    public void preDisplay(){
        System.out.print(this.item+" ");
        if(left != null)
            left.preDisplay();
        if(right != null)
            right.preDisplay();
    }
    
    public int countNodes(){
        return 1 +
                (left==null ? 0 : left.countNodes()) +
                (right==null ? 0 : right.countNodes());
    }
    
    public void inDisplay(){
        if(left != null)
            left.inDisplay();
        System.out.print(this.item+" ");
        if(right != null)
            right.inDisplay();
    }
    
    public void postDisplay(){
        if(left != null)
            left.inDisplay();
        if(right != null)
            right.inDisplay();
        System.out.print(this.item+" ");
    }
    
    public void addV1 (int item){
        if (item< this.item){
            if(this.left == null)
                this.setLeft(item);
            else
                left.addV1(item);
        }
        else{
            if(this.right== null)
                this.setRight(item);
            else{
                right.addV1(item);
            }
        }
    }
    
    public int findMin (BSTNode root){
        int min;
        while(true){
            if(root.getLeft()== null){
                min= root.item;
                break;
            } else{
                root=root.left;
            }
        }
        return min;
    }
    
    public int findMax (BSTNode root){
        int max;
        while(true){
            if(root.getRight()== null){
                max=root.item;
                break;
            }else{
                root=root.right;
            }
        }
        return max;
    }
    
    public boolean consist(int find){
        while(true){
            if(this.item==find) return true;
            else return false;
        }
    }
    
    public int countEven(){
        int count=0;
        while(true)
            if(this.item%2==0)
                count++;
    }
    
}
