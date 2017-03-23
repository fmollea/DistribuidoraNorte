package distribuidoraNorte;

public class ClientModel {

    private String name;
    private String lastName;
    private String address;
    private Integer numAddress;
    
    //constructors
    public ClientModel(){
        name = "";
        lastName = "";
        address = "";
        numAddress = 0;
    }
    
    public ClientModel(String n, String l, String a, Integer na){
        name = n;
        lastName = l;
        address = a;
        numAddress = na;
    }
    
    //sets
    
    public void setName(String n){
        name = n;
    }
    
    public void setLastName(String l){
        lastName = l;
    }
    
    public void setAddress(String a){
        address = a;
    }
    
    public void setNumAddress(Integer n){
        numAddress = n;
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
}
