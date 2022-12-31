
package context;


import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.jsp.tagext.TryCatchFinally;


public class DBContext {
    
    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
     public Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://"+serverName+":"+portNumber + "\\" + instance +";databaseName="+dbName;
        if(instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }   
    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "localhost";
    private final String dbName = "QuanLyBanHang";
    private final String portNumber = "1433";
    private final String instance="";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
    private final String userID = "quanly";
    private final String password = "123456";
    
}

//public static void main(String[] args) throws SQLException{
//Connection connection=null;
//try {
//	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	 String connectionURL="jdbc:sqlserver://DESKTOP-QEDJBBM\\SQLEXPRESS:1433;databaseName=QuanLyBanGiay;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
//	 connection=DriverManager.getConnection(connectionURL, "demo2", "123456");
//   System.out.println("Ket noi thanh cong");
//} catch (ClassNotFoundException e) {
//	// TODO: handle exception
//	System.out.println("Ket noi that bai");
//	System.err.println(e.getMessage()+"/n"+e.getClass()+"/n"+e.getCause());
//}
//}
 