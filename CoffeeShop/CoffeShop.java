public class Main {
  public static void main(String[] args {
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to JellyBean Coffee, may I take your order?");
    System order = in.nextLine();
    System.out.println("And what's your name?");
    String name = in.nextLine();
    System.out.println("One moment por favor...");
    System.out.println(name + "your" + order + "is ready.");
  }
}
