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
public class mmenu extends koneksi {

    public mmenu() throws SQLException {
        super();
    }

    public boolean updateminuman(String nama_minuman, String hargareguler, String hargagojek,String id) {
        String query = "UPDATE `minuman` SET `nama_minuman`= '"+nama_minuman+"',`harga`= '"+hargareguler+"',`harga_gojek`= '"+hargagojek+"' WHERE `id_minuman`='"+id+"'";
        System.out.println("query = "+query);
        return execute(query);
    }
    public boolean updatemenu(String nama_menu, String hargareguler, String hargagojek,String id) {
        String query = "UPDATE `menu` SET `nama_menu`= '"+nama_menu+"',`harga_menu`= '"+hargareguler+"',`harga_gojek`= '"+hargagojek+"' WHERE `id_menu`='"+id+"'";
       System.out.println("query = "+query);
        return execute(query);
    }
    public boolean updatetoping(String nama_minuman, String hargareguler, String hargagojek,String id) {
        String query = "UPDATE `toping` SET `nama_toping`= '"+nama_minuman+"',`harga_toping`= '"+hargareguler+"',`harga_gojek`= '"+hargagojek+"' WHERE `id_toping`='"+id+"'";
        System.out.println("query = "+query);
        return execute(query);
    }

    public DefaultTableModel getmenu() throws SQLException {
        String kolom[] = {"no", "nama menu", "harga reguler", "harga gojek"};
        String query = "SELECT * FROM `menu`";
        return getDatatotal(query, kolom);
    }

    public DefaultTableModel getminuman() throws SQLException {
        String kolom[] = {"no", "nama minuman", "harga reguler", "harga gojek"};
        String query = "SELECT * FROM `minuman`";
        return getDatatotal(query, kolom);
    }

    public DefaultTableModel gettoping() throws SQLException {
        String kolom[] = {"no", "nama toping", "harga reguler", "harga gojek"};
        String query = "SELECT * FROM `toping`";
        return getDatatotal(query, kolom);
    }

}
