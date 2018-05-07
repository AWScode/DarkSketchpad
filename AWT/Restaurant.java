import java.awt.event.*;
import java.awt.*;

public class Restaurant extends Frame{

  private TextArea name;
  private TextArea party;
  private TextField tf;
  private Button b;
  private TextArea foods;
  private TextArea quantity;
  private TextArea ta3;

  public Restaurant() {

    setSize(600,500);
    setLayout(null);
    setVisible(true);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });


    name = new TextArea();
    name.setBounds(110, 80, 150, 40);
    add(name);
    party = new TextArea();
    party.setBounds(110, 120, 80, 40);
    add(party);

    foods = new TextArea();
    foods.setBounds(80, 200, 50, 40);
    add(foods);

    tf = new TextField("");
    tf.setBounds(415, 80, 150, 60);
    add(tf);

    b = new Button("name/#");
    b.setBounds(210, 130, 90, 30);
    add(b);
    b.addActionListener(new ActionListener() {//says there's an error here
      public void actionPerformed(ActionEvent e){
        tf.setText(name.getText() + ", party of " + party.getText());
      }
    });

  }


  public void addLabel() {
    Label lab = new Label("Welcome to PIZZA PLANET");
    lab.setBounds(20, 30, 250, 30);
    this.add(lab);
    Label bel = new Label("menu");
    bel.setBounds(470, 180, 80, 30);
    this.add(bel);
    Label abe = new Label("Payment Type:");
    abe.setBounds(20, 250, 100, 30);
    this.add(abe);
    Label able = new Label("Your Name:");
    able.setBounds(20, 80, 100, 30);
    this.add(able);
    Label label = new Label("# of People");
    label.setBounds(20, 120, 130, 30);
    this.add(label);
    Label foodl = new Label("Food #:");
    foodl.setBounds(20, 200, 50, 30);
    this.add(foodl);
    Label quant = new Label("Quantity:");
    quant.setBounds(150, 200, 70, 30);
    this.add(quant);
  }


  public void addCheckbox() {
    Checkbox check1 = new Checkbox("For Here");
    check1.setBounds(300, 75, 90, 30);
    this.add(check1);
    Checkbox check2 = new Checkbox("To Go");
    check2.setBounds(300, 100, 80, 30);
    this.add(check2);
  }

  public void addChoice() {
    Choice c = new Choice();
    c.setBounds(120, 240, 100, 50);
    c.add("-----");
    c.add("cash");
    c.add("credit");
    c.add("debit");
    this.add(c);

    Choice ch = new Choice();
    ch.setBounds(220, 200, 70, 30);
    ch.add("--");
    ch.add("1");
    ch.add("2");
    ch.add("3");
    ch.add("4");
    ch.add("5");
    this.add(ch);
  }

  public void addList() {
    List l = new List(4);
    l.setBounds(430, 210, 120, 90);
    l.add("1. spaghetti");
    l.add("2. tacos");
    l.add("3. spaghetti tacos");
    l.add("4. cheesecake");
    this.add(l);
  }

  public static void main(String[] args) {
    Restaurant m = new Restaurant();
    m.addLabel();
    m.addCheckbox();
    m.addChoice();
    m.addList();

  }

}
