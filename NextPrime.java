/*
Anna Salam
Due: 02/02/18
define a new method that will find the next largest prime (int x)
*/

import java.util.*;

public class NextPrime{ //this class determines what the ext largest prime number is after user's input

/*  public static void printPrimeFactors(int num){
    System.out.println("");

  } */


  public static boolean checkPrime(int check){ //this method checks if the next number is prime
    boolean isPrime = true; //assuming isPrime is true...
    for (int i = 2; i < check; i++){ //for loop - i starts at 2, adding 1 each time until it is less than check
      if (check%i == 0){ //if the remainder of check ÷ i is 0...
        isPrime = false; //... then isPrime is false
        break; //so the loop should stop (break = stop loop)
      }
    }
    return isPrime; //otherwise, output isPrime (return = output)
  }


  public static int nextPrime(int x) { //this method finds the next number
    int next = x + 1; //input of this method plus 1 equals new integer called next
    while (true) { //while above is true
      if (checkPrime(next)){ //if the checkPrime with 'next' as the input is true...
        break; //stop loop
      }
      else{ //otherwise...
        next = next + 1; //keep adding one
      }
    }
    return next;
  }


  public static void main(String[] args) { //this is my main method
    System.out.println("Input a number to find the next largest prime number for.");
    Scanner userNum = new Scanner(System.in);
    int c = userNum.nextInt();
    int nlPrime = nextPrime(c);

    System.out.println(nlPrime);
  }

}
