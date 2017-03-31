package distribuidoraNorte;

public class ProductModel {

    private String description;
    private String code;
    // cant is stock of product
    private Integer cant;
    // for default the product is active
    private Boolean isActive;
    //cost = how much do you buy it?
    private float cost;
    // sale price
    private float price;
    private Area area;
    private String nameProvider; 
    private Integer cantBuy;
    private Integer cantSell;
   
    //constructors 
    public ProductModel(){
        description = "";
        code = "";
        cant = 0;
        isActive = true;
        cost = 0;
        price = 0;
        area = null; 
        nameProvider = "";
        cantBuy = 0;
        cantSell = 0;
    }
    
    public ProductModel(String descr,String cd, Integer cantP, float cst, float priceP, Area areaP, String nameProv){
        description = descr;
        code = cd;
        cant = cantP;
        isActive = true;
        cost = cst;
        price = priceP;
        area = areaP;
        nameProvider = nameProv;
        cantBuy = 0;
        cantSell = 0;
    }
    
    //sets
    public void setDescription (String descr){
        description = descr;        
    }
    
    public void setCode(String cd){
        code = cd;
    }
    
    public void setCant (Integer cantP){
        cant = cantP;
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
    
    public void setCantBuy(Integer cantB){
        cantBuy = cantB;
    }
    
    public void setCantSell(Integer cantS){
        cantSell = cantS;
    }
    
    //gets
    public String getDescription (){
        return description;        
    }
    
    public String getCode (){
        return code;        
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
    
    public Area getArea(){
        return area;
    }
    
    public String getNameProvider(){
        return nameProvider;
    }
    
    public Integer getCantBuy(){
        return cantBuy;
    }
    
    public Integer getCantSell(){
        return cantSell;
    }
}
