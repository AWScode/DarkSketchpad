/*
Anna Salam
Directory Project
Due: 2/16/18 5pm
class importing
*/

import java.util.*;

public class Directory{

  public static void main(String[] args) {
    System.out.println("Welcome to Sky High!");


    Student Warren = new Student("Warren", 10, "fireballs", "HeroTraining"); //the details for each student using Student class
    Student Will = new Student("Will", 9, "strong", "HeroSupport");
    Student Layla = new Student("Layla", 9, "plants", "HeroSupport");

    Subject HeroTraining = new Subject("HeroTraining", 15, "Coach Boomer", true); //the details for each class using the Subject class
    Subject HeroSupport = new Subject("HeroSupport", 23, "Mr. Boy", false);

    System.out.println("Here are the students enrolled here: ");

    ArrayList<Student> listOfStudents = new ArrayList<Student>(); //arraylist made up of all the students (holds their details but is seen as objects assigned to above)
    listOfStudents.add(Warren);
    listOfStudents.add(Will);
    listOfStudents.add(Layla);

    for (int i = 0; i < listOfStudents.size(); i++) { //this loop outputs each object (student) in the array list
      System.out.println(listOfStudents.get(i).getName());
    }

    System.out.println("Which student would you like to know more about?");
    Scanner newIn = new Scanner(System.in);
    String choice = newIn.next();//user inputs a student's name

    Boolean found = false;
    Student theStudent = new Student("Test", 0, "TestO", "Test1");//this is just a filler student that has no value (lol)
    for (int i = 0; i < listOfStudents.size(); i++) {//loop to determine which student user chose
      if (choice.equals(listOfStudents.get(i).getName())) {
        System.out.println("Would you like to know " + choice + "'s main subject? Yes or No?"); //if the user chose a student that goes to the school, it asks if you would like to know the subject
        found = true;
        theStudent = listOfStudents.get(i);
        break;
      }
    }

    if (!found) {
      System.out.println("That student doesn't go here :/");//if user inputs not a student, this is outputted
    }
    else {
      Scanner q = new Scanner(System.in); //otherwise the following is outputted
      String question =  q.next();
      if (question.equals("yes")) {
        System.out.println(theStudent.getName() + "\'s main subject is " + theStudent.getSubject() + "\n"); //the student chosen by user and what class their in is outputted
        System.out.println("Here is some more information about the student: ");
        System.out.println("Grade: " + theStudent.getGrade() + "\n" + "Superpower: " + theStudent.getPower()); //other information about the student is outputted using objects above and Student class
      }
      else System.out.println("ok"); //if user doesn't input yes to question about, this is outputted
    }

/*so far this progam outputs the names of students, asks if user would like to
know more about x student, asks if they would like to know their main subject,
and works as long as user follows instructions.
    This isn't what the assignment asks for but I like it better this way so
      I'm gonna keep it.
*/

//Above is Student part. Below is the Subject part.

    ArrayList<Subject> listOfSubjects = new ArrayList<Subject>();
    listOfSubjects.add(HeroTraining);
    listOfSubjects.add(HeroSupport);

    System.out.println("Would you like to see the main subjects at Sky High? Yes or No?");
    Scanner q2 = new Scanner(System.in);
    String question2 = q2.next();
    if (question2.equals("yes")){ //if the user answers yes to question above, the following occurs.
      for (int i = 0; i < listOfSubjects.size(); i++) {
        System.out.println(listOfSubjects.get(i).getLabel());
      }
      System.out.println("Which would you like to know more about?");
      Scanner q3 = new Scanner(System.in);
      String question3 = q3.next();

      Boolean found2 = false;
      Subject theSubject = new Subject("Test", 0, "TestO", true);
      for (int i = 0; i < listOfSubjects.size(); i++) {
        if (question3.equals(listOfSubjects.get(i).getLabel())) { //if the user successfully inputs one of the subjects from the arraylist, the following occurs
          theSubject = listOfSubjects.get(i);
          System.out.println("Number of students: " + theSubject.getPop() + "\n" + "Teacher: " + theSubject.getTeacher() + "\n" + "Powers are used? " + theSubject.getPowers()); //other info about the subject is outputted using Subject class
          break;
        }
      }

      if (!found) {
        System.out.println("We don't have that class :/");//if user inputs something other than the subjects listed, this is outputted
      }
    }

    else System.out.println("ok"); //if the user inouts no then this happens





  }

}
