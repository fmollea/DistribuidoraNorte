
package controller;

public class ClientController {
    
    protected static ClientController unique_instance = null;
    
    //constructor
    
    public static ClientController getInstance(){
        if (unique_instance == null)
            unique_instance = new ClientController();
        return unique_instance;
    }
    
    //methods
    
    public void addClient(){
        
    }
    
    public void updateClient(){
        
    }
    
}
