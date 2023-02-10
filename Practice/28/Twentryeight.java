import java.awt.*;
import javax.swing.*;
public class Twentryeight {
    Twentryeight(){
        JFrame f=new JFrame("My Panel");
        JPanel p=new JPanel();
        p.setBounds(20,30,200,300);
        p.setBackground(Color.green);
        JButton b1=new JButton("I am first Buttom");
        b1.setBounds(25,30,100,150);
        b1.setForeground(Color.blue);
        p.add(b1);

        JLabel l1=new JLabel("Hello");
        l1.setBounds(30,40,120,150);
        p.add(l1);

        JTextField t1=new JTextField("Hello Gaurav");
        t1.setBounds(30,40,110,130);
        p.add(t1);
        

        JButton b2=new JButton("I am Second Buttom");
        b2.setBounds(30,40,120,150);
        b2.setForeground(Color.blue);
        p.add(b2);

        f.add(p);
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Twentryeight();
    }
}

