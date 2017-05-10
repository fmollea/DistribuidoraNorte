package dao;

import distribuidoraNorte.ProductModel;
import java.util.ArrayList;

public interface ProductDao {
    
    public void addProductDao(ProductModel product);
    
    public void updateProductDao(ProductModel product);
    
    public void activeProductDao(ProductModel product);
    
    public void deleteProductDao(ProductModel product);
    
    //search product
    public ProductModel searchProductByCodeDao(String code);
   
    //search product for area
    public ArrayList<ProductModel> searchProductByAreaDao(String area);
    
    //search all products that (product.stock < = stock)
    public ArrayList<ProductModel> searchProductByStockDao(Integer stock);
    
    public ArrayList<ProductModel> searchProductByProviderDao(String name);
    
    
    //diferent List of Product
    public ArrayList<ProductModel> listOfProductDao();
    
    public ArrayList<ProductModel> listOfActiveProductDao();
    
    public ArrayList<ProductModel> listOfNotActiveProductDao();
    
    //list of product by more seller
    public ArrayList<ProductModel> listOfProductByAmountBoughtDao();
    
   
}
