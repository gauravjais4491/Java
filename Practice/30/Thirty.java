import java.awt.*;
import javax.swing.*;
public class Thirty {
    Thirty(){
        JFrame jf=new JFrame("My FLow Layout");
        jf.setSize(1000,1500);
        jf.getContentPane().setBackground(Color.red);
        JButton b1=new JButton("0");
        b1.setBounds(20,25,60,70);
        JButton b2=new JButton("1");
        b2.setBounds(25,27,60,70);
        JButton b3=new JButton("2");
        b3.setBounds(30,29,60,70);
        JButton b4=new JButton("3");
        b4.setBounds(35,33,60,70);
        JButton b5=new JButton("4");
        b5.setBounds(40,36,80,90);
        JButton b6=new JButton("5");
        b6.setBounds(45,40,80,90);
        JButton b7=new JButton("6");
        b7.setBounds(50,44,80,90);
        JButton b8=new JButton("8");
        b8.setBounds(55,47,80,90);
        JButton b9=new JButton("9");
        b9.setBounds(60,52,80,90);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(b7);
        jf.add(b8);
        jf.add(b9);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout(FlowLayout.RIGHT,20,50));
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new Thirty();
    }
}
