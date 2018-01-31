/*
Anna Salam
Factorial project
Due: 1/31/18
*/

import java.util.*;

public class Factorial {
/*
    public static void main(String[] args) {
      //Use a loop to print the numbers 1 through 10
          for (int i = 0; i < 10; i++){ //this just listed out the numbers 1 through 10
            System.out.println(i+1);
          }
  }
*/


/*
  public static void main (String[] args) {
    for (int i = 0; i < 10; i++){
      System.out.println(i*(i+1)); //this did Fibonacci


    }
  }
*/

/* PART 1
  public static void main(String[] args) {
    int i, f=1; //calling an integer 'i' and assigning integer 'f' to equal 1 to start off.    int is needed so java knows what data type it is.
    for (i = 1; i <= 10; i++){ //if we were to go up to 20 instead of 10, the end result would be too big (more than 16 bits) so instead of int we would need to assign it to the 'long' data type which is 64 bits.

      f=f*i; //f equals f times i. starts out as 1 times 1 which is one. then 1 times 2 (because i is increasing) which equals 2. Now f equals 2. So now it will be 2 times 3 which is 6.

    }
    System.out.println("Factorial of 10 is " + f);

  } */



//PART 2
  public static void main(String[] args) {
    System.out.println("enter a number you would like to know the factorial of:");
    Scanner userNum = new Scanner(System.in);
    int b = userNum.nextInt();


    int f = 1;
    for (int i = 1; i <= b; i++){
      f = f * i;
    }

    System.out.println("the factorial of is " + f);
  }



  }
