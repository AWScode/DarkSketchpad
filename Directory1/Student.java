public class Student{

  public static String name;
  public static int grade;
  public static String power;
  public static String subject;

  public Student(String n, int g, String p, String s){
    this.name = n;
    this.grade = g;
    this.power = p;
    this.subject = s;
  }

  public String getName(){
    return name;
  }

  public int getGrade(){
    return grade;
  }

  public String getPower(){
    return power;
  }

  public String getSubject(){
    return subject;
  }


  public void setName(String n){
    name = n;
  }

  public void setGreade(int g){
    grade = g;
  }

  public void setPower(String p){
    power = p;
  }

  public void setSubject(String s){
    subject = s;
  }


}
