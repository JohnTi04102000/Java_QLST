/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author quock
 */
public class Customer {
    private int CustomersID;
    private String CustomersName;
    private String CustomersAddress;
    private String CustomersPhone;
    private int UserID;

    public Customer() {
    }

    public int getCustomersID() {
        return CustomersID;
    }

    public void setCustomersID(int CustomersID) {
        this.CustomersID = CustomersID;
    }

    public String getCustomersName() {
        return CustomersName;
    }

    public void setCustomersName(String CustomersName) {
        this.CustomersName = CustomersName;
    }

    public String getCustomersAddress() {
        return CustomersAddress;
    }

    public void setCustomersAddress(String CustomersAddress) {
        this.CustomersAddress = CustomersAddress;
    }

    public String getCustomersPhone() {
        return CustomersPhone;
    }

    public void setCustomersPhone(String CustomersPhone) {
        this.CustomersPhone = CustomersPhone;
    }

    public int getUserID() {
        return UserID;
    }
    
}
