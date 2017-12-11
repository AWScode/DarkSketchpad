/* Anna Salam
Binary Project
Due: 12/13/17
*/

import java.util.*;

public class Binary{ //class is called "Binary"

  int i = 0;
  int remainder = 0; //this says that the first number we deal with has a remainder of 0
  int a = new int[8]; //this makes an array for the first inputed binary number
  int b = new int[8]; //array for second inputed number
  int s = new int[8]; //array for outputed number

  public static void main(String[] args){
    //ask user to input 2 8 bit numbers and call each a and b. then output number "s"
    System.out.println("please type an 8 bit binary number");
    Scanner a[] = new Scanner(System.in); //this makes the  user's first input = binOne

    System.out.println("now type a second 8 bit binary number"); //this makes the user's second input = binTwo
    Scanner b[] = new Scanner(System.in);

    System.out.println("choose what you would like to do with your binary numbers: add, subtract, multiply, divide")
    String atith = scan.nextLine();
    if (atith.equals("add")){
      System.out.println("the sum of your numbers is" + addBinary)
      else (atith.equals("subtract"))
        System.out.System.out.println("the difference of your numbers is" + subtractBinary);
    } //still need to do multiply and divide
  }


  public static int addBinary(){ //addition method called "addBinary"

    if(a[7].equals(0) && b[7].equals(0)){ //if the last bit of a is 0 AND the last bit of b is 0 then...
      s[7] = 0; //the sum is 0
      else if (a[7].equals(1) && b[7]. equals(1)){ //if the last bit of a is 1 AND the last bit of b is 1 then...
        s[7] = 0; //the sum is 0 and...
        remainder = 1; //the remainder is 1
        else{
          s = 1; //otherwise the sum is 1
        }
      }
    }
    for (int i=7; i>=0; i--){ //loop to repeat process below until a[0], b[0], and s[0]
      if (a[i].equals(0) && b[i].equals(0) && remainder.equals(0)){
        s[i] = 0;
        remainder = 0;
        else if (a[i].equals(1) && b[i].equals(1) && remainder.equals(1)){
          s[i] = 1;
          remainder = 1;
          else{
            s[i] = 1;
            remainder = 0;
          }
        }
      }
    }
  }//end of addBinary

  public static int subtractBinary(){
    //first i need to change b so that it is two's complement
    //then i just add with new b
    for (int i=7; i>=0; i--){
      if (b[i].equals(0)){
        c[i] = 1;
        else{
          c[i] = 0;
          remainder = 1; //need to somehow make c a new input and make sure it is used in the answer. or do i just keep it as b?
        }
      }
    }

    //then i just do addBinary except change b to c.

  }//end of subtractBinary

}
