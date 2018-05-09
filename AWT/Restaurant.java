import java.awt.event.*;
import java.awt.*;

public class Restaurant extends Frame{

  private Label lab;
  private Label bel;
  private Label abe;
  private Label able;
  private Label label;
  private Label foodl;
  private Label quant;
  private TextArea name;
  private TextArea party;
  private TextField tf;
  private Button b;
  private TextArea ta3;
  private Choice ch;
  private Choice food;
  private Choice c;
  private Button b2;
  private TextField tf2;
  private TextField tf3;
  private Button order;
  private Frame frame2;
  private TextField ordered;
  private TextField ordereded;




  public Restaurant() {

    setSize(600,400);
    setLayout(null);
    setVisible(true);
    setBackground(Color.cyan);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });


    lab = new Label("Welcome to PIZZA PLANET! Canada");
    lab.setBounds(20, 30, 280, 30);
    add(lab);
    bel = new Label("menu");
    bel.setBounds(450, 160, 80, 30);
    add(bel);
    abe = new Label("Payment Type:");
    abe.setBounds(20, 250, 100, 30);
    add(abe);
    able = new Label("Your Name:");
    able.setBounds(20, 80, 90, 30);
    add(able);
    label = new Label("# of People:");
    label.setBounds(20, 120, 90, 30);
    add(label);
    foodl = new Label("Food #:");
    foodl.setBounds(20, 200, 50, 30);
    add(foodl);
    quant = new Label("Quantity:");
    quant.setBounds(170, 200, 65, 30);
    add(quant);


    frame2 = new Frame();
    frame2.setSize(400,300);
    frame2.setLayout(null);
    frame2.setVisible(false);
    frame2.setBackground(Color.yellow);

    frame2.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    ordered = new TextField("Your order has been placed.");
    ordered.setBounds(90,100,200,40);
    ordered.setBackground(Color.white);
    frame2.add(ordered);

    ordereded = new TextField("Thank you for ordering at PIZZA PLANET! Canada");//"at" if for here, "from" if to go
    ordereded.setBounds(35,160,315,40);
    ordereded.setBackground(Color.white);
    frame2.add(ordereded);



    name = new TextArea();
    name.setBounds(110, 80, 150, 40);
    add(name);
    party = new TextArea();
    party.setBounds(110, 120, 80, 40);
    add(party);

    tf = new TextField("");
    tf.setBounds(320, 80, 250, 60);
    add(tf);

    b = new Button("name/#");
    b.setBounds(210, 130, 90, 30);
    add(b);
    b.addActionListener(new ActionListener() {//says there's an error here
      public void actionPerformed(ActionEvent e){
        tf.setText(name.getText() + ", party of " + party.getText());
      }
    });

    ch = new Choice();
    ch.setBounds(235, 200, 70, 30);
    ch.add("--");
    ch.add("1");
    ch.add("2");
    ch.add("3");
    ch.add("4");
    ch.add("5");
    add(ch);

    food = new Choice();
    food.setBounds(75, 200, 70, 30);
    food.add("--");
    food.add("1");
    food.add("2");
    food.add("3");
    food.add("4");
    add(food);

    c = new Choice();
    c.setBounds(120, 240, 100, 50);
    c.add("-----");
    c.add("cash");
    c.add("credit");
    c.add("debit");
    add(c);

    tf2 = new TextField("");
    tf2.setBounds(20, 300, 240, 80);
    add(tf2);

    tf3 = new TextField("Price:");
    tf3.setBounds(270, 300, 200, 80);
    add(tf3);

    b2 = new Button("OK");
    b2.setBounds(250, 250, 90, 30);
    add(b2);
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev){
        tf2.setText(ch.getSelectedItem() + " of number " + food.getSelectedItem() + ", paying with " + c.getSelectedItem());
        tf3.setText("Price: " + ch.getSelectedItem() + " * (" + food.getSelectedItem() + " * $5.00)");
      }
    });

    order = new Button("ORDER");
    order.setBounds(480, 320, 100, 30);
    add(order);
    order.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent eve){
        frame2.setVisible(true);
        //if "for here", add a label that says (we will be bringing this to you in a moment). if "to go", add label saying (your order will be ready for pick up in 20 min)
      }
    });

  }



  public void addCheckbox() {
    Checkbox check1 = new Checkbox("For Here");
    check1.setBounds(310, 175, 90, 30);
    this.add(check1);
    Checkbox check2 = new Checkbox("To Go");
    check2.setBounds(310, 200, 80, 30);
    this.add(check2);
  }



  public void addList() {
    List l = new List(4);
    l.setBounds(410, 190, 120, 90);
    l.add("1. tacos");
    l.add("2. spaghetti");
    l.add("3. spaghetti tacos");
    l.add("4. cheesecake");
    this.add(l);
  }

  public static void main(String[] args) {
    Restaurant m = new Restaurant();
    m.addCheckbox();
    m.addList();

  }

}
