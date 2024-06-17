package Kassa.model;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import Connection.DatabaseHandler;

public class TankkarteModel {

    private static final String SQL_INSERT_TANKKARTE = "INSERT INTO Tankkarte (PAN, ausgestelltAuf, gueltigBis, KNr, Ausstellungsdatum, Status, Kartenlimit) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_SELECT_MAX_PAN_NUMBER = "SELECT MAX(CAST(SUBSTRING(PAN, 7) AS UNSIGNED)) FROM Tankkarte";

    public void insertIntoTankkarte(String pan, String ausgestelltAuf, String gueltigBis, String kNr, boolean status, String kartenlimit) throws SQLException {
        DatabaseHandler dbh = new DatabaseHandler();
        LocalDate localDate = LocalDate.now();

        try (Connection conn = dbh.getConn();
             PreparedStatement pstmt = conn.prepareStatement(SQL_INSERT_TANKKARTE)) {

            pstmt.setString(1, pan);
            pstmt.setString(2, ausgestelltAuf);
            pstmt.setString(3, gueltigBis);
            pstmt.setInt(4, Integer.parseInt(kNr));
            pstmt.setDate(5, java.sql.Date.valueOf(localDate));
            pstmt.setBoolean(6, status);
            pstmt.setBigDecimal(7, BigDecimal.valueOf(Double.parseDouble(kartenlimit)));

            pstmt.executeUpdate();
        }
    }

    public int getNextPANNumber() throws SQLException {
        DatabaseHandler dbh = new DatabaseHandler();

        try (Connection conn = dbh.getConn();
             PreparedStatement pstmt = conn.prepareStatement(SQL_SELECT_MAX_PAN_NUMBER);
             ResultSet rs = pstmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt(1) + 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 1;
    }
}
