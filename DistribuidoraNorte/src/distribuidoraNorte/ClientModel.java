package distribuidoraNorte;

import java.util.ArrayList;

public class ClientModel {

    private String code;
    private String name;
    private String lastName;
    private String address;
    private Integer numAddress;
    // for default the client is active
    private Boolean isActive;
    //is amount bought history
    private Integer cantBought;
    
    //constructors
    public ClientModel(){
        code = "";
        name = "";
        lastName = "";
        address = "";
        numAddress = 0;
        isActive = true;     
        cantBought = 0;
    }
    
    public ClientModel(String codeP, String nameP, String lastN, String addressP, Integer numAddr){
        code = codeP;
        name = nameP;
        lastName = lastN;
        address = addressP;
        numAddress = numAddr;       
        isActive = true;
        //for defualt cantBought is 0
        cantBought = 0;
    }
    
    //sets
    public void setCode(String codeP){
        code = codeP;
    }
    
    public void setName(String nameP){
        name = nameP;
    }
    
    public void setLastName(String lastNameP){
        lastName = lastNameP;
    }
    
    public void setAddress(String addressP){
        address = addressP;
    }
    
    public void setNumAddress(Integer numAddressP){
        numAddress = numAddressP;
    }
    
    public void setIsActive(Boolean isActiveP){
        isActive = isActiveP;
    }
    
    public void setCantBought(Integer cantB){
        cantBought = cantB;
    }
    //gets
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getAddress(){
        return address;
    }
    
    public Integer getNumAddress(){
        return numAddress;
    }
    
    public Boolean getIsActive(){
        return isActive;
    }
    
    public Integer getCantBought(){
        return cantBought;
    }
}
