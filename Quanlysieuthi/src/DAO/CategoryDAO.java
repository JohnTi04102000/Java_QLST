/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.ProductDAO.pro;
import POJO.Category;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author quock
 */
public class CategoryDAO {

    public static ArrayList<Category> layDanhSachLoai() {
        ArrayList<Category> ListLoai = new ArrayList<Category>();
        try {
            String sql = "SELECT * FROM Category;";
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            while (rs.next()) {
                Category Loai = new Category();
                Loai.setCategoryID(rs.getInt("CategoryID"));
                Loai.setCategoryName(rs.getString("CategoryName"));
                Loai.setCategoryDescription(rs.getString("CategoryDescription"));
                ListLoai.add(Loai);
            }
            pro.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListLoai;
    }

    public static int GetCategoryIdByName(String name) {
        int id = 0;
        try {
            String sql = "EXEC GetCategoryIdByName N'" + name + "'";
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt("CategoryID");
            }
            System.out.println(id);
            pro.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
}
