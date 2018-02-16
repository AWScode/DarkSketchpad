import java.util.*;

public class Directory{

  public static void main(String[] args) {

    Student Warren = new Student("Warren", 10, "fireballs", "HeroTraining");
    Student Will = new Student("Will", 9, "strength", "HeroSupport");
    Student Layla = new Student("Layla", 9, "plants", "HeroSupport");

    System.out.println("Here are the students enrolled at Sky High: \n");

    ArrayList<Student> listOfStudents = new ArrayList<Student>();
    listOfStudents.add(Warren);
    listOfStudents.add(Will);
    listOfStudents.add(Layla);

    for (int i = 0; i < listOfStudents.size(); i++){
      System.out.println(listOfStudents.get().getName());
    }


  }

}
