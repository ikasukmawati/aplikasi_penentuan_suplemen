/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spk_suplemen_balita_saw;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class Koneksi { //membuat koneksi penghubung ke database
    public static Connection konekKeDB() {
        try {
            MysqlDataSource mds = new MysqlDataSource();
            mds.setUser("root");
            mds.setPassword("");
            mds.setDatabaseName("spk_saw");
            mds.setServerName("localhost");
            mds.setPortNumber(3306);
            mds.setServerTimezone("Asia/Jakarta");
            Connection koneksi = mds.getConnection();
            return koneksi;
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
}
