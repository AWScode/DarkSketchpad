/*
Anna Salam
Binary Project
Due: 12.13.17


this is my super super super rough draft to try and just outline what i'm gonna do and the stuff idk how to do
*/

import java.util.*;
<<<<<<< HEAD
import java.util.Scanner;
import java.util.Arrays;

public class Binary{ //binary is just a name for the class. could have been named anything
  public static void main(String[] args){

    Int a[] = new int[7]; //this makes an array integer of 8 (0, 1, 2, 3, 4, 5, 6, 7) for the first input
    Int b[] = new int[7]; //this is for the second input

    System.out.println("what's the first binary number?");
    Scanner a[] = new Scanner(System.in); //this makes the  user's first input = binOne

    System.out.println("what's the second number?"); //this makes the user's second input = binTwo
    Scanner b[] = new Scanner(System.in);

    System.out.println("Choose: add, subtract, multiply, divide");
    Scanner arith = Scanner(System.in); //this makes the answer arithmetic (idek what this is; ask someone)




    public static int addBinary(){
      int[] var;
      String number = a[];
      for (i=0, i<a[].length, i++) {
        var[i] = number.charAt(i);
        //idk what this is. Erik tried to teach it

      }

    }

    public static int subtractBinary(){

    }

    public static int multiplyBinary(){

    }

    public static int divideBinary(){

    }

  }

}




=======
>>>>>>> ef2864917152f68c075b5fa4618c17dfda9b75f4
public class Binary {
  public static void main(String[] args){
    Integer.parseInt(String, int radix);
    Integer.toBinaryString(sum);

    System.out.println(""); //say something to introduce what i want user to do here
    Scanner scan = new Scanner(System.in);
    System.out.println(""); //say some more stuff like second set of numbers
    Scanner scan = new Scanner(System.in);
    System.out.println(""); //ask what we are supposed to do with it
    //then I think i call on some method or something to do what they wanted to do with the two numbers
    //do some more method stuff to try and get it to work
    System.out.println(""); //the answer to the thing they want to happen
<<<<<<< HEAD

    //need to figure out how to do this stuff - maybe ask chloe about it

    //considine says that we're gonna have to use string, next line, and other stuff. gotta look it up
=======
    //NEED TO FIGURE OUT HOW TO DO THIS STUFF - MAYBE WORK WITH CHLOE ON IT

    //considine says that we gonna have to use string, next line and stuff. gotta look it up
>>>>>>> ef2864917152f68c075b5fa4618c17dfda9b75f4
    //also vicky is doing something super different so this probably isn't right
  }

  //make some methods here

  //add method
<<<<<<< HEAD
  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();

    int i=a.length()-1; //this calls a=i and j=b
    int j=b.length()-1;

    int carry = 0;

    while(i>=0 || j>=0){
        int sum=0;

        if(i>=0 && a.charAt(i)=='1'){
            sum++;
        }

        if(j>=0 && b.charAt(j)=='1'){
            sum++;
        }

        sum += carry;

        if(sum>=2){
            carry=1;
        }else{
            carry=0;
        }

        sb.insert(0,  (char) ((sum%2) + '0'));

        i--;
        j--;
    }

    if(carry==1)
        sb.insert(0, '1');

    return sb.toString();
}
//^ask someone to explain this to me.^ https://www.programcreek.com/2014/05/leetcode-add-binary-java/
//also ask how to add things to github if you already have it there

//subtract method
//multiply method
//divide method
=======
  //subtract method
  //multiply method
  //divide method

>>>>>>> ef2864917152f68c075b5fa4618c17dfda9b75f4

}


//if i use an array list need to make sure it is only up to 8 (for the 8 bits)
