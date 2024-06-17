package Connection;

import java.sql.*;

public class TankkarteDAO implements TankkarteDAOable {
    private PreparedStatement preparedStatement;
    private Statement statement;
    String sqlInsertTankkarte = "INSERT INTO Tankkarte (PAN,ausgestelltAuf, gueltigBis, KNr, Ausstellungsdatum, Status, Kartenlimit) VALUES (?,?, ?, ?, ?, ?, ?)";

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
}
