package util;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.Logger;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j
public class MySqlConnector {

//    public static final Logger logger = Logger.getLogger(JdbcConnection.class);

    private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/Social?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "Khajmike4958";

    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Connection connection = null;
        try
        {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
        }
        catch (ClassNotFoundException | SQLException e)
        {
            log.error(e.getMessage(),e);
        }
        return connection;
    }
}
