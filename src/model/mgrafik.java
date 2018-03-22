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
public class mgrafik extends koneksi {

    public mgrafik() throws SQLException {
        super();
    }


    public String[] gettopmakanan(String tglawal,String tglakhir) {
        String id[] = {"kosong", "kosong", "kosong"};
        try {
            String query = "SELECT m.nama_menu as top from pesanan p join menu m ON (p.id_menu=m.id_menu) where p.tgl_pesanan BETWEEN '" + tglawal + "' AND '" + tglakhir + "' GROUP by m.nama_menu ORDER BY COUNT(p.id_menu) desc limit 3";
            System.out.println("query makanan"+query);
            id = getdatatoarray(query, id);
        } catch (SQLException ex) {
            Logger.getLogger(mgrafik.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    
    public double[] getchart(String tahun) {
        String id[] = new String[12];
        double get[] = {0,0,0,0,0,0,0,0,0,0,0,0};
        try {
            String query = "select sum(harga_bayar) as jumlah from pesanan where YEAR(tgl_pesanan) = "+tahun+" group by MONTH (tgl_pesanan)";
            System.out.println("query get"+query);
            id = getdatatoarray(query, id);
            for (int i = 0; i < id.length; i++) {
                get[i]=Double.parseDouble(id[i]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(mgrafik.class.getName()).log(Level.SEVERE, null, ex);
        }
        return get;
    }
}
