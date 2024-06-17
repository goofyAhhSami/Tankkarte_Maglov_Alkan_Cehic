package Connection;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseHandler {
    private Connection conn;
    private String ip;
    private String port;
    private String database;
    private String user;
    private String pwd;
    private String driver;
    private String encrypt;
    private String message;
    public DatabaseHandler() throws SQLException {
        getProperties();
        switch (driver) {
            case "sqlserver":
                System.out.println("jdbc:"+driver+"://"+ip+":"+port+";database="+database+";encrypt=" + encrypt+";user="+user+";password="+pwd);
                this.conn = DriverManager.getConnection("jdbc:"+driver+"://"+ip+":"+port+";database="+database+";encrypt=" + encrypt+"; user="+user+";password=" +pwd);

                break;

            case "hsqldb":
                this.conn = DriverManager.getConnection(driver + ":file:" + System.getProperty("user.dir") + "/HSQLDB_Vehicles/Vehicles; hsqldb.lock_file=false; hsqldb.tx=mvcc; ifexists=true");
                break;

            default:
        }
    }
    public void getProperties() {
        try (FileReader fileReader = new FileReader("dbConn.cfg")) {
            Properties prop = new Properties();
            prop.load(fileReader);

            this.ip = prop.getProperty("ip");
            this.port = prop.getProperty("port");
            this.database = prop.getProperty("database");
            this.user = prop.getProperty("User");
            this.pwd = prop.getProperty("Pwd");
            this.driver = prop.getProperty("driver");
            this.encrypt = prop.getProperty("encrypt");

        } catch (IOException e) {
            throw new RuntimeException("Fehler beim Laden der Konfigurationsdatei", e);
        }
    }

    public Connection getConn() {
        return conn;
    }
}
