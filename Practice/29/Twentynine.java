import javax.swing.*;
// import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

// import java.awt.BorderLayout;

public class Twentynine {
    public static void main(String[] args) {
        JFrame jf = new JFrame("My GUI");
        jf.setSize(800, 550);
        jf.setResizable(false);
        jf.getContentPane().setBackground(Color.green);

        JButton b1 = new JButton("Buttom");
        jf.add(b1, BorderLayout.EAST);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    File file = new File("/home/noob/Downloads/GAURAV_GEN333_CA2.pdf");
                    if(file.exists())
                    {
                        if(Desktop.isDesktopSupported())
                        {
                            Desktop.getDesktop().open(file);
                        }
                        else{
                            JOptionPane.showMessageDialog(b1, this,"Not Supported", 0);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(b1, this,"File not Exists", 0);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });

        JToggleButton tb = new JToggleButton("ON/OFF");
        jf.add(tb);

        ButtonGroup bg = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        bg.add(rb1);
        bg.add(rb2);

        JPanel jp = new JPanel();
        jp.add(rb1);
        jp.add(rb2);

        JCheckBox cb1 = new JCheckBox("Python");
        JCheckBox cb2 = new JCheckBox("Java");
        JCheckBox cb3 = new JCheckBox("Android");

        JPanel jp2 = new JPanel();
        jp2.add(cb1);
        jp2.add(cb2);
        jp2.add(cb3);
        // bg.add(cb1); //remove check box from buttom group
        // bg.add(cb2);
        // bg.add(cb3);

        jf.add(jp2, BorderLayout.NORTH);
        jf.add(jp, BorderLayout.SOUTH);
        // bg.add(tb);
        // bg.add(tb2);

        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// enable close
                                                          // buttom with
                                                          // frame after
                                                          // clicking to
                                                          // tyhis
                                                          // program will
                                                          // terminate
    }
}
