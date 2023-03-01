import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Thrityeight {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Menu");
        f.setSize(700, 600);
        f.getContentPane().setBackground(Color.cyan);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        JTabbedPane jtp=new JTabbedPane();
        JPanel p1=new JPanel();
        JButton b1=new JButton("My Buttom");
        JTextField tf=new JTextField();
        tf.setBounds(50,150,300,300);
        p1.add(tf);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("I Am Personal Tab");
                tf.setForeground(Color.red);
                tf.setBackground(Color.cyan);
                // tf.setFont();
            }
        });
        p1.add(b1);
        jtp.addTab("Personal",p1);
        JPanel p2=new JPanel();
        JLabel l1=new JLabel("My Lebel");
        p2.add(l1);
        jtp.addTab("Academics",p2);
        f.add(jtp);
        p1.setBackground(Color.magenta);
        p2.setBackground(Color.cyan);
        f.setVisible(true);

    }
}
