import java.awt.event.*;
import java.awt.*;

public class Restaurant extends Frame{

  private TextField tf;
  private TextField tf2;
  private TextArea ta;
  private Button b;
  private TextField foods;
  private TextField quantity;
  private TextField tf3;

  public Restaurant() {

    setSize(600,500);
    setLayout(null);
    setVisible(true);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });


    tf = new TextField("");
    tf.setBounds(110, 80, 150, 20);
    add(tf);
    tf2 = new TextField("");
    tf2.setBounds(110, 110, 80, 20);
    add(tf2);

    foods = new TextField("");
    foods.setBounds(80, 150, 50, 20);
    add(foods);
    quantity = new TextField("");
    quantity.setBounds(220, 150, 50, 20);
    add(quantity);

    tf3 = new TextField("");
    tf3.setBounds(20, 230, 100, 50);
    add(tf3);

    b = new Button("submit");
    b.setBounds(285, 190, 100, 30);
    this.add(b);

    b.addActionListener(new ActionListener() {//says there's an error here
      public void ActionPerformed(ActionEvent e){
        tf3.setText("Your Order"); //("your order" + quantity + food)
      }
    });

  }


  public void addLabel() {
    Label lab = new Label("Welcome to PIZZA PLANET");
    lab.setBounds(20, 30, 250, 30);
    this.add(lab);
    Label bel = new Label("menu");
    bel.setBounds(470, 45, 80, 30);
    this.add(bel);
    Label abe = new Label("Payment Type:");
    abe.setBounds(20, 200, 100, 30);
    this.add(abe);
    Label able = new Label("Your Name:");
    able.setBounds(20, 80, 100, 30);
    this.add(able);
    Label label = new Label("# of People");
    label.setBounds(20, 100, 130, 30);
    this.add(label);
    Label foodl = new Label("Food #:");
    foodl.setBounds(20, 150, 50, 30);
    this.add(foodl);
    Label quant = new Label("Quantity:");
    quant.setBounds(150, 150, 70, 30);
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
    c.setBounds(140, 190, 100, 50);
    c.add("-----");
    c.add("cash");
    c.add("credit");
    c.add("debit");
    this.add(c);
  }

  public void addList() {
    List l = new List(4);
    l.setBounds(430, 75, 120, 90);
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
