/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class grafik extends javax.swing.JFrame {

    /**
     * Creates new form grafik
     */
    public grafik() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btneditharga = new javax.swing.JButton();
        btnmanajemenkasir = new javax.swing.JButton();
        btngrafik = new javax.swing.JButton();
        btnlaporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout admin.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout admin2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 20, 130, 60));

        btneditharga.setBorderPainted(false);
        btneditharga.setContentAreaFilled(false);
        btneditharga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneditharga.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnharga.png"))); // NOI18N
        btneditharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedithargaActionPerformed(evt);
            }
        });
        getContentPane().add(btneditharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 170, 60));

        btnmanajemenkasir.setBorderPainted(false);
        btnmanajemenkasir.setContentAreaFilled(false);
        btnmanajemenkasir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmanajemenkasir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnkasir.png"))); // NOI18N
        btnmanajemenkasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanajemenkasirActionPerformed(evt);
            }
        });
        getContentPane().add(btnmanajemenkasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 280, 60));

        btngrafik.setBorderPainted(false);
        btngrafik.setContentAreaFilled(false);
        btngrafik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngrafik.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btngrafik.png"))); // NOI18N
        btngrafik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrafikActionPerformed(evt);
            }
        });
        getContentPane().add(btngrafik, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 110, 60));

        btnlaporan.setBorderPainted(false);
        btnlaporan.setContentAreaFilled(false);
        btnlaporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlaporan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnlaporan.png"))); // NOI18N
        btnlaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaporanActionPerformed(evt);
            }
        });
        getContentPane().add(btnlaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 160, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/grafik.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            login a = new login();
            a.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(grafik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnedithargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedithargaActionPerformed
        try {
            menu a = new menu();
            a.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnedithargaActionPerformed

    private void btnmanajemenkasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanajemenkasirActionPerformed
        try {
            manajemenkasir a = new manajemenkasir();
            a.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmanajemenkasirActionPerformed

    private void btngrafikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrafikActionPerformed
        grafik a= new grafik();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btngrafikActionPerformed

    private void btnlaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaporanActionPerformed
        laporan a = new laporan();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlaporanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(grafik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grafik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grafik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grafik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grafik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditharga;
    private javax.swing.JButton btngrafik;
    private javax.swing.JButton btnlaporan;
    private javax.swing.JButton btnmanajemenkasir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
