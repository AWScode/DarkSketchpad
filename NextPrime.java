/*
Anna Salam
Due: 02/02/18
define a new method that will find the next largest prime (int x)
*/

import java.util.*;

public class NextPrime{ //this class determines what the ext largest prime number is after user's input

  public static void printPrimeFactors(int num){
    System.out.println("");

  }


  public static boolean checkPrime(int check){ //this method checks if the next number is prime
    boolean isPrime = true;
    for (int i = 2; i < check; i++){
      if (check%i == 0){
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }


  public static int nextPrime(int x) { //this method finds the next number
    int next = x + 1;
    while (true) {
      if (checkPrime(next)){ //this uses the yaPrime method but uses 'next' as the object
        break;
      }
      else{
        next = next + 1;
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
