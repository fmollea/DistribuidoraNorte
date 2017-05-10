package dao;

import distribuidoraNorte.InvoiceModel;
import java.util.ArrayList;
import java.util.Date;

public interface InvoiceDao {
    
    public void addInvoiceDao(InvoiceModel sell);
    
    public void updateInvoiceDao(InvoiceModel sell);
    
    public void deleteInvoiceDao(InvoiceModel sell);
    
    //list all Invoice
    public ArrayList<InvoiceModel> listAllInvoiceDao();
    
    //list invoice by great total
    public ArrayList<InvoiceModel> listInvoiceByTotal();
    
    //search client invoice
    public ArrayList<InvoiceModel> searchInvoiceByClientDao(String clientCode);
    
    //search invoice by date
    public ArrayList<InvoiceModel> searchInvoiceByDate(Date date);
    
}
