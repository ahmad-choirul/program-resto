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
public class mpesanan extends koneksi {

    public mpesanan() throws SQLException {
        super();
    }

    public boolean tambahpesananminum(String data[]) {
        //data[0]=id_pesanan
        //data[1]=id_minumman
        //data[2]=harga_bayar
        String query = "INSERT INTO `pesanan` (`id_daftar_pesanan`, `id_pesanan`, `id_menu`, `id_pesan_toping`, `id_minuman`, `level`, `harga_bayar`) "
                + "VALUES (NULL, '" + data[0] + "', NULL, NULL, '" + data[1] + "', NULL, '" + data[2] + "');;";
        return execute(query);
    }
    public boolean tambahpesananmakan(String data[]) {
        //data[0]=id_pesanan
        //data[1]=id_menu
        //data[2]=id_toping
        //data[3]=level
        //data[4]=harga_bayar
        String query = "INSERT INTO `pesanan` (`id_daftar_pesanan`, `id_pesanan`, `id_menu`, `id_pesan_toping`, `id_minuman`, `level`, `harga_bayar`) "
                + "VALUES (NULL, '" + data[0] + "', '" + data[1] + "','" + data[2] + "', NULL,'" + data[3] + "', '" + data[4] + "');";
        System.out.println("query insert makan "+query);
        return execute(query);
    }
public boolean tambahpesananmakantanpatoping(String data[]) {
        //data[0]=id_pesanan
        //data[1]=id_menu
        //data[2]=id_toping
        //data[3]=level
        //data[4]=harga_bayar
        String query = "INSERT INTO `pesanan` (`id_daftar_pesanan`, `id_pesanan`, `id_menu`, `id_pesan_toping`, `id_minuman`, `level`, `harga_bayar`) "
                + "VALUES (NULL, '" + data[0] + "', '" + data[1] + "',NULL, NULL,'" + data[2] + "', '" + data[3] + "');";
        System.out.println("query insert makan "+query);
        return execute(query);
    }
    public boolean tambahtoping(String id_pesan_toping,String id_toping) {
        //data[0]=id_pesan_toping
        //data[1]=id_topingn
        String query = "INSERT INTO `pesan_toping` (`id_table_toping`, `id_pesan_toping`, `id_toping`) "
                + "VALUES (NULL, '" + id_pesan_toping+ "', '" + id_toping + "');";
        return execute(query);
    }

    public boolean delete(String data) {
        String query = "DELETE FROM `pesanan` WHERE `pesanan`.`id_daftar_pesanan` = " + data;
        return execute(query);
    }
    public boolean deletetoping(String data) {
        String query = "DELETE FROM `pesan_toping` WHERE `pesan_toping`.`id_table_toping` = " + data;
        return execute(query);
    }
    public boolean updateharga(String nama_toping,String id_pesan_toping,String id_pesanan) {
        String query = "UPDATE pesanan set harga_bayar = harga_bayar - (SELECT MAX(harga_toping) from pesan_toping pt JOIN toping t ON(pt.id_toping=t.id_toping)"
                + " where nama_toping='"+nama_toping+"') where id_pesan_toping = '"+id_pesan_toping+"' and id_pesanan = '"+id_pesanan+"'";
        System.out.println("query kurang harga = "+query);
        return execute(query);
    }
    public DefaultTableModel cekpesananmakanan(String data) throws SQLException {
        String kolom[] = {"no", "makanan", "level", "id toping"};
        String query = "SELECT id_daftar_pesanan,m.nama_menu,level,id_pesan_toping FROM `pesanan` p join menu m on (p.id_menu=m.id_menu) where p.id_menu is not null and id_pesanan = " + data;
        return getDatatotal(query, kolom);
    }
    public DefaultTableModel cekpesananminuman(String data) throws SQLException {
        String kolom[] = {"no", "minuman"};
        String query = "SELECT id_daftar_pesanan,m.nama_minuman FROM `pesanan` p join minuman m on "
                + "(m.id_minuman=p.id_minuman) where id_pesanan = " + data;
        return getDatatotal(query, kolom);
    }
     public DefaultTableModel gettoping( String data) throws SQLException {
        String kolom[] = {"no", "minuman"};
        String query = "SELECT `id_table_toping`,t.nama_toping FROM `pesan_toping` p join toping t on "
                + "(p.id_toping=t.id_toping) WHERE `id_pesan_toping` = " + data;
        return getDatatotal(query, kolom);
    }

    public String getidpesanan() {
        String id = null;
        try {
            String query = "SELECT MAX(`id_pesanan`)+1 as id_pesanan FROM `pesanan`";
            id = getdataidNoaray(query);
        } catch (SQLException ex) {
            Logger.getLogger(mpesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    public String getuangbayar(String id) {
        String uang = null;
        try {
            String query = "select concat('Rp ', format( SUM(harga_bayar), 0)) as uang from pesanan WHERE id_pesanan='"+id+"'";
            uang = getdataidNoaray(query);
        } catch (SQLException ex) {
            Logger.getLogger(mpesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uang;
    }
    public String getuangbayarasli(String id) {
        String uang = null;
        try {
            String query = "select SUM(harga_bayar) as uang from pesanan WHERE id_pesanan='"+id+"'";
            uang = getdataidNoaray(query);
        } catch (SQLException ex) {
            Logger.getLogger(mpesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uang;
    }
    public String getidtoping() {
        String id = null;
        try {
            String query = "SELECT MAX(`id_pesan_toping`)+1 as id_pesanan FROM `pesan_toping`";
            id = getdataidNoaray(query);
        } catch (SQLException ex) {
            Logger.getLogger(mpesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
