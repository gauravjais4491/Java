package Project;

import javax.swing.*;
public class NewJFrame extends javax.swing.JFrame {

        public NewJFrame() {
                initComponents();
        }

        private void initComponents() {

                jLabel3 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();

                jLabel3.setText("jLabel3");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(204, 204, 204));
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel1.setText("Choose Your Branch");
                getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 22, 444, 50));

                jButton1.setBackground(new java.awt.Color(204, 255, 255));
                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton1.setText("B.Tech CSE");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 172, 47));

                jButton2.setBackground(new java.awt.Color(204, 255, 255));
                jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton2.setText("B.Tech ME");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 185, 172, 47));

                jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel2.setText("Other Services:");
                getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 268, 487, 51));

                jButton3.setBackground(new java.awt.Color(204, 255, 255));
                jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton3.setText("Placement Services");
                getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 337, 172, 47));

                jButton4.setBackground(new java.awt.Color(204, 255, 255));
                jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton4.setText("Faculty Contacts");
                getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 419, 172, 47));

                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/AppBGW.jpg"))); // NOI18N
                jLabel4.setText("jLabel4");
                getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 490));

                pack();
        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                new CSE1().setVisible(true);
        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        }

        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(NewJFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(NewJFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(NewJFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(NewJFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new NewJFrame().setVisible(true);
                        }
                });
        }

        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
}