/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeDataStructure;

/**
 *
 * @author jorda
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();

        // Insert numbers for binary tree
        BST.insert(60);
        BST.insert(12);
        BST.insert(10);
        BST.insert(66);
        BST.insert(68);
        BST.insert(67);
        BST.insert(19);
        BST.insert(74);
        BST.insert(85);
        BST.insert(90);
        BST.insert(46);
        BST.insert(78);
        BST.insert(6);
        
        System.out.println("display of binary search tree");
        BST.display();

        System.out.println("Inorder traversal of the binary search tree:");
        BST.inorderTraversal();
        
        System.out.println("PreOrder traversal of the binary search tree:");
        BST.preOrderTraversal();
        
        System.out.println("PostOrder traversal of the binary search tree:");
        BST.postOrderTraversal();
    }
    }
    
    

