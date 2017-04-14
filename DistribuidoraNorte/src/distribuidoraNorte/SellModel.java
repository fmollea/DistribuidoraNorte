package distribuidoraNorte;

import java.util.*;

public class SellModel {
    
    private Integer number;
    private String clientCode;
    private Date date;
    private ArrayList<Pair> listProduct;
    
    public SellModel(){
        number = 0;
        clientCode = "";
        date = null;
        listProduct = null;
    }
    
    public SellModel(Integer num, String cCode, Date dt, String pCode, Integer nCant){
        number = num;
        clientCode = cCode;
        date = dt;
        Pair products = new Pair(pCode, nCant);
        listProduct.add(products);
    }
    
    //sets
    public void setNumber(Integer num){
        number = num;
    }
    
    public void setClientCode(String cCode){
        clientCode = cCode;
    }
    
    public void setDate(Date dt){
        date = dt;
    }
    
    public void setListProduct(String pCode, Integer nCant){
        Pair products = new Pair(pCode, nCant);
        listProduct.add(products);        
    }
    
    //gets
    public Integer getNumber(){
        return number;
    }
    
    public String getClientCode(){
        return clientCode;
    }
    
    public Date getDate(){
        return date;
    }
    
    public ArrayList<Pair> getListProduct(){
        return listProduct;
    }
}

