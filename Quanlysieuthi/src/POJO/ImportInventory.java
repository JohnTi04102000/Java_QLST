/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POJO;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class ImportInventory {
    private int ImportID;
    private Date ImportDate;
    private String SupplierName;
    private String ContactEmail;
    private String ContacPhone;
    private int TotalQuantity;
    private float TotalAmount;
    private int EmployyeeID;

    public ImportInventory() {
    }

    public ImportInventory(int ImportID, Date ImportDate, String SupplierName, String ContactEmail, String ContacPhone, int TotalQuantity, float TotalAmount, int EmployyeeID) {
        this.ImportID = ImportID;
        this.ImportDate = ImportDate;
        this.SupplierName = SupplierName;
        this.ContactEmail = ContactEmail;
        this.ContacPhone = ContacPhone;
        this.TotalQuantity = TotalQuantity;
        this.TotalAmount = TotalAmount;
        this.EmployyeeID = EmployyeeID;
    }
    

    public int getImportID() {
        return ImportID;
    }

    public void setImportID(int ImportID) {
        this.ImportID = ImportID;
    }

    public Date getImportDate() {
        return ImportDate;
    }

    public void setImportDate(Date ImportDate) {
        this.ImportDate = ImportDate;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getContactEmail() {
        return ContactEmail;
    }

    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    public String getContacPhone() {
        return ContacPhone;
    }

    public void setContacPhone(String ContacPhone) {
        this.ContacPhone = ContacPhone;
    }

    public int getTotalQuantity() {
        return TotalQuantity;
    }

    public void setTotalQuantity(int TotalQuantity) {
        this.TotalQuantity = TotalQuantity;
    }

    public float getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public int getEmployyeeID() {
        return EmployyeeID;
    }

    public void setEmployyeeID(int EmployyeeID) {
        this.EmployyeeID = EmployyeeID;
    }
}
