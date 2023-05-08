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
public class Employee {
    private int EmployeeID;
    private String EmployeeName;
    private String EmployeeaAddress;
    private String EmployeePhone;
    private String EmployeeEmail;
    private String EmployeePosition;
    private String EmployeeImage;
    private int UserID;

    public Employee() {
    }

    public Employee(int EmployeeID, String EmployeeName, String EmployeeaAddress, String EmployeePhone, String EmployeeEmail, String EmployeePosition, String EmployeeImage, int UserID) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.EmployeeaAddress = EmployeeaAddress;
        this.EmployeePhone = EmployeePhone;
        this.EmployeeEmail = EmployeeEmail;
        this.EmployeePosition = EmployeePosition;
        this.EmployeeImage = EmployeeImage;
        this.UserID = UserID;
    }

    public String getEmployeeImage() {
        return EmployeeImage;
    }

    public void setEmployeeImage(String EmployeeImage) {
        this.EmployeeImage = EmployeeImage;
    }

    
    public int getUserID() {
        return UserID;
    }
    

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmployeeaAddress() {
        return EmployeeaAddress;
    }

    public void setEmployeeaAddress(String EmployeeaAddress) {
        this.EmployeeaAddress = EmployeeaAddress;
    }

    public String getEmployeePhone() {
        return EmployeePhone;
    }

    public void setEmployeePhone(String EmployeePhone) {
        this.EmployeePhone = EmployeePhone;
    }

    public String getEmployeeEmail() {
        return EmployeeEmail;
    }

    public void setEmployeeEmail(String EmployeeEmail) {
        this.EmployeeEmail = EmployeeEmail;
    }

    public String getEmployeePosition() {
        return EmployeePosition;
    }

    public void setEmployeePosition(String EmployeePosition) {
        this.EmployeePosition = EmployeePosition;
    }
    

}
