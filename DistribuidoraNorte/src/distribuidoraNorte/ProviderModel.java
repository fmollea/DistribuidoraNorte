package distribuidoraNorte;

//falta GETS!

public class ProviderModel {

    private String name;
    private String city;
    private String address;
    private Integer numAddress;
    // area is rubro 
    private Area area; 
    
    //constructors
    public ProviderModel() {
        name = "";
        city = "";
        address = "";
        numAddress = 0;
        area = null;  
    }
    
    public ProviderModel(String n, String c, String a, Integer na, Area ar){
        name = n;
        city = c;
        address = a;
        numAddress = na;
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
    
    public Area getArea(){
        return area;
    }
}
