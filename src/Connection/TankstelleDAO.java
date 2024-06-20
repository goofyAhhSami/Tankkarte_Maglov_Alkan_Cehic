package Connection;

import java.sql.*;

public class TankstelleDAO implements TankstelleDAOable {
    private PreparedStatement preparedStatement;
    private Statement statement;

    private String sqlInsertTankung= "INSERT INTO Tankung (PAN, PID, TSNr, Menge, PreisProEinheit, Gesamtpreis, TDatum, abgerechnet) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private String sqlInsertTankkarte = "INSERT INTO Tankkarte (PAN, ausgestelltAuf, gueltigBis, KNr, Ausstellungsdatum, Status, Kartenlimit) VALUES (?, ?, ?, ?, ?, ?, ?)";
    @Override
    public PreparedStatement insertTankkarte(Connection connection) throws SQLException {
        preparedStatement = connection.prepareStatement(sqlInsertTankkarte);
        return preparedStatement;
    }

    @Override
    public ResultSet selectTankkarte(Connection connection) throws SQLException {
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        return statement.executeQuery("SELECT * FROM Tankstelle.Auftrag");
    }

    @Override
    public PreparedStatement insertTankung(Connection connection) throws SQLException {
        preparedStatement = connection.prepareStatement(sqlInsertTankung);
        return preparedStatement;
    }
}
