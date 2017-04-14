package distribuidoraNorte;

public class Pair {
    
    private String productCode;
    private Integer cant;
    
    public Pair (){
        productCode = "";
        cant = 0;
    }
    
    public Pair(String pCode, Integer nCant){
        productCode = pCode;
        cant = nCant;
    }
    
    public void setProductCode(String pCode){
        productCode = pCode;
    }
    
    public void setCant(Integer nCant){
        cant = nCant;
    }
    
    public String getProductCode(){
        return productCode;
    }
    
    public Integer getCant(){
        return cant;
    }
}
