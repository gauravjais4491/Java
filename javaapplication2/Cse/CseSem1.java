package Cse;

import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class CseSem1 extends javax.swing.JFrame{
    public CseSem1() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        btnCHE110 = new JButton();
        btnMEC107 = new JButton();
        btnCSE101 = new JButton();
        btnECE131 = new JButton();
        btnMTH165 = new JButton();
        btnCLICK = new JButton();
        jLabel2 = new JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500, 630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new Font("Tahoma", 2, 36));
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 37, 353, 59);

        btnCHE110.setFont(new Font("Tahoma", 1, 18));
        btnCHE110.setText("CHE110");
        btnCHE110.setPreferredSize(new Dimension(220, 50));
        btnCHE110.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCHE110ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCHE110);
        btnCHE110.setBounds(150, 160, 224, 50);

        btnMEC107.setFont(new Font("Tahoma", 1, 18));
        btnMEC107.setText("MEC107");
        btnMEC107.setPreferredSize(new Dimension(220, 50));
        btnMEC107.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMEC107ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMEC107);
        btnMEC107.setBounds(150, 220, 224, 50);

        btnCSE101.setFont(new Font("Tahoma", 1, 18));
        btnCSE101.setText("CSE101");
        btnCSE101.setPreferredSize(new Dimension(220, 50));
        btnCSE101.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE101ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE101);
        btnCSE101.setBounds(150, 290, 224, 50);

        btnECE131.setFont(new Font("Tahoma", 1, 18));
        btnECE131.setText("ECE131");
        btnECE131.setPreferredSize(new Dimension(220, 50));
        btnECE131.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnECE131ActionPerformed(evt);
            }
        });
        getContentPane().add(btnECE131);
        btnECE131.setBounds(150, 360, 224, 50);

        btnMTH165.setFont(new Font("Tahoma", 1, 18));
        btnMTH165.setText("MTH165");
        btnMTH165.setPreferredSize(new Dimension(220, 50));
        btnMTH165.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMTH165ActionPerformed(evt);
            }
        });

        btnCLICK.setFont(new Font("Tahoma", 1, 18));
        btnCLICK.setForeground(new Color(0, 0, 153));
        btnCLICK.setText("Click here for class PPTs and PDFs.");
        btnCLICK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCLICKActionPerformed(evt);
            }
        });
        getContentPane().add(btnCLICK);
        btnCLICK.setBounds(0, 522, 490, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/noob/New Volume 1/Programs/Java/javaapplication2/AppBGW.jpg")));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-12, -5, 590, 710);

    }

    private void btnCHE110ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE110.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCHE110, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCHE110, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnMEC107ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/MEC107.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnMEC107, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnMEC107, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCSE101ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE101.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE101, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE101, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnECE131ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/ECE131.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnECE131, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnECE131, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnMTH165ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/MTH165.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnMTH165, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnMTH165, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCLICKActionPerformed(ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(CseSem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CseSem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CseSem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CseSem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CseSem1().setVisible(true);
            }
        });
    }

    private JButton btnCHE110;
    private JButton btnCLICK;
    private JButton btnCSE101;
    private JButton btnECE131;
    private JButton btnMEC107;
    private JButton btnMTH165;
    private JLabel jLabel1;
    private JLabel jLabel2;
}
