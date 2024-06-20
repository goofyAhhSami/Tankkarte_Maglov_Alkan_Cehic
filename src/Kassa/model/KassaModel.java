package Kassa.model;

import Connection.DatabaseHandler;
import Connection.TankstelleDAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class KassaModel {

    public void insertIntoTankung(String pan, double mengeInLitern, double dieselPreis,double gesamterBeitrag) throws SQLException {
        TankstelleDAO td = new TankstelleDAO();
        DatabaseHandler dbh = new DatabaseHandler();
        try (Connection conn = dbh.getConn();
             PreparedStatement pstmt = td.insertTankung(conn)) {


            pstmt.setString(1, pan);
            //Diesel PID = 5
            pstmt.setInt(2, 5);
            //Tankstelle Shell Wels Kaserne
            pstmt.setInt(3, 50100);
            pstmt.setDouble(4,mengeInLitern);
            pstmt.setDouble(5, dieselPreis);
            pstmt.setDouble(6, gesamterBeitrag);
            pstmt.setDate(7, Date.valueOf(LocalDate.now()));
            pstmt.setBoolean(8,true);

            pstmt.executeUpdate();


        }
    }

}
