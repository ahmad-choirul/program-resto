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
public class mlogin extends koneksi {

    public mlogin() throws SQLException {
        super();
    }
public String getpassword(String nama) {
        String id = null;
        try {
            String query = "SELECT password FROM `kasir` where nama = '"+nama+"'";
            id = getdataidNoaray(query);
        } catch (SQLException ex) {
            Logger.getLogger(mpesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
public String getlevel(String nama) {
        String id = null;
        try {
            String query = "SELECT level FROM `kasir` where nama = '"+nama+"'";
            id = getdataidNoaray(query);
        } catch (SQLException ex) {
            Logger.getLogger(mpesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

}
