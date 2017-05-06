package distribuidoraNorte;

import java.util.*;

public class SellModel {
    
    private Integer number;
    private String clientCode;
    private Date date;
    private float total;
    private ArrayList<Pair> listProduct;
    
    public SellModel(){
        number = 0;
        clientCode = "";
        date = null;
        total = 0;
        listProduct = new ArrayList();
        Pair product = new Pair("", 0);
        listProduct.add(product);
    }
    
    public SellModel(Integer num, String cCode, Date dt, float t, String pCode, Integer nCant){
        number = num;
        clientCode = cCode;
        date = dt;
        total = t;
        listProduct = new ArrayList();
        Pair product = new Pair(pCode, nCant);
        listProduct.add(product);
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
    
    public void setTotal(float t){
        total = t;
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
    
    public float getTotal(){
        return total;
    }

    public ArrayList<Pair> getListProduct(){
        return listProduct;
    }
}

