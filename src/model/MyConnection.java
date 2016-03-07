package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost/nepal";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private Connection mysqlConn;
    
    public MyConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
    	Class.forName(DRIVER).newInstance();
		mysqlConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
    }
    
    public void CloseConnection() throws SQLException {
    	mysqlConn.commit();
    	mysqlConn.setAutoCommit(true);
    	mysqlConn.close();
    }
    
    public Connection getConnection() {
    	return mysqlConn;
    }

}

