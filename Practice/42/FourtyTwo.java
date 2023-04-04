import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

// labelexg
class FourtyTwo {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        // frame.setDefaultCloseOperation(JFrame.Exit_On_Close);
        frame.setBounds(500, 500, 500, 500);
        frame.setTitle("My label Frame");
        frame.setResizable(false);
        Container c = frame.getContentPane();
        c.setLayout(null);
        JLabel label = new JLabel("UserName");
        label.setBounds(10, 50, 100, 20);
        c.add(label);
        Font font = new Font("Arial", Font.ITALIC, 30);
        label.setFont(font);
        JTextField user = new JTextField();
        user.setBounds(120, 50, 120, 20);
        c.add(user);
        JLabel label1 = new JLabel("Pasword");
        label1.setBounds(10, 100, 100, 20);
        Font font1 = new Font("Arial", Font.BOLD, 30);
        label1.setFont(font1);
        JTextField pass = new JTextField();
        pass.setBounds(120, 100, 120, 20);
        c.add(pass);
        c.add(label1);
        JButton btn = new JButton("Login");
        btn.setBounds(100, 150, 70, 20);
        c.add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Username:- " + user.getText());
                System.out.println("Password:- " + pass.getText());
            }
        });
        frame.setVisible(true);
    }
}