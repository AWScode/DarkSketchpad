/* Anna Salam
ShoppingSpree.java
project
10.25.17 */

/*
this class should hold the data and methods to run ShoppingSpree which allows a user to keep track of items bought and her budget
*/
//program: ShoppingSpree

import java.util.*;
// class: instructions for this program that keeps track of data and
public class ShoppingSpree {

/* if I were shopping, what would I want to know at all time
        budget ($$),   what we buy/inventory (list) [bags], */
  int budget;
  ArrayList<String> bags;

  public ShoppingSpree(int money) {
    budget = money;
    bags = new ArrayList<String>();
  }
// public ShoppingSpree is the constructor

// what types of methods do we want?

  public int getMoney() { // public int means it will return an integer so the budget will return a number
    return budget;
  }

  public void getBags() {
    System.out.print("You bought ");
    for (int i = 0; i < bags.size(); i++) {
      System.out.print(bags.get(i) + ", ");
    }
    System.out.println(". That's all.");
  }
// ^^ this tells you your inventory AKA what you bought ^^

  public void buyCandy() {
    bags.add("candy"); // this adds "candy" to inventory.
    budget = budget - 2; // this changes your end budget bc candy costs "2" so it subtracts 2 from your budget
  }

  public void buyMilk() {
    bags.add("milk");
    budget = budget - 7;
  }

  public void buyToothbrush() {
    bags.add("toothbrush");
    budget = budget - 3;
  }

  public static void main(String[] args) {
    // ^this is the main method. Below is the stuff that is gonna come up when we first start ShoppingSpree
    System.out.println("Welcome to DangerousWay! How much can you spend?");
    Scanner amount = new Scanner(System.in);
    int money = Integer.parseInt(amount.nextLine()); // this is the budget that the user will input

    ShoppingSpree spree = new ShoppingSpree(money);
// above and below is what will be bought
    spree.buyCandy();
    spree.buyCandy(); // I'm buying candy multiple times because who can eat just ONE piece of candy. crazies
    spree.buyCandy();
    spree.buyMilk();
    spree.buyToothbrush();

    System.out.println("You have " + spree.getMoney() + " dollars left."); // this will print out how much of the budget is left
    spree.getBags();
  }

}

// I ran out of time so I haven't run it to see if it works.
