// import javax.swing.*;
// import java.awt.*;

// public class Sixty{
//     Sixty(){
//         JFrame jf=new JFrame("GUI");
//         jf.setSize(400,300);
//         // jf.getContentPane().setBackground(Color.red);
       
//         String [] s={" ","INDIA","RUSSIA","USA","FRANCE","NEPAL","SRI LANKA","DUBAI"};
//         JComboBox c1=new JComboBox(s);
//         // l1.add(c1);
//         jf.add(c1);
//         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         jf.setLayout(new FlowLayout(FlowLayout.RIGHT,20,50));
//         jf.setVisible(true);
//     }

//     public static void main(String[] args) {
//         new Sixty();
//     }
// }

import java.awt.event.*;
import java.text.DateFormat;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.util.Locale;
import java.util.Date;
import java.util.Date;
import java.text.DateFormat;

// labelexg
class Sixty {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 500, 500, 500);
        frame.setTitle("My label Frame");
        frame.setResizable(false);
        Container c = frame.getContentPane();
        c.setLayout(null);

        JLabel label = new JLabel("Country");
        label.setBounds(10, 50, 100, 20);
        c.add(label);
        Font font = new Font("Arial", Font.BOLD, 15);
        label.setFont(font);
        String [] s={" ","INDIA","RUSSIA","USA","FRANCE","NEPAL","SRI LANKA","DUBAI"};
        JComboBox c1=new JComboBox(s);
        c1.setBounds(120, 50, 120, 20);
        c.add(c1);

        JLabel label1 = new JLabel("Language");
        label1.setBounds(10, 100, 100, 20);
        Font font1 = new Font("Arial", Font.BOLD, 15);
        label1.setFont(font1);
        JTextField pass1 = new JTextField();
        pass1.setBounds(120, 100, 120, 20);
        c.add(pass1);
        c.add(label1);

        JLabel label2 = new JLabel("Hash Code");
        label2.setBounds(10, 150, 100, 20);
        Font font2 = new Font("Arial", Font.BOLD, 15);
        label1.setFont(font2);
        JTextField pass2 = new JTextField();
        pass2.setBounds(120, 150, 120, 20);
        c.add(pass2);
        c.add(label2);

        JLabel label3 = new JLabel("Date");
        label3.setBounds(10, 200, 100, 20);
        Font font3 = new Font("Arial", Font.BOLD, 15);
        label1.setFont(font3);
        JTextField pass3 = new JTextField();
        pass3.setBounds(120, 200, 120, 20);
        c.add(pass3);
        c.add(label3);

        JLabel label4 = new JLabel("Time");
        label4.setBounds(10, 250, 100, 20);
        Font font4 = new Font("Arial", Font.BOLD, 15);
        label1.setFont(font4);
        JTextField pass4 = new JTextField();
        pass4.setBounds(120, 250, 120, 20);
        c.add(pass4);
        c.add(label4);

        JButton btn = new JButton("Show");
        btn.setBounds(100, 300, 70, 20);
        c.add(btn);

        // Locale l=new Locale(String c);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // System.out.println("Username:- " + user.getText());
                // System.out.println("Password:- " + pass.getText());
                String a=String.valueOf(c1.getSelectedItem());
                Locale l=new Locale(a);
                pass1.setText(l.getLanguage());
                long h=l.hashCode();
                pass2.setText(Long.toString(h));
                DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, l);
                Date d1=new Date();
                pass3.setText(df.format(d1));
                // long tf = currentDate.getTime();
                // pass4.setText(tf.format(d1));
            }
        });
        frame.setVisible(true);
    }
}
