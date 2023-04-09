package Cse;

import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CseSem5 extends javax.swing.JFrame {

    public CseSem5() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        btnPEV108 = new JButton();
        btnINT246 = new JButton();
        btnCSE322 = new JButton();
        btnPEA305 = new JButton();
        jButton1 = new JButton();
        jLabel2 = new JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500, 630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new Font("Tahoma", 2, 36));
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 62, 480, 49);

        btnPEV108.setFont(new Font("Tahoma", 1, 18));
        btnPEV108.setText("PEV108");
        btnPEV108.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPEV108ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPEV108);
        btnPEV108.setBounds(185, 179, 159, 31);

        btnINT246.setFont(new Font("Tahoma", 1, 18));
        btnINT246.setText("INT246");
        btnINT246.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnINT246ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT246);
        btnINT246.setBounds(185, 256, 159, 31);

        btnCSE322.setFont(new Font("Tahoma", 1, 18));
        btnCSE322.setText("CSE322");
        btnCSE322.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE322ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE322);
        btnCSE322.setBounds(185, 336, 159, 31);

        btnPEA305.setFont(new Font("Tahoma", 1, 18));
        btnPEA305.setText("PEA305");
        btnPEA305.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPEA305ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPEA305);
        btnPEA305.setBounds(185, 413, 159, 31);

        jButton1.setFont(new Font("Tahoma", 1, 18));
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Click here for PPTs and PDFs");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 533, 480, 41);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/noob/New Volume 1/Programs/Java/javaapplication2/AppBGW.jpg")));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-49, -7, 580, 720);

    }

    private void btnPEV108ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/PEV108.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnPEV108, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnPEV108, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnINT246ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/INT246.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnINT246, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnINT246, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCSE322ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE322.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE322, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE322, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnPEA305ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/PEA305.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnPEA305, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnPEA305, this, "File not Exists", 0);
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
            java.util.logging.Logger.getLogger(CseSem5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CseSem5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CseSem5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CseSem5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CseSem5().setVisible(true);
            }
        });
    }

    private JButton btnCSE322;
    private JButton btnINT246;
    private JButton btnPEA305;
    private JButton btnPEV108;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
}
