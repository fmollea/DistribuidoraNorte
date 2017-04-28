package distribuidoraNorte;

//falta GETS!

public class ProviderModel {

    private String name;
    private String city;
    private String address;
    private Integer numAddress;
    private String numPhone;
    // area is rubro 
    private Area area; 
    
    //constructors
    public ProviderModel() {
        name = "";
        city = "";
        address = "";
        numAddress = 0;
        numPhone = "";
        area = null;  
    }
    
    public ProviderModel(String n, String c, String a, Integer na, String np, Area ar){
        name = n;
        city = c;
        address = a;
        numAddress = na;
        numPhone = np;
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
        numPhone = np;
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
    
    public String getNumPhone(){
        return numPhone;
    }
    
    public Area getArea(){
        return area;
    }
}
