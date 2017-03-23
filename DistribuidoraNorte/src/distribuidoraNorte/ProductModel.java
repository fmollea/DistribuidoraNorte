package distribuidoraNorte;

public class ProductModel {

    String description;
    Integer cant;
    // for default the product is active
    Boolean isActive;
    float cost;
    float price;
   
    //constructors 
    public ProductModel(){
        description = "";
        cant = 0;
        isActive = true;
        cost = 0;
        price = 0;
    }
    
    public ProductModel(String d, Integer c, float cst, float p){
        description = d;
        cant = c;
        isActive = true;
        cost = cst;
        price = p;
    }
    
    //sets
    public void setDescription (String d){
        description = d;        
    }
    
    public void setCant (Integer c){
        cant = c;
    }
    
    public void setIsActive(Boolean isA){
        isActive = isA;
    }
    
    public void setCost(float c){
        cost = c;
    }
    
    public void setPrice(float p){
        price = p;
    }
    
    //gets
    public String getDescription (){
        return description;        
    }
    
    public Integer getCant (){
        return cant;
    }
    
    public Boolean getIsActive(){
        return isActive;
    }
    
    public float getCost(){
        return cost;
    }
    
    public float getPrice(){
        return price;
    }
    
}
