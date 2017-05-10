package dao;

import distribuidoraNorte.InvoiceModel;
import java.util.ArrayList;

public interface InvoiceDao {
    
    public void addInvoiceDao(InvoiceModel sell);
    
    public void updateInvoiceDao(InvoiceModel sell);
    
    public void deleteInvoiceDao(InvoiceModel sell);
    
    //list all Invoice
    public ArrayList<InvoiceModel> listAllInvoiceDao();
    
    //search client invoice
    
    
    
    
}
