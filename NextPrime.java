/*
Anna Salam
Due: 02/02/18
define a new method that will find the next largest prime (int x)
*/

import java.util.*;

public class NextPrime{ //this class determines what the next largest prime number is after user's input

  public static void printPrimeFactors(int num){
    if (num == 2) {
      System.out.println(num);
    }


    for(int i = 2; i < num; i++){
      //this also could've been for(int i = 2; i < int(num/2); i++) but it can't because of above if statement.
              //i<num/2 because no number more than a half of it can be divided by it. if num/2 is a factor it will round
      if (num%i == 0){
        System.out.println(i);
        printPrimeFactors(num/i); //calling the function inside of itself. it's called recursion. this is the same thing as 'num = num/i'
        break;
      } //if the remainder isn't 0, i adds 1
      }
      System.out.println("");

  }


//because mersennePrime is a long, checkPrime needs to be a long too
  public static boolean checkPrime(double check){ //this method checks if the next number is prime //turn long into check
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

public static double mersennePrime(int power){ //turn longs into check
  double finalM = 0;
  for (int i=1; i<power; i++){
    double mNum = Math.pow(2,i) - 1;//long mNuma = 2*i;
    //long mNum = mNuma - 1; //delete this
    if (checkPrime(mNum)){
      finalM = mNum;
    }
  }
  return finalM;
}


  public static void main(String[] args) { //this is my main method
    System.out.println("give me a number plz");
    Scanner userNum = new Scanner(System.in);
    int c = userNum.nextInt();
    double  result = mersennePrime(c); //turn long to double
    System.out.println(result);
  }

}
