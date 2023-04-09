package Cse;

import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CseSem2 extends javax.swing.JFrame{
    public CseSem2() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        btnCSE202 = new JButton();
        btnCSE326 = new JButton();
        btnECE216 = new JButton();
        btnECE213 = new JButton();
        btnMEC103 = new JButton();
        btnMTH166 = new JButton();
        btnPEL121 = new JButton();
        btnPHY109 = new JButton();
        btnPHY119 = new JButton();
        btnCLICK  = new JButton();
        jLabel2   = new JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36));
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 37, 464, 73);

        btnCSE202.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnCSE202.setText("CSE202");
        btnCSE202.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE202ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE202);
        btnCSE202.setBounds(188, 128, 171, 31);

        btnCSE326.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnCSE326.setText("CSE326");
        btnCSE326.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCSE326ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE326);
        btnCSE326.setBounds(187, 169, 172, 31);

        btnECE216.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnECE216.setText("ECE216");
        btnECE216.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnECE216ActionPerformed(evt);
            }
        });
        getContentPane().add(btnECE216);
        btnECE216.setBounds(186, 210, 173, 31);

        btnECE213.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnECE213.setText("ECE213");
        btnECE213.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnECE213ActionPerformed(evt);
            }
        });
        getContentPane().add(btnECE213);
        btnECE213.setBounds(186, 251, 173, 31);

        btnMEC103.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnMEC103.setText("MEC103");
        btnMEC103.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMEC103ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMEC103);
        btnMEC103.setBounds(186, 292, 173, 31);

        btnMTH166.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnMTH166.setText("MTH166");
        btnMTH166.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMTH166ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMTH166);
        btnMTH166.setBounds(186, 333, 173, 31);

        btnPEL121.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnPEL121.setText("PEL121");
        btnPEL121.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPEL121ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPEL121);
        btnPEL121.setBounds(186, 374, 173, 31);

        btnPHY109.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        btnPHY109.setText("PHY109");
        btnPHY109.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPHY109ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPHY109);
        btnPHY109.setBounds(186, 415, 175, 31);

        btnPHY119.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnPHY119.setText("PHY119");
        btnPHY119.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPHY119ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPHY119);
        btnPHY119.setBounds(186, 456, 175, 31);

        btnCLICK.setFont(new Font("Tahoma", 1, 18));
        btnCLICK.setForeground(new Color(0, 0, 153));
        btnCLICK.setText("Click here for class PPts and PDFs");
        btnCLICK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCLICKActionPerformed(evt);
            }
        });
        getContentPane().add(btnCLICK);
        btnCLICK.setBounds(10, 531, 480, 35);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/noob/New Volume 1/Programs/Java/javaapplication2/AppBGW.jpg"))); 
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-17, -11, 560, 710);


    }

    private void btnCLICKActionPerformed(ActionEvent evt) {
    }

    private void btnPHY119ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/PHY119.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnPHY119, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnPHY119, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnPHY109ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/PHY109.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnPHY109, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnPHY109, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnPEL121ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/PEL121.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnPEL121, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnPEL121, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnMTH166ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/MTH166");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnMTH166, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnMTH166, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnMEC103ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/MEC103.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnMEC103, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnMEC103, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnECE213ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/ECE213.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnECE213, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnECE213, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnECE216ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/ECE216.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnECE216, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnECE216, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCSE326ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE326.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE326, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE326, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void btnCSE202ActionPerformed(ActionEvent evt) {
        try {
            File file = new File("/media/noob/New Volume 1/Programs/Java/javaapplication2/PDF/CSE202.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(btnCSE202, this, "Not Supported", 0);
                }
            } else {
                JOptionPane.showMessageDialog(btnCSE202, this, "File not Exists", 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CseSem2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CseSem2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CseSem2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CseSem2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CseSem2().setVisible(true);
            }
        });
    }


    private JButton btnCLICK;
    private JButton btnCSE202;
    private JButton btnCSE326;
    private JButton btnECE213;
    private JButton btnECE216;
    private JButton btnMEC103;
    private JButton btnMTH166;
    private JButton btnPEL121;
    private JButton btnPHY109;
    private JButton btnPHY119;
    private JLabel jLabel1;
    private JLabel jLabel2;

}
