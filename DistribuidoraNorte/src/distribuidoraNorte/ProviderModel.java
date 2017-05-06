package distribuidoraNorte;

//falta GETS!

import java.util.ArrayList;


public class ProviderModel {

    private String name;
    private String city;
    private String address;
    private Integer numAddress;
    private ArrayList<String> numPhone;
    // area is rubro 
    private Area area; 
    
    //constructors
    public ProviderModel() {
        name = "";
        city = "";
        address = "";
        numAddress = 0;
        numPhone = new ArrayList();
        numPhone.add("");
        area = null;  
    }
    
    public ProviderModel(String n, String c, String a, Integer na, String np, Area ar){
        name = n;
        city = c;
        address = a;
        numAddress = na;
        numPhone = new ArrayList();
        numPhone.add(np);
        area = ar;     
    }
    
    //sets
    
    public void setName(String n){
        name = n;
    }
    
    public void setCity (String c){
        city = c;
    }
    
    public void setAddress(String a){
        address = a;
    }
    
    public void setNumAddress (Integer na){
        numAddress = na;
    }
    
    public void setNumPhone(String np){
        numPhone.add(np);
    }
    
    public void setArea(Area ar){
        area = ar;
    }
    
    //gets
    
    public String getName(){
        return name;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getAddress(){
        return address;
    }
    
    public ArrayList<String> getNumPhone(){
        return numPhone;
    }
    
    public Area getArea(){
        return area;
    }
}
