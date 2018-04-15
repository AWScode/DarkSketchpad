/* BinaryTree.java created by Mr. Considine
This program holds all of the information for
the BinaryTree class. BinaryTree stores data in a
specific data structure that makes adding data
and searching for data possible in O(logn) time */
import java.util.*;
import java.io.*;

public class BinaryTree{

  public Node root;

/*
almost all of my errors are "expected ';'" and "illegal start of expression" mostly on the starts of methods
*/
  public BinaryTree(int val){
    Node root1 = new Node(val);
    this.root = root1;
  }

  public Node getRoot(){
    return this.root;
  }

  public boolean searchNode(int val){//HW 4/13
    Node hiNode = root;
    while (hiNode.val != val){
      if (val < hiNode.val){
        hiNode = hiNode.child1;
      }
      else{
        hiNode = hiNode.child2;
      }
      if (hiNode == null){
        return null;
      }
    }
    return hiNode;
  }

  public void addNode(int val){//HW 4/13
    Node newNode = new Node(val);

    if (root == null){
      root = newNode;
    }
    else{
      Node hiNode = root;
      Node parent;
      while(true){
        parent = hiNode;
        if (val < hiNode.val){
          hiNode = hiNode.child1;//child1 is actually getChild(false)
          if (hiNode == null){//if left node has no children
            parent.child1 = newNode;
            return;
          }
          else{
            hiNode = hiNode.child2;
            if(hiNode == null){//if right child has no children
              parent.child2 = newNode;
              return
            }//says there is error here
          }
        }
      }
    }
  }

  public boolean removeNode(int val, Node parent) {//HW 4/13
    if (val < this.val){
      if (child1 != null){
        return child1.removeNode(val, this);
      }
      else{
        return false;
      }
    }
    else if(val > this.val){
      if (child2 != null){
        return child2.removeNode(val, this);
      }
    }
  }

  public printTree(Node root){//this isn't a good print tree method because a good one would take a long time. make a good one for extra credit
    if (root != null) {//print tree doesn't have a loop. How does it print the whole tree??? ---> because it is *recursive*
      String valS = Integer.toString(root.getValue());
      System.out.println("[" + val + "]");
      this.printTree(root.getChild(false));
      this.printTree(root.getChild(true));
    }
  }

  public static void main(String[] args){//says there is error here

    BinaryTree tree1 = new BinaryTree(10);//this starts us with a root

    tree1.addNode(8);
    tree1.addNode(12);
    tree1.addNode(14);
    tree1.addNode(13);
    tree1.addNode(11);
    tree1.printTree(tree1.getRoot());
    System.out.println("Searching for 8...");
    System.out.println(tree1.searchNode(8));
    System.out.println("Searching for 13...");
    System.out.println(tree1.searchNode(13));
    System.out.println("Searching for 15...");
    System.out.println(tree1.searchNode(15));
  }
}//says there is error here
