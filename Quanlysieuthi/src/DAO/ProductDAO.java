/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Product;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author quock
 */
public class ProductDAO {

    static SQLServerDataProvider pro = new SQLServerDataProvider();

    public static ArrayList<Product> layDanhSachSanPham() {
        ArrayList<Product> LSP = new ArrayList<Product>();
        try {
            String sql = "EXECUTE GetProductData";
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            while (rs.next()) {
                Product SP = new Product();
                SP.setProductID(rs.getInt("ProductID"));
                SP.setCategoryName(rs.getString("CategoryName"));
                SP.setProductName(rs.getString("ProductName"));
                SP.setProductDescription(rs.getString("ProductDescription"));
                SP.setProductQuantity(rs.getInt("ProductQuantity"));
                SP.setProductPrice(rs.getDouble("ProductPrice"));
                LSP.add(SP);
            }
            pro.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return LSP;
    }

    public static ArrayList<Product> timKiemSanPham(String text) {
        ArrayList<Product> LSP = new ArrayList<Product>();
        try {
            String sql = "EXEC SearchProducts N'" + text + "'";
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            while (rs.next()) {
                Product SP = new Product();
                SP.setProductID(rs.getInt("ProductID"));
                SP.setCategoryName(rs.getString("CategoryName"));
                SP.setProductName(rs.getString("ProductName"));
                SP.setProductDescription(rs.getString("ProductDescription"));
                SP.setProductQuantity(rs.getInt("ProductQuantity"));
                SP.setProductPrice(rs.getDouble("ProductPrice"));
                LSP.add(SP);
            }
            pro.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return LSP;
    }

    public static boolean themSanPham(Product sp) {
        boolean kq = false;
        String sql = String.format("INSERT INTO Product(ProductName, ProductDescription, ProductPrice, ProductQuantity, CategoryID) values ('%s','%s','%s','%s','%s')",
                sp.getProductName(), sp.getProductDescription(), sp.getProductPrice(), sp.getProductQuantity(), sp.getCategoryID());
        System.out.println(sql);
        pro.open();
        int n = pro.executeUpdate(sql);
        System.out.println(n);
        if (n == 1) {
            kq = true;
        }
        pro.close();
        return kq;

    }

    public static boolean xoaSanPham(int id) {
        boolean kq = false;
        String sql = "DELETE FROM Product WHERE ProductID = '" + id + "'";
        System.out.println(sql);
        pro.open();
        int n = pro.executeUpdate(sql);
        System.out.println(n);
        if (n == 1) {
            kq = true;
        }
        pro.close();
        return kq;

    }

    public static boolean suaSanPham(Product sp) {
        boolean kq = false;
        String sql = String.format("UPDATE Product SET ProductName = '%s', ProductDescription = '%s', ProductPrice = '%s', ProductQuantity = '%s' WHERE ProductID = '%s'"
                ,sp.getProductName(),sp.getProductDescription(),sp.getProductPrice(),sp.getProductQuantity(),sp.getProductID());
        System.out.println(sql);
        pro.open();
        int n = pro.executeUpdate(sql);
        System.out.println(n);
        if (n == 1) {
            kq = true;
        }
        pro.close();
        return kq;

    }

    public static int GetProductID(String name, String des) {
        int id = 0;
        try {
            String sql = "EXECUTE GetProductID @ProductName = N'" + name + "', @ProductDescription = N'" + des + "'";
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt("ProductID");
            }
            System.out.println(id);
            pro.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

}
