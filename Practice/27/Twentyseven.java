import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Twentyseven {
    public static void main(String[] args) {
        JFrame f=new JFrame("Buttom class Example");
        JTextField tf=new JTextField();
        tf.setBounds(100,150,300,300);
        f.add(tf);
        JButton b=new JButton("Click me");
        b.setBounds(68,15,250,90);
        b.setBackground(Color.green);
        b.setForeground(Color.BLUE);
        f.add(b);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Welcome to my World");
                tf.setForeground(Color.green);
            }
        });
        f.getContentPane().setBackground(Color.yellow);
        f.setSize(400,500);
        f.setLayout(null);
        f.setResizable(false);
        f.setVisible(true);
    }
}
