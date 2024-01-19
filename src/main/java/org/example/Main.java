package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://ora.db.lab.ri.etf.unsa.ba/ETFLAB?serverTimezone=UTC";
        try {
            Connection conn = DriverManager.getConnection(url, "HD19015", "X0rTzixk");
            Statement stmt = conn.createStatement();
            ResultSet rs =stmt.executeQuery("SELECT * FROM tabelaabekap");
            /*while(rs.next()){
                int id=rs.getInt(1);
                String naslov=rs.getString(2);
            }*/
            conn.close();
        } catch (SQLException e) {
            System.out.println("greska u radu sa bazom podataka");
            System.out.println(e.getMessage());
            
        }
    }
}