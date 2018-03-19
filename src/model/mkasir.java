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
public class mkasir extends koneksi {

    public mkasir() throws SQLException {
        super();
    }
public boolean insertkasir(String nama,String password) {
        String query = "INSERT INTO `kasir` (`id_kasir`, `nama`, `password`) VALUES (NULL, '"+nama+"', '"+password+"')";
        System.out.println("query = "+query);
        return execute(query);
    }
    public boolean updatekasir(String nama,String password,String id) {
        String query = "UPDATE `kasir` SET `nama` = '"+nama+"',`password` = '"+password+"' WHERE `id_kasir` = "+id+";";
        return execute(query);
    }

    public DefaultTableModel getkasir() throws SQLException {
        String kolom[] = {"no", "nama kasir", "password"};
        String query = "SELECT * FROM `kasir`";
        return getDatatotal(query, kolom);
    }
public boolean deletekasir(String data) {
        String query = "DELETE FROM `kasir` WHERE `id_kasir` = " + data;
        return execute(query);
    }

}
