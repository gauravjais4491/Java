package Cse;

import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CseSem7 extends javax.swing.JFrame {

    public CseSem7() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnINT248 = new JButton();
        btnINT405 = new JButton();
        btnINT407 = new JButton();
        btnGEN332 = new JButton();
        jButton5 = new JButton();
        jLabel2 = new JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500, 630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36));
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 46, 480, 45);

        btnINT248.setBackground(new Color(255, 255, 255));
        btnINT248.setFont(new Font("Tahoma", 1, 18));
        btnINT248.setText("INT248");
        btnINT248.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnINT248ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT248);
        btnINT248.setBounds(167, 133, 157, 31);

        btnINT405.setFont(new Font("Tahoma", 1, 18));
        btnINT405.setText("INT405");
        btnINT405.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnINT405ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT405);
        btnINT405.setBounds(167, 228, 157, 31);

        btnINT407.setFont(new Font("Tahoma", 1, 18));
        btnINT407.setText("INT407");
        btnINT407.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnINT407ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT407);
        btnINT407.setBounds(167, 326, 157, 31);

        btnGEN332.setFont(new Font("Tahoma", 1, 18));
        btnGEN332.setText("GEN332");
        btnGEN332.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnGEN332ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGEN332);
        btnGEN332.setBounds(167, 416, 157, 31);

        jButton5.setFont(new Font("Tahoma", 1, 18));
        jButton5.setForeground(new java.awt.Color(0, 51, 153));
        jButton5.setText("Click here for class PPTs and PDFs.");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 559, 480, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/noob/New Volume 1/Programs/Java/javaapplication2/AppBGW.jpg")));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -20, 520, 670);

    }

    private void btnINT248ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/INT248.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnINT248, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnINT248, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnINT405ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/INT405.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnINT405, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnINT405, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnINT407ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/INT407.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnINT407, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnINT407, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnGEN332ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/GEN332.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnGEN332, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnGEN332, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(CseSem7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CseSem7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CseSem7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CseSem7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CseSem7().setVisible(true);
            }
        });
    }

    private JButton btnGEN332;
    private JButton btnINT248;
    private JButton btnINT405;
    private JButton btnINT407;
    private JButton jButton5;
    private JLabel jLabel1;
    private JLabel jLabel2;

}
