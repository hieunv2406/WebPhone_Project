/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webphone.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import webphone.entity.Catalog;
import webphone.util.ConnectionDB;

/**
 *
 * @author hieuk
 */
public class CatalogModel {

    //lấy tất cả thông tin của danh mục
    public List<Catalog> getAllCatalog() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Catalog> listCatalog = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getAllCatalog()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Catalog ca = new Catalog();
                ca.setCatalogID(rs.getString("CatalogID"));
                ca.setCatalogName(rs.getString("CatalogName"));
                ca.setParentID(rs.getString("ParentID"));
                ca.setCatalogPriority(rs.getInt("CatalogPriority"));
                ca.setCatalogStatus(rs.getBoolean("CatalogStatus"));
                listCatalog.add(ca);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCatalog;
    }

    //Lấy tất cả Danh mục của SmartPhone
    public List<Catalog> getAllCatalogBySmartPhone() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Catalog> listCatalogSP = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getAllCatalogBySmartPhone()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Catalog ca = new Catalog();
                ca.setCatalogID(rs.getString("CatalogID"));
                ca.setCatalogName(rs.getString("CatalogName"));
                ca.setParentID(rs.getString("ParentID"));
                ca.setCatalogPriority(rs.getInt("CatalogPriority"));
                ca.setCatalogStatus(rs.getBoolean("CatalogStatus"));
                listCatalogSP.add(ca);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCatalogSP;
    }

    //Lấy tất cả Danh mục của Tablet
    public List<Catalog> getAllCatalogByTablet() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Catalog> listCatalogTB = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getAllCatalogByTablet()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Catalog ca = new Catalog();
                ca.setCatalogID(rs.getString("CatalogID"));
                ca.setCatalogName(rs.getString("CatalogName"));
                ca.setParentID(rs.getString("ParentID"));
                ca.setCatalogPriority(rs.getInt("CatalogPriority"));
                ca.setCatalogStatus(rs.getBoolean("CatalogStatus"));
                listCatalogTB.add(ca);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCatalogTB;
    }

    //Lấy tất cả Danh mục của Phụ Kiện
    public List<Catalog> getAllCatalogByAccessories() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Catalog> listCatalogAC = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getAllCatalogByAccessories()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Catalog ca = new Catalog();
                ca.setCatalogID(rs.getString("CatalogID"));
                ca.setCatalogName(rs.getString("CatalogName"));
                ca.setParentID(rs.getString("ParentID"));
                ca.setCatalogPriority(rs.getInt("CatalogPriority"));
                ca.setCatalogStatus(rs.getBoolean("CatalogStatus"));
                listCatalogAC.add(ca);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCatalogAC;
    }

    //lấy Danh Mục sản phẩm theo ID
    public Catalog getCatalogById(String catalogID) {
        Connection conn = null;
        CallableStatement callSt = null;
        Catalog ca = new Catalog();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getCatalogByID(?)}");
            callSt.setString(1, catalogID);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                ca.setCatalogID(rs.getString("CatalogID"));
                ca.setCatalogName(rs.getString("CatalogName"));
                ca.setParentID(rs.getString("ParentID"));
                ca.setCatalogPriority(rs.getInt("CatalogPriority"));
                ca.setCatalogStatus(rs.getBoolean("CatalogStatus"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ca;
    }

    //Thêm mới Danh mục
    public boolean insertCatalog(Catalog catalog) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call insertCatalog(?,?,?,?,?)}");
            //Đẩy dữ liệu vào các đầu vào
            callSt.setString(1, catalog.getCatalogID());
            callSt.setString(2, catalog.getCatalogName());
            callSt.setString(3, catalog.getParentID());
            callSt.setInt(4, catalog.getCatalogPriority());
            callSt.setBoolean(5, catalog.isCatalogStatus());

            callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;

    }

    //Cập Nhật Danh Mục Sản Phẩm
    public boolean updateCatalog(Catalog catalog) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call updateCatalog(?,?,?,?,?)}");
            callSt.setString(1, catalog.getCatalogID());
            callSt.setString(2, catalog.getCatalogName());
            callSt.setString(3, catalog.getParentID());
            callSt.setInt(4, catalog.getCatalogPriority());
            callSt.setBoolean(5, catalog.isCatalogStatus());
            callSt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            check = false;
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    //Xóa Danh Mục theo ID
    public boolean removeCatalog(String catalogID) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call removeCatalog(?)}");
            callSt.setString(1, catalogID);
            callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    //Tìm kiếm Danh Mục Sản Phẩm theo tên
    public List<Catalog> searchCatalog(String searchName) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Catalog> listCa = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call searchCatalog(?)}");
            callSt.setString(1, searchName);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Catalog ca = new Catalog();
                ca.setCatalogID(rs.getString("CatalogID"));
                ca.setCatalogName(rs.getString("CatalogName"));
                ca.setParentID(rs.getString("ParentID"));
                ca.setCatalogPriority(rs.getInt("CatalogPriority"));
                ca.setCatalogStatus(rs.getBoolean("CatalogStatus"));
                listCa.add(ca);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCa;
    }
}
