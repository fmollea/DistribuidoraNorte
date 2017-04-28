package connecction;

import java.sql.*;

public class DbConnection {
    static String bd = "schema";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/distributor";
	 
    Connection connection = null;
    
    

    // Constructor de DbConnection 
    public DbConnection() {
        
       try{
          PreparedStatement ps = connection.prepareStatement("CREATE TABLE IF NOT EXISTS user(user_id SERIAL NOT NULL PRIMARY KEY,username varchar(225) NOT NULL UNIQUE,password varchar(225),islogged varchar(10))");
          ps.executeUpdate();
          ps.close();
          Class.forName("com.mysql.jdbc.Driver");
          
          connection = DriverManager.getConnection(url,login,password);
  
          if (connection!=null){
             System.out.println("Conexión a base de datos "+bd+" OK\n");
          }
       }
       catch(SQLException e){
          System.out.println(e);
       }catch(ClassNotFoundException e){
          System.out.println(e);
       }catch(Exception e){
          System.out.println(e);
       }
    }
    
    //Permite retornar la conexión
    
    public Connection getConnection(){
       return connection;
    }
  
    public void desconectar(){
       connection = null;
    }
 }


