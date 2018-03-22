package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class koneksi {

    Connection con;
    Statement stm;
    java.sql.Connection connection;

    public koneksi() throws SQLException {
        String url = "jdbc:mysql://localhost/dbresto"; //url DB
        String username = "root"; //username DB
        String pass = ""; //password DB, Jika tidak di Password silahkan di Kosongkan.
        //membuat koneksi ke DB
        this.con = (Connection) DriverManager.getConnection(url, username, pass);
        this.stm = (Statement) this.con.createStatement();
    }

    public java.sql.Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost/dbresto", "root", "");
        } catch (Exception e) {
        }
        return connection;
    }

    //method untuk ekesekusi query Insert, Update, dan Delete
    public void executeQuery(String query) throws SQLException {
        this.stm.execute(query);
    }

    //method untuk ekesekusi query Select
    public ResultSet getResult(String query) throws SQLException {
        ResultSet rs = stm.executeQuery(query);
        return rs;
    }

    public boolean execute(String query) {
        boolean sukseseksekusi;
        try {
            executeQuery(query);
            sukseseksekusi = true;
            System.out.println("query berhasil");
        } catch (SQLException ex) {
            sukseseksekusi = false;
            System.out.println("query salah");
        }

        return sukseseksekusi;
    }

    public boolean cekdata(String query) throws SQLException {
        boolean cek;
        ResultSet rs = getResult(query);
        rs.next();
        int rowCount = rs.getInt(1);
        if (rowCount == 0) {
            cek = false;
        } else {
            cek = true;
        }
        return cek;
    }

    public String[] getdatatoarray(String query, String data[]) throws SQLException {
        ResultSet rs = getResult(query);
        int count = 0;
        while (rs.next()) {
            data[count] = rs.getString(1);
            count++;
        }
        return data;
    }

    public String[] getdataarraylist(String query) throws SQLException {
        ResultSet rs = getResult(query);
        int count = 0;
        while (rs.next()) {
            count++;
        }
        String data[] = new String[count];
        int hitung = 0;
        while (rs.next()) {
            data[hitung] = rs.getString(1);
            System.out.println("dapat kasir " + data[hitung]);
            hitung++;
        }
        return data;
    }

    public String[] getdatachart(String query, String data[]) throws SQLException {
        ResultSet rs = getResult(query);
        int count = 0;
        while (rs.next()) {
            count = Integer.parseInt(rs.getString(1));
            data[count - 1] = rs.getString(2);
            count++;
        }
        return data;
    }

    public DefaultTableModel getDatatotal(String query, String kolom[]) throws SQLException {
        DefaultTableModel table = new DefaultTableModel(null, kolom);
        ResultSet rs = getResult(query);
        while (rs.next()) {
            String row[] = new String[kolom.length];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getString(i + 1);
            }
            table.addRow(row);
        }
        return table;
    }

    public String getdataidNoaray(String query) throws SQLException {
        ResultSet rs = getResult(query);
        String data = "";
        if (rs.next()) {
            data = rs.getString(1);
        }
        return data;
    }
}
