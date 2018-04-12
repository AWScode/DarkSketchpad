/* BinaryTree.java created by Mr. Considine
This program holds all of the information for
the BinaryTree class. BinaryTree stores data in a
specific data structure that makes adding data
and searching for data possible in O(logn) time */
import java.util.*;
import java.io.*;

public class BinaryTree {

  public Node root;

  public BinaryTree(Node root, int input) {
    this.root = root;//this whole thing relies on the root changing to everything
//this is suuuuuper not complete because I don't have anything about what happens when there is already something in that space
    this.left = nada;
    this.right = nada;

    if(input < root){//need to make input thingy
      input = this.left;
    }
    else if (input > root){
      input = this.right;
    }
    else if (input = root){
      input = this.right; //but only if there is nothing already on the right
    }

  }

  public boolean searchNode(Int val) {

  }

  public void addNode(Int val) {

  }

  public void removeNode(Int val) {

  }

  public static void main(String[] args) {
    System.out.println("Input your first number: ")
    Scanner first = new Scanner(System.in);
    Node root = first;

    System.out.println("Input a number that you would like to add: ");
    Scanner in = new Scanner(System.in);
    int input = in;

  }
