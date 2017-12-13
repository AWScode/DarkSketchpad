/* Anna Salam
Binary Project
Due: 12/18/17
*/
/*
import java.util.*;

public class Binary{ //class is called "Binary"

  int i = 0;
  int remainder = 0; //this says that the first number we deal with has a remainder of 0
  int a = new int[8]; //this makes an array for the first inputed binary number
  int b = new int[8]; //array for second inputed number
  int s = new int[8]; //array for outputed number


  public static int addBinary(int[] a, int[] b){ //addition method called "addBinary"

    if(a[7].equals(0) && b[7].equals(0)){ //if the last bit of a is 0 AND the last bit of b is 0 then...
      s[7] = 0; //the sum is 0
    }
      else if (a[7].equals(1) && b[7]. equals(1)){ //if the last bit of a is 1 AND the last bit of b is 1 then...
        s[7] = 0; //the sum is 0 and...
        remainder = 1; //the remainder is 1
      }
        else{
          s = 1; //otherwise the sum is
          remainder = 0;
        }

    //loop to repeat process below until a[0], b[0], and s[0].
    for (int i=6; i>=0; i--){ // start i at 6 and go until i is more than or equal to 0 and go in the 7to0 direction.
      if (a[i].equals(0) && b[i].equals(0) && remainder.equals(0)){ //if no variables are 1
        s[i] = 0;
        remainder = 0;
      }
        else if (a[i].equals(1) && b[i].equals(1) && remainder.equals(1)){ //if all variables are 1
          s[i] = 1;
          remainder = 1;
        }
          else if (a[i].equals(1) ^ b[i].equals(1) ^ remainder.equals(1)){ //if only one variable=1 then s=1 and r=0.
            s[i] = 1;
            remainder = 0;
          }
            else{ //if two variables=1 then s=0 and r=1
              s[i] = 0;
              remainder = 1;
            }
    }
    return s;

    /* need 2 situations: one for a=0 OR b=0. the other for a=1 AND b=1.
    For the second situation, it needs a while loop because 1+1=2 but 2=0 and a remainder of 1

  }//end of addBinary

  public static int subtractBinary(){
    //first i need to change b so that it is two's complement
    //then i just add with new b
    for (int i=7; i>=0; i--){
      if (b[i].equals(0)){
        c[i] = 1;
      }
        else{
          c[i] = 0; //need to somehow make c a new input and make sure it is used in the answer. or do i just keep it as b?
        }
    }
    for (int i=7; i>=0; i--){
      if (c[i].equals(0)){
        d[i] = 1;
    }
        else{
          d[i] = 0;
          remainder = 1;
        }
    }

    //then i just do addBinary except change b to d.

  }//end of subtractBinary

  public static int multiplyBinary(){

  }//end of multiplyBinary

  public static int divideBinary(){

  }//end of divideBinary

  public static void main(String[] args){ //main method
    //ask user to input 2 8 bit numbers and call each a and b. then output number "s"
    System.out.println("please type an 8 bit binary number");
    int[] a = new int(System.in); //this makes the  user's first input = a


    System.out.println("now type a second 8 bit binary number"); //this makes the user's second input = b
    int[] b = new int(System.in);

//need to make an array for a and array for b and make the inputs into a and b arrays.

    System.out.println("choose what you would like to do with your binary numbers: add, subtract, multiply, divide");
    String atith = scan.nextLine();
    if (atith.equals("add")){
      System.out.println("the sum of your numbers is " + addBinary(a, b));
    }
      else if (atith.equals("subtract")){
        System.out.println("the difference of your numbers is " + subtractBinary);
      }
      else if (atith.equals("multiply")){
        System.out.println("the product of your numbers is " + multiplyBinary);
      }
      else (atith.equals("divide")){ //if it is 'else' then I don't need (atith.equals("divide")) except when I delete it I get like 60 more errors but with it I only have like 2 errors...
        System.out.println("the quotient of your numbers is " + divideBinary);
      }
    } //still need to do multiply and divide

}
*/


//COPY OF BINARY3 - DIF FILE THAT I MADE TO ONLY FOCUS ON ADDITION


import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Binary3{ //class is called "Binary".


  public static int addBinary(int[] a, int[] b){ //addition method called "addBinary"

    if(a[7].equals(0) && b[7].equals(0)){ //if the last bit of a is 0 AND the last bit of b is 0 then...
      s[7] = 0; //the sum is 0
    }
      else if (a[7].equals(1) && b[7]. equals(1)){ //if the last bit of a is 1 AND the last bit of b is 1 then...
        s[7] = 0; //the sum is 0 and...
        remainder = 1; //the remainder is 1
      }
        else{
          s = 1; //otherwise the sum is
          remainder = 0;
        }

    //loop to repeat process below until a[0], b[0], and s[0].
    for (int i=6; i>=0; i--){ // start i at 6 and go until i is more than or equal to 0 and go in the 7to0 direction.
      if (a[i].equals(0) && b[i].equals(0) && remainder.equals(0)){ //if no variables are 1
        s[i] = 0;
        remainder = 0;
      }
        else if (a[i].equals(1) && b[i].equals(1) && remainder.equals(1)){ //if all variables are 1
          s[i] = 1;
          remainder = 1;
        }
          else if (a[i].equals(1) ^ b[i].equals(1) ^ remainder.equals(1)){ //if only one variable=1 then s=1 and r=0.
            s[i] = 1;
            remainder = 0;
          }
            else{ //if two variables=1 then s=0 and r=1
              s[i] = 0;
              remainder = 1;
            }
    }
    return s;

    /* need 2 situations: one for a=0 OR b=0. the other for a=1 AND b=1.
    For the second situation, it needs a while loop because 1+1=2 but 2 is 0 with a remainder of 1
    */

  }//end of addBinary



  public static void main(String[] args){ //main method
    //ask user to input 2 8 bit numbers and call each a and b. then output number "s"
    int i = 0;
    int remainder = 0; //this says that the first number we deal with has a remainder of 0
    int a = 8; //this makes an array for the first inputed binary number
    int b = 8; //array for second inputed number
    int s = 8; //array for outputed number

    System.out.println("please type an 8 bit binary number");
    Scanner input1 = new Scanner(System.in);
    String a = input1.nextLine();//this makes the  user's first input = a


    System.out.println("now type a second 8 bit binary number"); //this makes the user's second input = b
    Scanner input2 = new Scanner(System.in);
    String b = input2.nextLine();

//need to make an array for a and array for b and make the inputs into a and b arrays.

    System.out.println("the sum of your numbers is " + addBinary(a, b));
    }

    } //still need to do multiply and divide
