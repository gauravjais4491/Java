package Cse;

import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class CseSem3 extends javax.swing.JFrame {

    public CseSem3() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        btnCSE205 = new JButton();
        btnCSE211 = new JButton();
        btnCSE320 = new JButton();
        btnINT306 = new JButton();
        btnINT213 = new JButton();
        btnMTH401 = new JButton();
        btnPEL131 = new JButton();
        jButton1 = new JButton();
        jLabel2 = new JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500, 630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new Font("Tahoma", 2, 36));
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 57, 480, 44);

        btnCSE205.setFont(new Font("Tahoma", 1, 18));
        btnCSE205.setText("CSE205");
        btnCSE205.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE205ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE205);
        btnCSE205.setBounds(148, 142, 194, 31);

        btnCSE211.setFont(new Font("Tahoma", 1, 18));
        btnCSE211.setText("CSE211");
        btnCSE211.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE211ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE211);
        btnCSE211.setBounds(148, 191, 194, 31);

        btnCSE320.setFont(new Font("Tahoma", 1, 18));
        btnCSE320.setText("CSE320");
        btnCSE320.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE320ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE320);
        btnCSE320.setBounds(148, 240, 194, 31);

        btnINT306.setFont(new Font("Tahoma", 1, 18));
        btnINT306.setText("INT306");
        btnINT306.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnINT306ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT306);
        btnINT306.setBounds(148, 289, 194, 31);

        btnINT213.setFont(new Font("Tahoma", 1, 18));
        btnINT213.setText("INT213");
        btnINT213.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnINT213ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT213);
        btnINT213.setBounds(148, 338, 194, 31);

        btnMTH401.setFont(new Font("Tahoma", 1, 18));
        btnMTH401.setText("MTH401");
        btnMTH401.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMTH401ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMTH401);
        btnMTH401.setBounds(148, 387, 194, 31);

        btnPEL131.setFont(new Font("Tahoma", 1, 18));
        btnPEL131.setText("PEL131");
        btnPEL131.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPEL131ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPEL131);
        btnPEL131.setBounds(148, 436, 194, 31);

        jButton1.setFont(new Font("Tahoma", 1, 18));
        jButton1.setForeground(new Color(0, 0, 153));
        jButton1.setText("Click here for classPPts and PDFs.");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 538, 480, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/noob/New Volume 1/Programs/Java/javaapplication2/AppBGW.jpg")));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-9, -7, 560, 670);

    }

    private void btnCSE205ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE205.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE205, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE205, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCSE211ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE211.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE211, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE211, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCSE320ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE320.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE320, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE320, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnINT306ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/INT306.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnINT306, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnINT306, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnINT213ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/INT213.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnINT213, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnINT213, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnMTH401ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/MTH401.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnMTH401, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnMTH401, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnPEL131ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/PEL131.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnPEL131, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnPEL131, this, "File not Exists", 0);
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
            java.util.logging.Logger.getLogger(CseSem3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CseSem3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CseSem3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CseSem3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CseSem3().setVisible(true);
            }
        });
    }

    private JButton btnCSE205;
    private JButton btnCSE211;
    private JButton btnCSE320;
    private JButton btnINT213;
    private JButton btnINT306;
    private JButton btnMTH401;
    private JButton btnPEL131;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;

}
