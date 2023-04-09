package Cse;

import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class CseSem4 extends javax.swing.JFrame {


    public CseSem4() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        btnINT404 = new JButton();
        btnCSE306 = new JButton();
        btnCSE316 = new JButton();
        btnCSE310 = new JButton();
        btnCSE408 = new JButton();
        jButton1 = new JButton();
        jLabel2 = new JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new Font("Tahoma", 2, 36));
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 61, 480, 58);

        btnINT404.setFont(new Font("Tahoma", 1, 18));
        btnINT404.setText("INT404");
        btnINT404.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnINT404ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT404);
        btnINT404.setBounds(165, 173, 170, 31);

        btnCSE306.setFont(new Font("Tahoma", 1, 18));
        btnCSE306.setText("CSE306");
        btnCSE306.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE306ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE306);
        btnCSE306.setBounds(165, 222, 170, 31);

        btnCSE316.setFont(new Font("Tahoma", 1, 18));
        btnCSE316.setText("CSE316");
        btnCSE316.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE316ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE316);
        btnCSE316.setBounds(165, 271, 170, 31);

        btnCSE310.setFont(new Font("Tahoma", 1, 18));
        btnCSE310.setText("CSE310");
        btnCSE310.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE310ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE310);
        btnCSE310.setBounds(165, 320, 170, 31);

        btnCSE408.setFont(new Font("Tahoma", 1, 18));
        btnCSE408.setText("CSE408");
        btnCSE408.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE408ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE408);
        btnCSE408.setBounds(165, 369, 170, 31);

        jButton1.setFont(new Font("Tahoma", 1, 18));
        jButton1.setForeground(new Color(0, 0, 153));
        jButton1.setText("Click here for class PPts and PDFs.");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 500, 480, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/noob/New Volume 1/Programs/Java/javaapplication2/AppBGW.jpg")));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-9, -7, 520, 650);


    }

    private void btnINT404ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/INT404.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnINT404, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnINT404, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCSE306ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE306.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE306, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE306, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCSE316ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE316.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE316, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE316, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCSE310ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE310.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE310, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE310, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCSE408ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE408.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE408, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE408, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CseSem4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CseSem4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CseSem4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CseSem4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CseSem4().setVisible(true);
            }
        });
    }

    private JButton btnCSE310;
    private JButton btnCSE316;
    private JButton btnCSE306;
    private JButton btnCSE408;
    private JButton btnINT404;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
}
