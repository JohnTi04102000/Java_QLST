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
public class Category {
    private int CategoryID;
    private String CategoryName;
    private String CategoryDescription;

    public Category() {
    }
    

    public Category(int CategoryID, String CategoryName, String CategoryDescription) {
        this.CategoryID = CategoryID;
        this.CategoryName = CategoryName;
        this.CategoryDescription = CategoryDescription;
    }
    

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getCategoryDescription() {
        return CategoryDescription;
    }

    public void setCategoryDescription(String CategoryDescription) {
        this.CategoryDescription = CategoryDescription;
    }
    
}
