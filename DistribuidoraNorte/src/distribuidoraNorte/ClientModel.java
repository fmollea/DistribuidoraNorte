package distribuidoraNorte;

public class ClientModel {

    private String code;
    private String name;
    private String lastName;
    private String address;
    private Integer numAddress;
    private Integer numPhone;
    // for default the client is active
    private Boolean isActive;
    //sumatory of cant buy
    private float cantBuy;
    
    //constructors
    public ClientModel(){
        code = "";
        name = "";
        lastName = "";
        address = "";
        numAddress = 0;
        numPhone = 0;
        isActive = true;
        cantBuy = 0;
    }
    
    public ClientModel(String codeP, String nameP, String lastN, String addressP, Integer numAddr, Integer numP){
        code = codeP;
        name = nameP;
        lastName = lastN;
        address = addressP;
        numAddress = numAddr;
        numPhone = numP;
        isActive = true;
        cantBuy = 0;
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
    
    public void setNumPhone(Integer numPhoneP){
        numPhone = numPhoneP;
    }
    
    public void setIsActive(Boolean isActiveP){
        isActive = isActiveP;
    }
    
    public void setCantBuy(float cantB){
        cantBuy = cantB;
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
    
    public Integer getNumPhone(){
        return numPhone;
    }
    
    public Boolean getIsActive(){
        return isActive;
    }
    
    public float getCantBuy(){
        return cantBuy;
    }
}
