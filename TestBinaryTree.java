import structures.BinaryTree;
import java.io.*;
import java.util.Iterator;

class Main{

    public static void main(String[] args){
        
        BinaryTree<Integer> leftTree = new BinaryTree<Integer>(10);
        leftTree.setLeft(new BinaryTree<Integer>(15));
        leftTree.setRight(new BinaryTree<Integer>(19));
        
        BinaryTree<Integer> rightTree = new BinaryTree<Integer>(30);
        rightTree.setLeft(new BinaryTree<Integer>(32));
        rightTree.setRight(new BinaryTree<Integer>(38));
        
        BinaryTree<Integer> root = new BinaryTree<Integer>(100, leftTree, rightTree);
        
        printTree(root.iterator(1));//preorder
        
    }
    
    private static void printTree(Iterator it){
        
        while(it.hasNext()){
            Object val = it.next();
            System.out.println(val);
        }
        
    }
    
}

