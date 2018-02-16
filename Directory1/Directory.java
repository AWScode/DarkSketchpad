import java.util.*;

public class Directory{

  public static void main(String[] args) {
    System.out.println("Welcome to Sky High!");


    Student Warren = new Student("Warren", 10, "fireballs", "HeroTraining");
    Student Will = new Student("Will", 9, "strength", "HeroSupport");
    Student Layla = new Student("Layla", 9, "plants", "HeroSupport");

    System.out.println("Here are the students enrolled here: \n");

    ArrayList<Student> listOfStudents = new ArrayList<Student>();
    listOfStudents.add(Warren);
    listOfStudents.add(Will);
    listOfStudents.add(Layla);

    for (int i = 0; i < listOfStudents.size(); i++) {
      System.out.println(listOfStudents.get(i).getName());
    }

    System.out.println("Which student would you like to know more about?");
    Scanner newIn = new Scanner(System.in);
    String choice = newIn.next();

    Boolean found = false;
    Student theStudent = new Student("Test", 0, "TestO", "Test1");
    for (int i = 0; i < listOfStudents.size(); i++) {
      if (choice.equals(listOfStudents.get(i).getName())) {
        System.out.println("What about " + choice + "?");
        found = true;
        theStudent = listOfStudents.get(i);
        break;
      }
    }

    if (!found) {
      System.out.println("That student doesn't go here :/");
    }
    else {
      Scanner q = new Scanner(System.in);
      String question =  q.next();
      if (question.equals("subject")) {
        System.out.println(theStudent.getName() + "\'s main subject is " + theStudent.getSubject());
      }
    }


  }

}
