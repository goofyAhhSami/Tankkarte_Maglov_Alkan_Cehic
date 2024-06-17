package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface TankkarteDAOable {
    PreparedStatement insertTankkarte (Connection connection)throws SQLException;
    ResultSet selectTankkarte(Connection connection) throws SQLException;

}
