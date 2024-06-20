package Kassa.model;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import Connection.DatabaseHandler;
import Connection.TankstelleDAO;

public class TankkarteModel {

    private static final String SQL_SELECT_MAX_PAN_NUMBER = "SELECT MAX(PAN) FROM Tankkarte";

    public void insertIntoTankkarte(String pan, String ausgestelltAuf, String gueltigBis, String kNr, boolean status, String kartenlimit) throws SQLException {
        DatabaseHandler dbh = new DatabaseHandler();
        LocalDate localDate = LocalDate.now();
        TankstelleDAO td = new TankstelleDAO();

        try (Connection conn = dbh.getConn();
             PreparedStatement pstmt = td.insertTankkarte(conn)) {

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

    public String getNextPANNumber(String kundennr) throws SQLException {
        String fixeZahl = "700093";
        String nullKnr = "00000";
        String knr = nullKnr + kundennr + "0002";
        fixeZahl += knr;

        StringBuilder reversed = new StringBuilder(fixeZahl).reverse();

        int sum = 0;
        boolean doubleDigit = false;

        for (int i = 0; i < reversed.length(); i++) {
            int digit = Character.getNumericValue(reversed.charAt(i));

            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit = digit - 9;
                }
            }

            sum += digit;
            doubleDigit = !doubleDigit;
        }

        int checksum = sum % 10;
        if (checksum != 0) {
            checksum = 10 - checksum;
        }

        String pan = fixeZahl + checksum;

        return pan;
    }

}
