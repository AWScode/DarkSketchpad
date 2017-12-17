/* Anna Salam
Binary Project
Due: 12/18/17

      I only did addition and subtraction because I'm not really sure what I'm doing.
      Because I don't have the basic understandings of coding, projects are harder.
      The program doesn't work because of an error at the end. I'm sure that there are plenty of errors throughout this project, but I have no idea where or why.
      It's pointless for me to keep wasting my time because I am not going to suddenly understand code with a few extra days.
      I'm fine with whatever grade this gets.
*/

import java.util.*;
import java.lang.*;

public class Binary{//creates class called Binary

  public static void main(String[] args) {//main method

    System.out.println("type an 8 bit binary number.");//asks user to input a number
    Scanner input1 = new Scanner(System.in);
    String first = input1.nextLine();//scans the users input

    System.out.println("type another 8 bit number.");
    Scanner input2 = new Scanner(System.in);
    String second = input2.nextLine();

    String[] a = first;//takes inputs and calls it to a or b as arrays
    String[] b = second;

    System.out.println("Do you want to \"add\" or \"subtract\".");//asks user to input add or subtract
    Scanner input3 = new Scanner(System.in);
    String word = input3.nextLine();//scans the users input

    if(word.equals("add")){//if input3 is add, then a and b will be used as arrays and the add method will be used
      System.out.println(Arrays.toString(a)); //uses a as an array
      System.out.println(Arrays.toString(b)); //uses b as an array
      String[] s = add(a,b);//calls add method
      System.out.println(Arrays.toString(s)); //outputs the answer 's'
    }

    if (word.equals("subtract")){ //if input3 is subtract, then a and b will be used as Arrays and the subtract method will be used
      System.out.println(Arrays.toString(a)); //uses a as an array
      System.out.println(Arrays.toString(b)); //uses b as an array
      String[] s = subtract(num1,num2);// calls subtract method
      System.out.println(Arrays.toString(s)); //outputs the answer
    }
  }

    public static String[] add(String[] a, String[] b){ //add method (uses a and b)
      String[] sum = new String[8];//I don't really know what this is.
      boolean car = false;//this makes the carry or remainder a boolean (true or false) instead of a 1 or 0 like the sum
      for(int i = 7; i>-1; i--){//this starts from the first number on the right and moves to the left
        if(rem==false){ //if the remainder is 0 (or if there is no remainder)...
          if(a[i].equals("1") && b[i].equals("1")){ //and if the a and b bits both equal 1, then the sum is 0 and there is a remainder
            s[i] = "0";
            rem = true;
          }
          else if((a[i].equals("1") && b[i].equals("0")) || (a[i].equals("0") && b[i].equals("1"))){ //if the a=1 and the b=0 or the a=0 and the b=1 then the sum is 1 and there is no remainder
            s[i] = "1";
            rem = false;
          }
          else{ //if neither of the above are true, then the sum is 0 and there is no remainder
            a[i] = "0";
            rem = false;
          }
        }
        else{ //if there is a remainder...
          if(a[i].equals("1") && b[i].equals("1")){ //and if a and b = 1 then the sum is 1 and there is a remainder
            s[i] = "1";
            rem = true;
          }
          else if((a[i].equals("1") && b[i].equals("0")) || (a[i].equals("0") && b[i].equals("1"))){ //if the a=1 and the b=0 or the a=0 and the b=1 then the sum is 0 and there is a remainder
            s[i] = "0";
            rem = true;
          }
          else{ //otherwise the sum is 1 and there is no remainder
            s[i] = "1";
            rem = false;
          }
        }
      }
      return s; //the output of this method is 's' (the sum)
    }

    public static String[] twoc(String[] b){//this method is to help find the Two's Compliment
      String[] n = new String[8];// this makes a new variable 'n' for negative
      for(int i= 7; i>-1; i--){
        if(b[i].equals("0")){ //if b is 1 then it becomes n which would equal 1
          n[i]="1";
        }
        else{ //if b is 0 then b becomes n which would equal 0
          n[i]="0";
        }
      }
      String[] p = {0,0,0,0,0,0,0,1}; // this makes an array of {0,0,0,0,0,0,0,1} so that we can use it to add. it's called 'p' for plus 1
    }

    public static String[] subtract(String[] a,String[] b){
      String[] sub = add(n,p);// creates the Two's Complement by adding the negative of b and using the add method to add 1 to n.
      return add(a,sub);// adds the Two'sCompliment found above and adds it to a to find the difference of a and b
    } //it says that there is an error here but I don't know why.
