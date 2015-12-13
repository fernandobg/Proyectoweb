package DAO;
import java.io.*;
import java.sql.*;

public class Conexion {
	public static void main(String []args){
	 
		try{
			  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	          String connectionUrl = "jdbc:sqlserver://DESKTOP-I7P8I0B:1433;" +
	            "databaseName=bddemo;user=fernando;password=fbg;";
	          Connection con = DriverManager.getConnection(connectionUrl);
	          if (con!=null){
	          System.out.println("ok");
	          }
		}catch(Exception e){  System.out.println(e.toString());}
	}
}
