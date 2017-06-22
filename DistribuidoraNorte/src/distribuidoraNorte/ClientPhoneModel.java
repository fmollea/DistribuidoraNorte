package distribuidoraNorte;

import java.util.ArrayList;

public class ClientPhoneModel {
    
    private String code;
    private ArrayList<String> numPhone;
    
    public ClientPhoneModel(){
        code = "";
        numPhone = new ArrayList();
        numPhone.add("");
    }
    
    public ClientPhoneModel(String codeP, String numP){
        code = codeP;
        numPhone = new ArrayList();
        numPhone.add(numP);
    }
    
    //sets
    public void setCode(String codeP){
        code = codeP;
    }
    
    public void setNumPhone(String numPhoneP){
        numPhone.add(numPhoneP);
    }
    
    //gets
    public String getCode(){
        return code;
    }    
    
    public ArrayList<String> getNumPhone(){
        return numPhone;
    }

}
