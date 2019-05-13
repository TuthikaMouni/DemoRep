package com.jdbc.connection;

import java.sql.*;
import java.util.Properties;

public class Connection {
	// database constants
	private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/test"+"?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String MAX_POOL = "250";
    private static final String SELECT_SQL_QUERY = "select * from mouni_test.employee1";
    private static final String SELECT_SQL_QUERY1 =  "CREATE TABLE person_details.testlogintable (person_id INT NOT NULL, person_name VARCHAR(45) NOT NULL, PRIMARY KEY (person_id))";
    private static final String CREATE_SQL_QUERY = "insert into mouni_test.employee1(emp_name,emp_id,emp_salary,emp_contact,emp_dob,emp_doj) values(?,?,?,?,?,?)";
    private static final String UPDATE_SQL_QUERY = "update mouni_test.employee1 set emp_salary=? where emp_id=?";
    private static final String DELETE_SQL_QUERY = "delete from mouni_test.employee1 where emp_id=?";
    // init connection object
    private static java.sql.Connection connection;
    // init properties object
    private static Properties properties;
    
    // create properties
    private static Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            properties.setProperty("user", USERNAME);
            properties.setProperty("password", PASSWORD);
            properties.setProperty("MaxPooledStatements", MAX_POOL);
        }
        return properties;
    }

    // connect database
    public static java.sql.Connection connect() {
        if (connection == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                connection = DriverManager.getConnection(DATABASE_URL, getProperties());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    // disconnect database
    public static void disconnect() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void select(){
    	try {
    		PreparedStatement preparedStmt = connection.prepareStatement(SELECT_SQL_QUERY);
    		preparedStmt.execute();
    		disconnect();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public static void update(){
    	try {
    		PreparedStatement preparedStmt = connection.prepareStatement(UPDATE_SQL_QUERY);
    		preparedStmt.setInt (1, 20000);
		    preparedStmt.setInt (2, 5);
		    preparedStmt.execute();
			disconnect();
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
    
    public static void create(){
    	try {
			PreparedStatement preparedStmt = connection.prepareStatement(CREATE_SQL_QUERY);
		      preparedStmt.setString (1, "Mounika");
		      preparedStmt.setInt (2, 5);
		      preparedStmt.setInt(3, 30000);
		      preparedStmt.setString(4, "9100744364");
		      preparedStmt.setString(5, "28-07-1996");
		      preparedStmt.setString(6, "14-02-2018");
		      preparedStmt.execute();
			disconnect();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public static void delete(){
    	try {
			PreparedStatement preparedStmt = connection.prepareStatement(DELETE_SQL_QUERY);
			//preparedStmt.setInt (1, 5);
			//preparedStmt.execute();
			disconnect();
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
    
	public static void main(String[] args) {
		connection = connect();
		Statement psmt= null;
		try {
			psmt = connection.createStatement();
			psmt.executeUpdate(SELECT_SQL_QUERY1);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//select();
		//create();
		//update();
		//delete();
	}
}
