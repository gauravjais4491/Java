import java.awt.*;
import javax.swing.*;

public class Thritysix {
    public static void main(String[] args) {
        JFrame f=new JFrame("My Menu");
        f.getContentPane().setBackground(Color.ORANGE);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        JMenuBar jmb=new JMenuBar();
        JMenu m1=new JMenu("File");
        JMenuItem i1=new JMenuItem("New");
        JMenuItem i2=new JMenuItem("Open");
        JMenuItem i3=new JMenuItem("Save");
        i1.setBackground(Color.cyan);
        i2.setBackground(Color.yellow);
        i3.setBackground(Color.cyan);
        // i7.setBackground(Color.yellow);
        // i8.setBackground(Color.cyan);
        //JMenuItem i4=new JMenuItem("Save As");
        JMenu m11=new JMenu("Save As");
        m11.setBackground(Color.yellow);
        m11.add(new JMenuItem("pdf"));
        m11.add(new JMenuItem("Doc"));
        m11.add(new JMenuItem("txt"));
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(m11);
        jmb.add(m1);
        
        JMenu m2=new JMenu("Edit");
        JMenuItem i4=new JMenuItem("Cut");
        JMenuItem i5=new JMenuItem("Copy");
        JMenuItem i6=new JMenuItem("Paste");
        JMenuItem i7=new JMenuItem("Select");
        JMenuItem i8=new JMenuItem("Select All");
        i4.setBackground(Color.cyan);
        i5.setBackground(Color.yellow);
        i6.setBackground(Color.cyan);
        i7.setBackground(Color.yellow);
        i8.setBackground(Color.cyan);
        m2.add(i4);
        m2.add(i5);
        m2.add(i6);
        m2.add(i7);
        m2.add(i8);
        jmb.add(m2);
        JMenu m3=new JMenu("View");
        JCheckBoxMenuItem cm=new JCheckBoxMenuItem("Status Bar");
        m3.add(cm);
        jmb.add(m3);
        f.setJMenuBar(jmb);
        f.setVisible(true);

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
        

    }
}
