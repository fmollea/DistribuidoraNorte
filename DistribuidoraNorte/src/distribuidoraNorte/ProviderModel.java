package distribuidoraNorte;

public class ProviderModel {

    private String name;
    private String city;
    private String address;
    private Integer numAddress;
    // area is rubro 
    private String area; // ******
    
    //constructors
    public ProviderModel() {
        name = "";
        city = "";
        address = "";
        numAddress = 0;
        area = "";     // ***************
    }
    
    public ProviderModel(String n, String c, String a, Integer na, String ar){
        name = n;
        city = c;
        address = a;
        numAddress = na;
        area = ar;     // ***************
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
    
    public void setArea(String ar){
        area = ar;
    }
}
