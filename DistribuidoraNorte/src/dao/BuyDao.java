package dao;

import distribuidoraNorte.BuyModel;
import java.util.ArrayList;
import java.util.Date;

public interface BuyDao {
    
    public void addBuyDao(BuyModel buy);
    
    public void updateBuyDao(BuyModel buy);
    
    public void deleteBuyDao(BuyModel buy);
    
    public ArrayList <BuyModel> listOfBuyDao();
    
    //List the product for most bought 
    public ArrayList<BuyModel> listOfMostBoughtDao();
    
    //search all buy the product where (product.code = code)
    public ArrayList<BuyModel> searchBuyByCode(String code);
  
    //search all product buy in Date
    public ArrayList<BuyModel> searchBuyByDate(Date date);
    
    //search all product (product.area = area), I use the code for get the area
    public ArrayList<BuyModel> searchBuyByArea(String code);
    
    
}
