package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

// import com.mysql.jdbc.Driver;
// import com.mysql.cj.jdbc.Driver;

public class konek {
    private static Connection koneksi;

    public static Connection GetConnection() throws SQLException {
        if (koneksi == null) {
            new Driver();
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/snake?characterEncoding=latin1",
                    "root", "");
        }
        return koneksi;
    }
}
