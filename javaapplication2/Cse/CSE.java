package Cse;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CSE extends javax.swing.JFrame{

    public CSE() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        btnSem1 = new JButton();
        btnSem2 = new JButton();
        btnSem3 = new JButton();
        btnSem4 = new JButton();
        btnSem5 = new JButton();
        btnSem6 = new JButton();
        btnSem7 = new JButton();
        btnSem8 = new JButton();
        jLabel2 = new JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new Font("Segoe UI", 2, 36));
        jLabel1.setText("Semester");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 53, 280, 58);

        btnSem1.setFont(new Font("Segoe UI", 1, 18));
        btnSem1.setText("Semester1");
        btnSem1.setPreferredSize(new Dimension(270, 40));
        btnSem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSem1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSem1);
        btnSem1.setBounds(129, 141, 269, 38);

        btnSem2.setFont(new Font("Segoe UI", 1, 18));
        btnSem2.setText("Semester2");
        btnSem2.setPreferredSize(new Dimension(270, 40));
        btnSem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSem2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSem2);
        btnSem2.setBounds(129, 197, 270, 40);

        btnSem3.setFont(new Font("Segoe UI", 1, 18));
        btnSem3.setText("Semester3");
        btnSem3.setPreferredSize(new Dimension(270, 40));
        btnSem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSem3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSem3);
        btnSem3.setBounds(129, 255, 270, 40);

        btnSem4.setFont(new Font("Segoe UI", 1, 18));
        btnSem4.setText("Semester4");
        btnSem4.setPreferredSize(new Dimension(270, 40));
        btnSem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSem4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSem4);
        btnSem4.setBounds(129, 313, 270, 40);

        btnSem5.setFont(new Font("Segoe UI", 1, 18));
        btnSem5.setText("Semester5");
        btnSem5.setPreferredSize(new Dimension(270, 40));
        btnSem5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSem5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSem5);
        btnSem5.setBounds(129, 371, 270, 40);

        btnSem6.setFont(new Font("Segoe UI", 1, 18));
        btnSem6.setText("Semester6");
        btnSem6.setPreferredSize(new Dimension(270, 40));
        btnSem6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSem6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSem6);
        btnSem6.setBounds(129, 429, 270, 40);

        btnSem7.setFont(new Font("Segoe UI", 1, 18));
        btnSem7.setText("Semester7");
        btnSem7.setPreferredSize(new Dimension(270, 40));
        btnSem7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSem7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSem7);
        btnSem7.setBounds(129, 487, 270, 40);

        btnSem8.setFont(new Font("Segoe UI", 1, 18));
        btnSem8.setText("Semester8");
        btnSem8.setPreferredSize(new Dimension(270, 40));
        btnSem8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSem8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSem8);
        btnSem8.setBounds(129, 545, 270, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/noob/New Volume 1/Programs/Java/javaapplication2/AppBGW.jpg")));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-7, -6, 530, 670);


    }

    private void btnSem1ActionPerformed(ActionEvent evt) {
        new CseSem1().setVisible(true);
    }

    private void btnSem2ActionPerformed(ActionEvent evt) {
        new CseSem2().setVisible(true);
    }

    private void btnSem3ActionPerformed(ActionEvent evt) {
        new CseSem3().setVisible(true);
    }

    private void btnSem4ActionPerformed(ActionEvent evt) {
        new CseSem4().setVisible(true);
    }

    private void btnSem5ActionPerformed(ActionEvent evt) {
        new CseSem4().setVisible(true);
    }

    private void btnSem6ActionPerformed(ActionEvent evt) {
        new CseSem6().setVisible(true);
    }

    private void btnSem7ActionPerformed(ActionEvent evt) {
        new CseSem7().setVisible(true);
    }

    private void btnSem8ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSE().setVisible(true);
            }
        });
    }

    private JButton btnSem1;
    private JButton btnSem2;
    private JButton btnSem3;
    private JButton btnSem4;
    private JButton btnSem5;
    private JButton btnSem6;
    private JButton btnSem7;
    private JButton btnSem8;
    private JLabel jLabel1;
    private JLabel jLabel2;
    public void setVisible(boolean b) {
    }
}
