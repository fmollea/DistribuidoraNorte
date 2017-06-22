package daoImplent;

import connecction.DbConnection;
import dao.ClientDao;
import distribuidoraNorte.ClientModel;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClientDaoImpl implements ClientDao {
    

    public boolean addClientDao(ClientModel client) {
        
        boolean result = false;
        DbConnection conex= new DbConnection();
        
        String code = client.getCode();
        String name = client.getName();
        String lastName = client.getLastName();
        String address = client.getAddress();
        Integer numAddress = client.getNumAddress();
        
        try {
            //add a new client in the database
            Statement stmt = conex.getConnection().createStatement();
            stmt.executeUpdate("INSERT INTO client (code, name, lastName, address, numAddress, isActive, cantBought) VALUES "
                    + "('"+code+"', '"+name+"','"+lastName+"', '"+address+"', '"+numAddress+"','"+0+"', '"+0+"')");
		  
            
		  
            stmt.close();
            conex.desconectar();
            result = true;
	    
	} catch (SQLException e) {

            result = false;
        }    
        return result;
    }
    
    
   

    @Override
    public boolean updateClientDao(ClientModel client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean activeClientDao(ClientModel client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteClientDao(ClientModel client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClientModel searchClientByCodeDao(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ClientModel> searchClientByNameDao(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ClientModel> listOfClientDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ClientModel> listOfActiveClientDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ClientModel> listOfNotActiveClientDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ClientModel> listOfClientByAmountBoughtDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
