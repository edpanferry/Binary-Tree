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
public class BTree {
    public static void main(String[] args){
        BST tree= new BST();
        tree.add(100);
        tree.add(50);
        tree.add(150);
        tree.add(5);
        tree.add(75);
        tree.add(120);
        tree.add(175);
        tree.display();
        
        System.out.println("\ncount= "+tree.count());
        System.out.println("Min. = "+tree.min());
        System.out.println("Max. = "+tree.max());
        
        System.out.println("Search = "+tree.consist(50));
    }
}
