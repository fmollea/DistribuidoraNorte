package distribuidoraNorte;

import java.util.ArrayList;

public class ClientModel {

    private String code;
    private String name;
    private String lastName;
    private String address;
    private Integer numAddress;
    private ArrayList<String> numPhone;
    // for default the client is active
    private Boolean isActive;
    
    
    //constructors
    public ClientModel(){
        code = "";
        name = "";
        lastName = "";
        address = "";
        numAddress = 0;
        numPhone = new ArrayList();
        numPhone.add("");
        isActive = true;       
    }
    
    public ClientModel(String codeP, String nameP, String lastN, String addressP, Integer numAddr, String numP){
        code = codeP;
        name = nameP;
        lastName = lastN;
        address = addressP;
        numAddress = numAddr;
        numPhone = new ArrayList();
        numPhone.add(numP);
        isActive = true;
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
    
    public void setNumPhone(String numPhoneP){
        numPhone.add(numPhoneP);
    }
    
    public void setIsActive(Boolean isActiveP){
        isActive = isActiveP;
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
    
    public ArrayList<String> getNumPhone(){
        return numPhone;
    }
    
    public Boolean getIsActive(){
        return isActive;
    }
}
