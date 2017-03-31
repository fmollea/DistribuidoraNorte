package distribuidoraNorte;

import java.util.Date;

public class BuyModel {
    
    private String code;
    private Integer cant;
    private float cost;
    private Date date;
    
    public BuyModel(){
        code = "";
        cant = 0;
        cost = 0;
        date = null;
    }
    
    public BuyModel(String codeP, Integer cantP, float costP, Date dt){
        code = codeP;
        cant = cantP;
        cost = costP;
        date = dt;
    }
    
    //sets
    public void setCode(String cd){
        code = cd;
    }
    
    public void setCant(Integer cantP){
        cant = cantP;
    }
    
    public void setCost(float costP){
        cost = costP;
    }
    
    public void setDate(Date dt){
        date = dt;
    }
    
    //gets
    public String getCode(){
        return code;
    }
    
    public Integer getCant(){
        return cant;
    }
    
    public float getCost(){
        return cost;
    }
    
    public Date getDate(){
        return date;
    }
}
