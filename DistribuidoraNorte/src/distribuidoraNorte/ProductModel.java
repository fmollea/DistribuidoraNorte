package distribuidoraNorte;

public class ProductModel {

    private String description;
    private String code;
    private Integer stock;
    //is amount bought history
    private Integer cantBought;
    // for default the product is active
    private Boolean isActive;
    //cost = how much do you buy it?
    private float cost;
    // sale price
    private float price;
    private Area area;
    private String nameProvider; 
   
    //constructors 
    public ProductModel(){
        description = "";
        code = "";
        stock = 0;
        cantBought = 0;
        isActive = true;
        cost = 0;
        price = 0;
        area = null; 
        nameProvider = "";
    }
    
    public ProductModel(String descr,String cd, Integer cantP, float cst, float priceP, Area areaP, String nameProv){
        description = descr;
        code = cd;
        stock = cantP;
        //for defualt cantBought is 0
        cantBought = 0;
        isActive = true;
        cost = cst;
        price = priceP;
        area = areaP;
        nameProvider = nameProv;
    }
    
    //sets
    public void setDescription (String descr){
        description = descr;        
    }
    
    public void setCode(String cd){
        code = cd;
    }
    
    public void setStock (Integer stockP){
        stock = stockP;
    }
    
    public void setCantBought(Integer cantB){
        cantBought = cantB;
    }
    
    public void setIsActive(Boolean isA){
        isActive = isA;
    }
    
    public void setCost(float costP){
        cost = costP;
    }
    
    public void setPrice(float priceP){
        price = priceP;
    }
    
    public void setArea(Area areaP){
        area = areaP;
    }
    
    public void setNameProvider(String nameProv){
        nameProvider = nameProv;
    }
    
    
    //gets
    public String getDescription (){
        return description;        
    }
    
    public String getCode(){
        return code;        
    }
    
    public Integer getStock(){
        return stock;
    }
    
    public Integer getCantBought(){
        return cantBought;
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
    
    public Area getArea(){
        return area;
    }
    
    public String getNameProvider(){
        return nameProvider;
    }
}
