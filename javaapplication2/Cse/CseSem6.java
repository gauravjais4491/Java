package Cse;

import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CseSem6 extends javax.swing.JFrame {

    public CseSem6() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        btnCSE308 = new JButton();
        btnCSE423 = new JButton();
        btnCSE427 = new JButton();
        btnGEN331 = new JButton();
        btnINT247 = new JButton();
        btnINT417 = new JButton();
        btnPEA306 = new JButton();
        btnPES319 = new JButton();
        jButton1 = new JButton();
        jLabel2 = new JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500, 630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new Font("Tahoma", 2, 36));
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 42, 480, 62);

        btnCSE308.setFont(new Font("Tahoma", 1, 18));
        btnCSE308.setText("CSE308");
        btnCSE308.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE308ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE308);
        btnCSE308.setBounds(147, 114, 166, 31);

        btnCSE423.setFont(new Font("Tahoma", 1, 18));
        btnCSE423.setText("CSE423");
        btnCSE423.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE423ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE423);
        btnCSE423.setBounds(147, 151, 166, 31);

        btnCSE427.setFont(new Font("Tahoma", 1, 18));
        btnCSE427.setText("CSE427");
        btnCSE427.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE427ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE427);
        btnCSE427.setBounds(147, 192, 166, 31);

        btnGEN331.setFont(new Font("Tahoma", 1, 18));
        btnGEN331.setText("GEN331");
        btnGEN331.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnGEN331ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGEN331);
        btnGEN331.setBounds(147, 233, 166, 31);

        btnINT247.setFont(new Font("Tahoma", 1, 18));
        btnINT247.setText("INT247");
        btnINT247.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnINT247ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT247);
        btnINT247.setBounds(147, 278, 166, 31);

        btnINT417.setFont(new Font("Tahoma", 1, 18));
        btnINT417.setText("INT417");
        btnINT417.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnINT417ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT417);
        btnINT417.setBounds(147, 319, 166, 31);

        btnPEA306.setFont(new Font("Tahoma", 1, 18));
        btnPEA306.setText("PEA306");
        btnPEA306.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPEA306ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPEA306);
        btnPEA306.setBounds(147, 360, 166, 31);

        btnPES319.setFont(new Font("Tahoma", 1, 18));
        btnPES319.setText("PES319");
        btnPES319.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPES319ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPES319);
        btnPES319.setBounds(147, 401, 166, 31);

        jButton1.setFont(new Font("Tahoma", 1, 18));
        jButton1.setForeground(new Color(0, 0, 153));
        jButton1.setText("Click here for class PPTs and PDFs.");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 527, 480, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/noob/New Volume 1/Programs/Java/javaapplication2/AppBGW.jpg")));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-8, -2, 520, 640);
    }

    private void btnCSE308ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE308.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE308, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE308, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCSE423ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE423.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE423, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE423, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCSE427ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE427.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE427, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE427, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnGEN331ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/GEN331.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnGEN331, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnGEN331, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnINT247ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/INT247.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnINT247, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnINT247, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnINT417ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/INT417.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnINT417, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnINT417, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnPEA306ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/PEA306.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnPEA306, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnPEA306, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnPES319ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/PES319.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnPES319, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnPES319, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {

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
            java.util.logging.Logger.getLogger(CseSem6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CseSem6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CseSem6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CseSem6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CseSem6().setVisible(true);
            }
        });
    }

    private JButton btnCSE308;
    private JButton btnCSE423;
    private JButton btnCSE427;
    private JButton btnGEN331;
    private JButton btnINT247;
    private JButton btnINT417;
    private JButton btnPEA306;
    private JButton btnPES319;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
}
