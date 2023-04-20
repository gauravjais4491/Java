// import java.awt.*;
// import javax.swing.*;
// import java.awt.event.*;

// public class Thirtythree {
//     Thirtythree(){
//         JFrame f = new JFrame("Login Page");
//         // JPanel p=new JPanel();
//         // p.setBounds(20,30,500,600);
//         // p.setBackground(Color.green);

//         JLabel l1 = new JLabel("Username : ");
//         l1.setBounds(10, 20, 80, 20);
//         f.add(l1);

//         JTextField t1 = new JTextField();
//         t1.setBounds(100, 20, 150, 20);
//         f.add(t1);

//         JLabel l2 = new JLabel("Password : ");
//         l2.setBounds(10, 70, 80, 20);
//         f.add(l2);

//         JPasswordField t2 = new JPasswordField();
//         t2.setBounds(100, 70, 150, 20);
//         f.add(t2);

//         JButton b1 = new JButton("Login");
//         b1.setBounds(30, 120, 100, 30);
//         b1.setForeground(Color.blue);
//         f.add(b1);

//         b1.addActionListener(new ActionListener()
//         {
//             public void actionPerformed(ActionEvent e)
//             {
//                 System.out.println("Username is : "+ t1.getText());
//                 System.out.println("Password is : "+t2.getText());                // tf.setFont();
//             }
//         });

//         JButton b2 = new JButton("Reset");
//         b2.setBounds(150, 120, 100, 30);
//         b2.setForeground(Color.blue);
//         f.add(b2);

//         f.setSize(500, 300);
//         f.setLayout(null);
//         f.setLocationRelativeTo(null);
//         f.getContentPane().setBackground(Color.cyan);
//         f.setVisible(true);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public static void main(String[] args) {
//         new Thirtythree();
//     }

// }

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class SignUpGUI extends JFrame implements ActionListener {
    private JLabel lblUsername, lblPassword, lblConfirmPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword, txtConfirmPassword;
    private JButton btnSignUp;
    private Connection conn;

    public SignUpGUI() {
        setTitle("Sign Up Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        lblUsername = new JLabel("Username:");
        txtUsername = new JTextField(10);
        lblPassword = new JLabel("Password:");
        txtPassword = new JPasswordField(10);
        lblConfirmPassword = new JLabel("Confirm Password:");
        txtConfirmPassword = new JPasswordField(10);
        btnSignUp = new JButton("Sign Up");
        btnSignUp.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(lblConfirmPassword);
        panel.add(txtConfirmPassword);
        panel.add(new JLabel(""));
        panel.add(btnSignUp);

        add(panel);
        setVisible(true);

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:/home/noob/hello");
            System.out.println("Connected to database successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSignUp) {
            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());
            String confirmPassword = new String(txtConfirmPassword.getPassword());
            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match.");
                return;
            }
            try {
                Statement stmt = conn.createStatement();
                String query = "INSERT INTO users (username, password) VALUES ('" + username + "', '" + password + "')";
                int result = stmt.executeUpdate(query);
                if (result == 1) {
                    JOptionPane.showMessageDialog(this, "Sign up successful!");
                } else {
                    JOptionPane.showMessageDialog(this, "Sign up failed.");
                }
            } catch (SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new SignUpGUI();
    }
}