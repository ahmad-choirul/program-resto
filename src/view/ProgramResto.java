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
 * @author Nila
 */
public class ProgramResto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            login a = new login();
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ProgramResto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
