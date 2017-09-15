import java.util.Scanner;
//Anna Salam 9/15/17
public class CoffeeShop {
  public static void main(String[] args) {
    System.out.println("Welcome to JellyBean Coffee, may I take your order?");
    Scanner in = new Scanner(System.in);
    String order = in.nextLine();
    System.out.println("And what's your name?");
    Scanner scan = new Scanner(System.in);
    String name = in.nextLine();
    System.out.println("One moment por favor...");
    System.out.println(name + ", your " + order + " is ready.");
  }
}
