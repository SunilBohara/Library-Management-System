package librarysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MysqlData extends DataAbstraction {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/librarysystem";
    private PreparedStatement preparedStatement;
    private Connection connection;
    private ResultSet resultSet;
    private static MysqlData sqlData = null;

    private MysqlData() {
    }

    public static MysqlData getInstance() {
        if (sqlData == null) {
            sqlData = new MysqlData();
        }
        return sqlData;
    }

    @Override
    public void connectiontoServer() throws Exception {
        Class.forName(driver);
        connection = DriverManager.getConnection(url, user, password);
    }

    @Override
    public void iduData(String sqlquery) throws Exception {
        preparedStatement = connection.prepareStatement(sqlquery);
        preparedStatement.executeUpdate();
    }

    @Override
    public void closeConnection() throws Exception {
        connection.close();
    }

    @Override
    public void readData(String sqlquery) throws Exception {
        preparedStatement = connection.prepareStatement(sqlquery);
        this.resultSet = preparedStatement.executeQuery();
    }

    public ResultSet getdata() {
        return resultSet;
    }
}
