import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends JFrame implements ActionListener
{
    TextField tf1 ;

    JButton one ,two ,three ,four , five , six, seven , eight , nine ,
            zero , dot, clear , btnadd , btnsubs , btndivison , btnmul, equals;

    double num1=0 , num2=0, result=0;
    static int operator;



    public Calculator()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        tf1 = new TextField();
        tf1.setBounds(50,20,300,30);

        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        dot = new JButton(".");
        equals = new JButton("=");
        clear = new JButton("Clear");
        btnadd = new JButton("+");
        btnsubs = new JButton("-");
        btndivison = new JButton("/");
        btnmul = new JButton("*");


        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(zero);
        add(dot);
        add(equals);
        add(clear);
        add(btnadd);
        add(btnsubs);
        add(btndivison);
        add(btnmul);
        add(tf1);


        one.setBounds(50,65,100,30);
        two.setBounds(155,65,100,30);
        three.setBounds(260,65,100,30);
        four.setBounds(50,100,100,30);
        five.setBounds(155,100,100,30);
        six.setBounds(260,100,100,30);
        seven.setBounds(50,135,100,30);
        eight.setBounds(155,135,100,30);
        nine.setBounds(260,135,100,30);
        zero.setBounds(50,170,100,30);
        dot.setBounds(155,170,100,30);
        equals.setBounds(260,170,100,30);
        clear.setBounds(50,205,100,30);
        btnadd.setBounds(155,205,100,30);
        btnsubs.setBounds(260,205,100,30);
        btndivison.setBounds(50,240,100,30);
        btnmul.setBounds(155,240,100,30);

        setSize(400,400);
        setVisible(true);

        tf1.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        dot.addActionListener(this);
        equals.addActionListener(this);
        clear.addActionListener(this);
        btnadd.addActionListener(this);
        btnsubs.addActionListener(this);
        btndivison.addActionListener(this);
        btnmul.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==one)
            tf1.setText(tf1.getText().concat("1"));

        if(ae.getSource()==two)
            tf1.setText(tf1.getText().concat("2"));

        if(ae.getSource()==three)
            tf1.setText(tf1.getText().concat("3"));

        if(ae.getSource()==four)
            tf1.setText(tf1.getText().concat("4"));

        if(ae.getSource()==five)
            tf1.setText(tf1.getText().concat("5"));

        if(ae.getSource()==six)
            tf1.setText(tf1.getText().concat("6"));

        if(ae.getSource()==seven)
            tf1.setText(tf1.getText().concat("7"));

        if(ae.getSource()==eight)
            tf1.setText(tf1.getText().concat("8"));

        if(ae.getSource()==nine)
            tf1.setText(tf1.getText().concat("9"));

        if(ae.getSource()==zero)
            tf1.setText(tf1.getText().concat("0"));

        if(ae.getSource()==dot)
            tf1.setText(tf1.getText().concat("."));

        if(ae.getSource()==btnadd)
        {
            num1=Double.parseDouble(tf1.getText());
            operator=1;
            tf1.setText("");
        }

        if(ae.getSource()==btnsubs)
        {
            num1=Double.parseDouble(tf1.getText());
            operator=2;
            tf1.setText("");
        }

        if(ae.getSource()==btnmul)
        {
            num1=Double.parseDouble(tf1.getText());
            operator=3;
            tf1.setText("");
        }

        if(ae.getSource()==btndivison)
        {
            num1=Double.parseDouble(tf1.getText());
            operator=4;
            tf1.setText("");
        }

        if(ae.getSource()==equals)
        {
            num2=Double.parseDouble(tf1.getText());

            switch(operator)
            {
                case 1: result=num1+num2;
                    break;

                case 2: result=num1-num2;
                    break;

                case 3: result=num1-num2;
                    break;

                case 4: result=num1/num2;
                    break;

                default: result=0;
            }

            tf1.setText(""+result);
        }

        if(ae.getSource()==clear)
            tf1.setText("");

    }

    public static void main(String[] args)
    {
        new Calculator();
    }
}
