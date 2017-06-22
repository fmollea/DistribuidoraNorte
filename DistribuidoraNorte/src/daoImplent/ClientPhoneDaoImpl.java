package daoImplent;

import connecction.DbConnection;
import dao.ClientPhoneDao;
import distribuidoraNorte.ClientPhoneModel;
import java.sql.SQLException;
import java.sql.Statement;


public class ClientPhoneDaoImpl implements ClientPhoneDao {

   
    //add number's phone of client
    public boolean addNumberPhone(ClientPhoneModel phone) {
        boolean result = false;
        DbConnection conex= new DbConnection();
       
        String code = phone.getCode();
        String numPhone = phone.getNumPhone().get(0);
        
       try {
            //add a new client phone in the database
            Statement stmt = conex.getConnection().createStatement();
            stmt.executeUpdate("INSERT INTO clientPhone (code, numberPhone) VALUES "
                    + "('"+code+"', '"+numPhone+"')");
	
            // close of connection
            stmt.close();
            conex.desconectar();
            
            result = true;
	    
	} catch (SQLException e) {

            result = false;
        }    
        return result;
    }
    
    //falta hacer un update para meter el celu
    public boolean updateNummberPhone(ClientPhoneModel phone){
        boolean result = false;
        DbConnection conex = new DbConnection();
        
        String code = phone.getCode();
        String numPhone = phone.getNumPhone().get(0);
        
        try {
			  
            //update a client Phone
            Statement estatuto = conex.getConnection().createStatement();
                    
            estatuto.executeUpdate("UPDATE clientPhone SET code='"+code+"', numberPhone='"+phone+"' WHERE code='"+code+"'");
            
            result = true;
            
            // close of connection
            estatuto.close();
            conex.desconectar();
			  
			  
	} catch(SQLException e){
			  
            result = false;
	}
        return result;
    }
    
}
