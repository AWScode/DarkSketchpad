public class Subject{

  public String label; //class name
  public int population; //number of students in class
  public String teacher;
  public boolean powers; //are the powers needed for the class?

  public Subject(String l, int pop, String t, boolean pow){
    this.label = l;
    this.population = pop;
    this.teacher = t;
    this.powers = pow;
  }

  public String getLabel(){
    return label;
  }

  public int getPop(){
    return population;
  }

  public String getTeacher(){
    return teacher;
  }

  public boolean getPowers(){
    return powers; //in student class, a variable is called power (singular). this is called powers (plural). may be confusing
  }

  public void setLabel(String l){
    label = l;
  }

  public void setPop(int pop){
    population = pop;
  }

  public void setTeacher(String t){
    teacher = t;
  }

  public void setPowers(boolean pow){
    powers = pow;
  }


}
