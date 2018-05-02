import java.awt.*;

public class Restaurant extends Frame{

  public Restaurant() {

    setSize(400,300);
    setLayout(null);
    setVisible(true);
  }

  public void addButton() {
    Button b = new Button("agree");
    b.setBounds(285, 210, 100, 30);
    this.add(b);
  }

  public void addLabel() {
    Label lab = new Label("PIZZA PLANET");
    lab.setBounds(20, 115, 120, 30);
    this.add(lab);
    Label bel = new Label("menu");
    bel.setBounds(317, 45, 80, 30);
    this.add(bel);
    Label abe = new Label("do you agree to the terms and conditions?");
    abe.setBounds(10, 200, 290, 50);
    this.add(abe);
    Label bll = new Label("welcome to...");
    bll.setBounds(20, 85, 120, 30);
    this.add(bll);
  }

  public void addCheckbox() {
    Checkbox check1 = new Checkbox("Adult");
    check1.setBounds(150, 75, 70, 30);
    this.add(check1);
    Checkbox check2 = new Checkbox("Kid");
    check2.setBounds(220, 75, 80, 30);
    this.add(check2);
  }

  public void addChoice() {
    Choice c = new Choice();
    c.setBounds(140, 120, 150, 50);
    c.add("sit down");
    c.add("pick-up");
    c.add("delivery");
    this.add(c);
  }

  public void addList() {
    List l = new List(4);
    l.setBounds(300, 75, 80, 105);
    l.add("cheese");
    l.add("pepperoni");
    l.add("hawaiian");
    l.add("veggie");
    this.add(l);
  }

  public static void main(String[] args) {
    Restaurant m = new Restaurant();
    m.addButton();
    m.addLabel();
    m.addCheckbox();
    m.addChoice();
    m.addList();

  }

}
