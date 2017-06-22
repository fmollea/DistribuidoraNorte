
package controller;

import daoImplent.ClientDaoImpl;
import distribuidoraNorte.ClientModel;

public class ClientController {
    
    protected static ClientController unique_instance = null;
    
    //constructor
    
    public static ClientController getInstance(){
        if (unique_instance == null)
            unique_instance = new ClientController();
        return unique_instance;
    }
    
    //methods
    
    public boolean addClient(ClientModel client){
        ClientDaoImpl clientDao = new ClientDaoImpl();
        boolean resSql = clientDao.addClientDao(client);
        return resSql;
    }
    
    public void updateClient(){
        
    }
    
}
