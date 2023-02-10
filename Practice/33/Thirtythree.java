import java.awt.*;
import javax.swing.*;
public class Thirtythree {
    Thirtythree()
    {
        JFrame f=new JFrame("My Panel");
        JPanel p=new JPanel();
        p.setBounds(20,30,500,600);
        p.setBackground(Color.green);

        JLabel l1=new JLabel("Username : ");
        l1.setBounds(10,20,80,20);
        f.add(l1);

        JTextField t1=new JTextField();
        t1.setBounds(100,20,150,20);
        f.add(t1);

        JLabel l2=new JLabel("Password : ");
        l2.setBounds(10,70,80,20);
        f.add(l2);

        JTextField t2=new JTextField();
        t2.setBounds(100,70,150,20);
        f.add(t2);
        

        JButton b1=new JButton("Login");
        b1.setBounds(30,120,100,30);
        b1.setForeground(Color.blue);
        f.add(b1);

        JButton b2=new JButton("Reset");
        b2.setBounds(150,120,100,30);
        b2.setForeground(Color.blue);
        f.add(b2);

        f.setSize(500,300);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(Color.cyan);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Thirtythree();
    }
}
