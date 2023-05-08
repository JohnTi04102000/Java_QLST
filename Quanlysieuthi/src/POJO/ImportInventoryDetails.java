/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POJO;

/**
 *
 * @author Admin
 */
public class ImportInventoryDetails {
    private int ImportDetailID;
    private int ImportID;
    private int ProductID;
    private int quantiity;
    private float Price;

    public ImportInventoryDetails() {
    }

    public ImportInventoryDetails(int ImportDetailID, int ImportID, int ProductID, int quantiity, float Price) {
        this.ImportDetailID = ImportDetailID;
        this.ImportID = ImportID;
        this.ProductID = ProductID;
        this.quantiity = quantiity;
        this.Price = Price;
    }
    
    

    public int getImportDetailID() {
        return ImportDetailID;
    }

    public void setImportDetailID(int ImportDetailID) {
        this.ImportDetailID = ImportDetailID;
    }

    public int getImportID() {
        return ImportID;
    }

    public void setImportID(int ImportID) {
        this.ImportID = ImportID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getQuantiity() {
        return quantiity;
    }

    public void setQuantiity(int quantiity) {
        this.quantiity = quantiity;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
    
    
}
