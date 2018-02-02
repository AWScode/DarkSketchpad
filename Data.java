/* Data.java by Anna Salam
This program is to experiment and demonstrate
how different data types interact with each
other in java and to use the print statement
as an output.
This is for a lesson on data types using a series
of output statements.
*/


/* JAVA DATA TYPES NOTES
Java Data Types:
  1) Integer --> whole numbers, positive or negative
  2) String --> words/text/letters/phrases
  3) Boolean --> TRUE or FALSE
*/

import java.util.*;

public class Data {//a class is needed to execute the problem. the class has to be the name of the file. it's public so that we can use it across different platforms?

  public static void main(String[] args) { //this is the main method. you will almost always need this. this is the control (like a CU). it handles all the inputs and outputs and sends info to other methods. it is required. it is whatever is run.

    //Print the string "5", number 5, and boolean 5
    // just "5" is the string of 5. just 5 is the integer of 5
    System.out.println("String " + Integer.toString(5)); //Integer.toString converts an integer into a string. Integer is a class and toString is a method
//if we run just this, it will output 'String 5'

    System.out.println(5);
//if we run all this, it will output 'String 5' and '5'. the difference is one is a string and the other is an Integer

    if (5 != 0) { //because we don't have a toBoolean method, we need to make one. this is our boolean converter
      System.out.println(true);
    }
      else{
        System.out.println(false);
      }

//Use a loop to print the numbers 1 through 10
    for (int i = 0; i < 10; i++){ //i is an integer because we called it an integer with 'int'. i = 0 means its starting value is 0. i<10 means that it will keep going up until 10. i++ means that it will go up 1 each time
      System.out.println(i+1); //the ln part of println makes each output be a new line
    }
/*
    Scanner objectname1 = new Scanner(System.in);
    //take integer input from user and create a variable with...
    int integerNum = objectname1.nextInt();
    */

//BELOW is for practice with methods vvv
    int result = calcFactorial(baseNum); //baseNum is what input we want for calcFactorial method
  }

    //normally you should put methods above the main.
  public static long calcFactorial(int x){ //int x is input. long is data type
    int numb = x;
    return numb; //return = output
  }
}
