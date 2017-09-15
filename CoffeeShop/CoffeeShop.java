import java.util.Scanner;
//Anna Salam 9/15/17

public class CoffeeShop {
  public static void main(String[] args) {
    System.out.println("Welcome to JellyBean Coffee, may I take your order?");
//JellyBean because "bean" like coffee bean but jelly beans are cuter.
    Scanner in = new Scanner(System.in);
    String order = in.nextLine();
    System.out.println("And what's your name?");
    Scanner scan = new Scanner(System.in);
    String name = in.nextLine();
    System.out.println("One moment por favor...");
//was going to leave time as processing time but couldn't figure it out and ran out of time
    System.out.println(name + ", your suger free, low fat iced water is ready.");
//it's funny because water doesn't have any sugar or fat. This is inspired by that cinderella movie with Hillary Huff.
    System.out.println("oops. we messed up. please try again never.");
//it's an anxty coffee shop
  }
}
