package dao;

import distribuidoraNorte.ProviderModel;
import java.util.ArrayList;

public interface ProviderDao {
    
    public void addProviderDao(ProviderModel provider);
    
    public void updateProviderDao(ProviderModel provider);
    
    public void deleteProviderDao(ProviderModel provider);
    
    //search provider
    public ProviderModel searchProductByNameDao(String name);
   
    //search provider for area
    public ArrayList<ProviderModel> searchProviderByAreaDao(String area);
        
    //diferent List of provider
    public ArrayList<ProviderModel> listOfProviderDao();
    
}
