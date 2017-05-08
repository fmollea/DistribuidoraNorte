package dao;

import distribuidoraNorte.ClientModel;
import java.util.ArrayList;


public interface ClientDao {
    
    public void addClientDao(ClientModel client);
    
    public void updateClientDao(ClientModel client);
    
    public void activeClientDao(ClientModel client);
    
    public void deleteClientDao(ClientModel client);
    
    //search client
    public ClientModel searchClientByCodeDao(String code);
    
    public ArrayList<ClientModel> searchClientByNameDao(String name);
    
    //diferent List of Client
    public ArrayList<ClientModel> listOfClientDao();
    
    public ArrayList<ClientModel> listOfActiveClientDao();
    
    public ArrayList<ClientModel> listOfNotActiveClientDao();
    
    public ArrayList<ClientModel> listOfSellClientDao();
    
}
