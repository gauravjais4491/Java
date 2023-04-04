import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Listener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == FourtyFour.clear) {
            FourtyFour.user.setText(null);
            FourtyFour.pass.setText(null);
            FourtyFour.pass2.setText(null);
        } else if (e.getActionCommand().equals("Submit")) {
            String uname = FourtyFour.user.getText();
            String pwd1 = FourtyFour.pass.getText();
            String pwd2 = FourtyFour.pass2.getText();
            if (!pwd1.equals(pwd2)) {
                FourtyFour.pass.setText(null);
                FourtyFour.pass2.setText(null);
                JOptionPane.showMessageDialog(FourtyFour.f, "Both the Passwords must be Same");
            } else {
                // To update the password
                try {
                    PreparedStatement pst = FourtyFour.con
                            .prepareStatement("select * from credentials where username = ?");
                    pst.setString(1, uname);
                    ResultSet rs = pst.executeQuery();
                    rs.next();
                    String user = rs.getString(1);
                    if (user.equals(uname)) {
                        pst = FourtyFour.con.prepareStatement("update credentials set password = ? where username = ?");
                        pst.setString(1, pwd1);
                        pst.setString(2, uname);
                        pst.executeUpdate();
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}

// PasswordReset
public class FourtyFour {
    static Connection con;
    static JFrame f = new JFrame("Password Reset");
    static JTextField user, pass, pass2;
    static JButton submit, clear;

    FourtyFour() {
        user = new JTextField("User Name", 20);
        pass = new JTextField("New Password", 20);
        pass2 = new JTextField("New Password", 20);
        submit = new JButton("Submit");
        clear = new JButton("Clear");
        f.setLayout(null);
        user.setBounds(200, 150, 400, 50);
        pass.setBounds(200, 220, 400, 50);
        pass2.setBounds(200, 290, 400, 50);
        submit.setBounds(250, 360, 100, 50);
        clear.setBounds(450, 360, 100, 50);
        f.add(user);
        f.add(pass);
        f.add(pass2);
        f.add(submit);
        f.add(clear);

        Listener l = new Listener();
        submit.addActionListener(l);
        clear.addActionListener(l);
        f.setSize(800, 800);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] shruti) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KE051", "root", "Shruti@24906");
        } catch (Exception e) {
        }
        new FourtyFour();
    }
}