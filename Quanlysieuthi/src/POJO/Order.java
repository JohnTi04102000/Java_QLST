/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.sql.Date;

/**
 *
 * @author quock
 */
public class Order {
    private int OrderDetailID;
    private Date OrderDate;
    private int CustomersID;

    public Order() {
    }

    public Order(int OrderDetailID, Date OrderDate, int CustomersID) {
        this.OrderDetailID = OrderDetailID;
        this.OrderDate = OrderDate;
        this.CustomersID = CustomersID;
    }

    
    public int getOrderDetailID() {
        return OrderDetailID;
    }

    public void setOrderDetailID(int OrderDetailID) {
        this.OrderDetailID = OrderDetailID;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public int getCustomersID() {
        return CustomersID;
    }

    public void setCustomersID(int CustomersID) {
        this.CustomersID = CustomersID;
    }
    
}
