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
  public static void main(String[] args) {
    int i, f=1; //calling an integer 'i' and assigning 'f' to equal 1 to start off
    for (i = 1; i <= 10; i++){
      f=f*i; /*f equals f times i. starts out as 1 times 1 which is one. then 1
      times 2 (because i is increasing) which equals 2. Now f equals 2. So now
      it will be 2 times 3 which is 6. */
    }
    System.out.println("Factorial of 10 is " + f);

  }


  }
