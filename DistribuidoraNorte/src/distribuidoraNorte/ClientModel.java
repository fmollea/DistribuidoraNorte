package distribuidoraNorte;

public class ClientModel {

    private String name;
    private String lastName;
    private String address;
    private Integer numAddress;
    private Integer numPhone;
    // for default the client is active
    private Boolean isActive;
    
    //constructors
    public ClientModel(){
        name = "";
        lastName = "";
        address = "";
        numAddress = 0;
        numPhone = 0;
        isActive = true;
    }
    
    public ClientModel(String nameP, String lastNameP, String addressP, Integer numAddressP, Integer numPhoneP){
        name = nameP;
        lastName = lastNameP;
        address = addressP;
        numAddress = numAddressP;
        numPhone = numPhoneP;
        isActive = true;
    }
    
    //sets
    
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
    
    public void setNumPhone(Integer numPhoneP){
        numPhone = numPhoneP;
    }
    
    public void setIsActive(Boolean isActiveP){
        isActive = isActiveP;
    }
    
    //gets
    
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
    
    public Integer getNumPhone(){
        return numPhone;
    }
    
    public Boolean getIsActive(){
        return isActive;
    }
}
