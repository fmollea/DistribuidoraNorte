
package controller;

import daoImplent.ClientPhoneDaoImpl;
import distribuidoraNorte.ClientPhoneModel;

public class ClientPhoneController {
     protected static ClientPhoneController unique_instance = null;
    
    //constructor
    
    public static ClientPhoneController getInstance(){
        if (unique_instance == null)
            unique_instance = new ClientPhoneController();
        return unique_instance;
    }
    
    //methods
    
    public boolean addPhoneClient(ClientPhoneModel cPhone){
        ClientPhoneDaoImpl cPhoneDao = new ClientPhoneDaoImpl();
        boolean resSql = cPhoneDao.addNumberPhone(cPhone);
        return resSql;
    }
}
