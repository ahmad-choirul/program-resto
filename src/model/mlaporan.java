/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class mlaporan extends koneksi {

    public mlaporan() throws SQLException {
        super();
    }

    public DefaultTableModel getlaporan(String tglawal, String tglakhir) throws SQLException {
        String kolom[] = {"id_pesanan", "tgl pesanan", "nama menu", "nama minuman", "toping", "level", "harga bayar"};
        String query = "select p.id_pesanan,P.tgl_pesanan,m.nama_menu, mn.nama_minuman, GROUP_CONCAT(nama_toping SEPARATOR ',') as toping,p.level,concat('Rp ', format( p.harga_bayar, 0)) as harga_bayar from pesan_toping pt JOIN toping t ON(pt.id_toping=t.id_toping) RIGHT join pesanan p ON(p.id_pesan_toping=pt.id_pesan_toping) LEFT JOIN menu m on (m.id_menu=p.id_menu) LEFT JOIN minuman mn ON(p.id_minuman=mn.id_minuman) where p.tgl_pesanan "
                + "BETWEEN '" + tglawal + "' AND '" + tglakhir + "' GROUP BY p.id_pesanan,P.tgl_pesanan,p.harga_bayar,m.nama_menu, mn.nama_minuman";
        return getDatatotal(query, kolom);
    }

    public String getidpesanan() {
        String id = null;
        try {
            String query = "SELECT MAX(`id_pesanan`)+1 as id_pesanan FROM `pesanan`";
            id = getdataidNoaray(query);
        } catch (SQLException ex) {
            Logger.getLogger(mlaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public String[] gettopmakanan(String tglawal,String tglakhir) {
        String id[] = {"kosong", "kosong", "kosong"};
        try {
            String query = "SELECT m.nama_menu as top from pesanan p join menu m ON (p.id_menu=m.id_menu) where p.tgl_pesanan BETWEEN '" + tglawal + "' AND '" + tglakhir + "' GROUP by m.nama_menu ORDER BY COUNT(p.id_menu) desc limit 3";
            System.out.println("query makanan"+query);
            id = getdatatoarray(query, id);
        } catch (SQLException ex) {
            Logger.getLogger(mlaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public String[] gettoptoping(String tglawal,String tglakhir) {
        String id[] = {"kosong", "kosong", "kosong"};
        try {
            String query = "SELECT t.nama_toping as top FROM pesanan p JOIN pesan_toping pt ON(p.id_pesan_toping=pt.id_pesan_toping) "
                    + "JOIN toping t ON (pt.id_toping=t.id_toping) where p.tgl_pesanan BETWEEN '" + tglawal + "' AND '" + tglakhir + "' GROUP by t.nama_toping order by COUNT(pt.id_pesan_toping) desc LIMIT 3";
            System.out.println("query toping"+query);
            id = getdatatoarray(query, id);
        } catch (SQLException ex) {
            Logger.getLogger(mlaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public String[] gettopminum(String tglawal,String tglakhir) {
        String id[] = {"kosong", "kosong", "kosong"};
        try {
            String query = "select mn.nama_minuman as top from pesanan p join minuman mn ON(p.id_minuman=mn.id_minuman) where p.tgl_pesanan BETWEEN '" + tglawal + "' AND '" + tglakhir + "' GROUP by mn.nama_minuman ORDER by COUNT(p.id_minuman) desc LIMIT 3";
            System.out.println("query minum"+query);
            id = getdatatoarray(query, id);
        } catch (SQLException ex) {
            Logger.getLogger(mlaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
