/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.mmenu;

/**
 *
 * @author acer
 */
public class menu extends javax.swing.JFrame {

    mmenu menu;
    String status=null;
    String id ;
       String nama;
       String hargareguler;
       String hargagojek;
    public menu() throws SQLException {
        this.menu = new mmenu();
        initComponents();
        
    }

/**
     * Creates new form menu
     */
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        txthargagojek = new javax.swing.JTextField();
        txthargareguler = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btntoping = new javax.swing.JButton();
        btnminuman = new javax.swing.JButton();
        btnmakanan = new javax.swing.JButton();
        btnoke = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btneditharga = new javax.swing.JButton();
        btnmanajemenkasir = new javax.swing.JButton();
        btngrafik = new javax.swing.JButton();
        btnlaporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 490, 580));
        getContentPane().add(txthargagojek, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 240, 50));
        getContentPane().add(txthargareguler, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 240, 50));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 240, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("harga gojek");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 210, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("nama menu");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 210, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("harga reguler");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 210, 40));

        btntoping.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnminuman.png"))); // NOI18N
        btntoping.setBorderPainted(false);
        btntoping.setContentAreaFilled(false);
        btntoping.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntoping.setFocusPainted(false);
        btntoping.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minuman2.png"))); // NOI18N
        btntoping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntopingActionPerformed(evt);
            }
        });
        getContentPane().add(btntoping, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 150, 60));

        btnminuman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/toping.png"))); // NOI18N
        btnminuman.setBorderPainted(false);
        btnminuman.setContentAreaFilled(false);
        btnminuman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnminuman.setFocusPainted(false);
        btnminuman.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/toping2.png"))); // NOI18N
        btnminuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminumanActionPerformed(evt);
            }
        });
        getContentPane().add(btnminuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 150, 60));

        btnmakanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/makanan.png"))); // NOI18N
        btnmakanan.setBorderPainted(false);
        btnmakanan.setContentAreaFilled(false);
        btnmakanan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmakanan.setFocusPainted(false);
        btnmakanan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/makanan2.png"))); // NOI18N
        btnmakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmakananActionPerformed(evt);
            }
        });
        getContentPane().add(btnmakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 150, 60));

        btnoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/OK.png"))); // NOI18N
        btnoke.setBorderPainted(false);
        btnoke.setContentAreaFilled(false);
        btnoke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnoke.setEnabled(false);
        btnoke.setFocusPainted(false);
        btnoke.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/OK2.png"))); // NOI18N
        btnoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokeActionPerformed(evt);
            }
        });
        getContentPane().add(btnoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 170, 60));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit harga.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmakananActionPerformed
        try {
            status="makanan";
            btnmakanan.setEnabled(false);
            btnminuman.setEnabled(true);
            btntoping.setEnabled(true);
            btnoke.setEnabled(false);
            txthargagojek.setText("");
            txthargareguler.setText("");
            txtnama.setText("");
            tabel.setModel(menu.getmenu());
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmakananActionPerformed

    private void btntopingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntopingActionPerformed
        try {
            status="toping";
            btntoping.setEnabled(false);
            btnmakanan.setEnabled(true);
            btnminuman.setEnabled(true);
            btnoke.setEnabled(false);
            txthargagojek.setText("");
            txthargareguler.setText("");
            txtnama.setText("");
            tabel.setModel(menu.gettoping());
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btntopingActionPerformed

    private void btnminumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminumanActionPerformed
        try {
            status="minuman";
            btnminuman.setEnabled(false);
            btntoping.setEnabled(true);
            btnmakanan.setEnabled(true);
            btnoke.setEnabled(false);
            txthargagojek.setText("");
            txthargareguler.setText("");
            txtnama.setText("");
            tabel.setModel(menu.getminuman());
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnminumanActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        id = tabel.getValueAt(tabel.getSelectedRow(), 0).toString();
        nama = tabel.getValueAt(tabel.getSelectedRow(), 1).toString();
        hargareguler = tabel.getValueAt(tabel.getSelectedRow(), 2).toString();
        hargagojek = tabel.getValueAt(tabel.getSelectedRow(), 3).toString();
       txthargagojek.setText(hargagojek);
       txthargareguler.setText(hargareguler);
       txtnama.setText(nama);
       btnoke.setEnabled(true);
    }//GEN-LAST:event_tabelMouseClicked

    private void btnokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokeActionPerformed
        if (status.equalsIgnoreCase("makanan")) {
            if (menu.updatemenu(txtnama.getText(), txthargareguler.getText(), txthargagojek.getText(), id)) {
                message("sukses update makanan");
            }else{
                message("gagal update makanan");
            }
            try {
                tabel.setModel(menu.getmenu());
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (status.equalsIgnoreCase("minuman")) {
            if (menu.updateminuman(txtnama.getText(), txthargareguler.getText(), txthargagojek.getText(), id)) {
                message("sukses update minuman");
            }else{
                message("gagal update makanan");
            }
            try {
                tabel.setModel(menu.getminuman());
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (status.equalsIgnoreCase("toping")) {
            if (menu.updatetoping(txtnama.getText(), txthargareguler.getText(), txthargagojek.getText(), id)) {
                message("sukses update toping");
            }else{
                message("gagal update makanan");
            }
            try {
                tabel.setModel(menu.gettoping());
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        txthargagojek.setText("");
       txthargareguler.setText("");
       txtnama.setText("");
        btnoke.setEnabled(false);
    }//GEN-LAST:event_btnokeActionPerformed

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
public void message(String txt) {
        JOptionPane.showMessageDialog(null, txt, "error", JOptionPane.OK_OPTION);
    }

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new menu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditharga;
    private javax.swing.JButton btngrafik;
    private javax.swing.JButton btnlaporan;
    private javax.swing.JButton btnmakanan;
    private javax.swing.JButton btnmanajemenkasir;
    private javax.swing.JButton btnminuman;
    private javax.swing.JButton btnoke;
    private javax.swing.JButton btntoping;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txthargagojek;
    private javax.swing.JTextField txthargareguler;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
