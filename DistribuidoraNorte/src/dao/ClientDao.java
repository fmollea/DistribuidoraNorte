package dao;

import distribuidoraNorte.ClientModel;
import java.util.ArrayList;


public interface ClientDao {
    
    public boolean addClientDao(ClientModel client);
    
    public boolean updateClientDao(ClientModel client);
    
    public boolean activeClientDao(ClientModel client);
    
    public boolean deleteClientDao(ClientModel client);
    
    //search client
    public ClientModel searchClientByCodeDao(String code);
    
    public ArrayList<ClientModel> searchClientByNameDao(String name);
    
    //diferent List of Client
    public ArrayList<ClientModel> listOfClientDao();
    
    public ArrayList<ClientModel> listOfActiveClientDao();
    
    public ArrayList<ClientModel> listOfNotActiveClientDao();
    
    //list all client by cantBought
    public ArrayList<ClientModel> listOfClientByAmountBoughtDao();
    
}
