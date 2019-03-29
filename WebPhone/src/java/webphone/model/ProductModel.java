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
import webphone.entity.Product;
import webphone.entity.ProductDetails;
import webphone.entity.ProductImg;
import webphone.util.Common;
import webphone.util.ConnectionDB;

/**
 *
 * @author hieuk
 */
public class ProductModel {

    //Lấy toàn bộ sản phẩm
    public List<Product> getAllProduct() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> listProduct = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getAll()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setProductID(rs.getString("ProductID"));
                pro.setProductName(rs.getString("ProductName"));
                pro.setPrice(rs.getFloat("Price"));
                pro.setTitle(rs.getString("Title"));
                pro.setProductDescription(rs.getString("ProductDescription"));
                pro.setImageURL(rs.getString("ImageURL"));
                pro.setDiscount(rs.getFloat("Discount"));
                pro.setFromDate(rs.getString("FromDate"));
                pro.setToDate(rs.getString("ToDate"));
                pro.setCreated(rs.getString("Created"));
                pro.setCatalogID(rs.getString("CatalogID"));
                pro.setColor(rs.getString("Color"));
                pro.setMemory(rs.getString("Memory"));
                pro.setProductStatus(rs.getBoolean("ProductStatus"));
                listProduct.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    //Lấy 4 sản phẩm mới nhất
    public List<Product> getNewProduct() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> listNew = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getNewProduct()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setProductID(rs.getString("ProductID"));
                pro.setProductName(rs.getString("ProductName"));
                pro.setPrice(rs.getFloat("Price"));
                pro.setTitle(rs.getString("Title"));
                pro.setProductDescription(rs.getString("ProductDescription"));
                pro.setImageURL(rs.getString("ImageURL"));
                pro.setDiscount(rs.getFloat("Discount"));
                pro.setFromDate(rs.getString("FromDate"));
                pro.setToDate(rs.getString("ToDate"));
                pro.setCreated(rs.getString("Created"));
                pro.setCatalogID(rs.getString("CatalogID"));
                pro.setColor(rs.getString("Color"));
                pro.setMemory(rs.getString("Memory"));
                pro.setProductStatus(rs.getBoolean("ProductStatus"));
                listNew.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNew;
    }

    //Lấy 4 sản phẩm giảm giá cao nhất
    public List<Product> getSaleProduct() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> listSale = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getSaleProduct()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setProductID(rs.getString("ProductID"));
                pro.setProductName(rs.getString("ProductName"));
                pro.setPrice(rs.getFloat("Price"));
                pro.setTitle(rs.getString("Title"));
                pro.setProductDescription(rs.getString("ProductDescription"));
                pro.setImageURL(rs.getString("ImageURL"));
                pro.setDiscount(rs.getFloat("Discount"));
                pro.setFromDate(rs.getString("FromDate"));
                pro.setToDate(rs.getString("ToDate"));
                pro.setCreated(rs.getString("Created"));
                pro.setCatalogID(rs.getString("CatalogID"));
                pro.setColor(rs.getString("Color"));
                pro.setMemory(rs.getString("Memory"));
                pro.setProductStatus(rs.getBoolean("ProductStatus"));
                listSale.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSale;
    }

    //lấy tất cả sản phẩm theo từng catalog
    public List<Product> getProductByCatalogId(String CatalogID) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> listProductBC = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getProductByCatalogID(?)}");
            callSt.setString(1, CatalogID);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setProductID(rs.getString("ProductID"));
                pro.setProductName(rs.getString("ProductName"));
                pro.setPrice(rs.getFloat("Price"));
                pro.setTitle(rs.getString("Title"));
                pro.setProductDescription(rs.getString("ProductDescription"));
                pro.setImageURL(rs.getString("ImageURL"));
                pro.setDiscount(rs.getFloat("Discount"));
                pro.setFromDate(rs.getString("FromDate"));
                pro.setToDate(rs.getString("ToDate"));
                pro.setCreated(rs.getString("Created"));
                pro.setCatalogID(rs.getString("CatalogID"));
                pro.setColor(rs.getString("Color"));
                pro.setMemory(rs.getString("Memory"));
                pro.setProductStatus(rs.getBoolean("ProductStatus"));
                listProductBC.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProductBC;
    }

    //Lấy tất cả hình ảnh theo productID
    public List<ProductImg> getProductImgById(String productID) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<ProductImg> listImg = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getProductImg(?)}");
            callSt.setString(1, productID);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                ProductImg img = new ProductImg();
                img.setImgID(rs.getString("ImgID"));
                img.setImgURL(rs.getString("ImgURL"));
                img.setImgStatus(rs.getBoolean("ImgStatus"));
                img.setProductID(rs.getString("ProductID"));

                listImg.add(img);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listImg;
    }

    //lấy sản phẩm theo ID
    public Product getProductById(String productID) {
        Connection conn = null;
        CallableStatement callSt = null;
        Product pro = new Product();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getProductByID(?)}");
            callSt.setString(1, productID);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                pro.setProductID(rs.getString("ProductID"));
                pro.setProductName(rs.getString("ProductName"));
                pro.setPrice(rs.getFloat("Price"));
                pro.setTitle(rs.getString("Title"));
                pro.setProductDescription(rs.getString("ProductDescription"));
                pro.setImageURL(rs.getString("ImageURL"));
                pro.setDiscount(rs.getFloat("Discount"));
                pro.setFromDate(rs.getString("FromDate"));
                pro.setToDate(rs.getString("ToDate"));
                pro.setCreated(rs.getString("Created"));
                pro.setCatalogID(rs.getString("CatalogID"));
                pro.setColor(rs.getString("Color"));
                pro.setMemory(rs.getString("Memory"));
                pro.setProductStatus(rs.getBoolean("ProductStatus"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pro;
    }

    //Lấy thông tin sản phẩm theo ID
    public ProductDetails getDetailsById(String productID) {
        Connection conn = null;
        CallableStatement callSt = null;
        ProductDetails proDt = new ProductDetails();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getProductDetails(?)}");
            callSt.setString(1, productID);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                proDt.setDetailsID(rs.getString("DetailsID"));
                proDt.setProductID(rs.getString("ProductID"));
                proDt.setScreen(rs.getString("Screen"));
                proDt.setOs(rs.getString("Os"));
                proDt.setCpu(rs.getString("Cpu"));
                proDt.setRam(rs.getString("Ram"));
                proDt.setRom(rs.getString("Rom"));
                proDt.setSim(rs.getString("Sim"));
                proDt.setPin(rs.getString("Pin"));
                proDt.setCamera(rs.getString("Camera"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return proDt;
    }

    //Xóa Sản phẩm theo ID
    public boolean removeProduct(String productID) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call removeProduct(?)}");
            callSt.setString(1, productID);
            callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    //Cập Nhật Sản Phẩm
    public boolean updateProduct(Product product) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call updateProduct(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            callSt.setString(1, product.getProductID());
            callSt.setString(2, product.getProductName());
            callSt.setFloat(3, product.getPrice());
            callSt.setString(4, product.getTitle());
            callSt.setString(5, product.getProductDescription());
            callSt.setString(6, product.getImageURL());
            callSt.setFloat(7, product.getDiscount());
            callSt.setString(8, product.getFromDate());
            callSt.setString(9, product.getToDate());
            callSt.setString(10, product.getCreated());
            callSt.setString(11, product.getCatalogID());
            callSt.setString(12, product.getColor());
            callSt.setString(13, product.getMemory());
            callSt.setBoolean(14, product.isProductStatus());
            callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    //Cập Nhật Chi Tiết Sản Phẩm
    public boolean updateProductDetails(ProductDetails productDetails) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call updateProductDetails(?,?,?,?,?,?,?,?,?,?)}");

            callSt.setString(1, productDetails.getProductID());
            callSt.setString(2, productDetails.getDetailsID());
            callSt.setString(3, productDetails.getScreen());
            callSt.setString(4, productDetails.getOs());
            callSt.setString(5, productDetails.getCpu());
            callSt.setString(6, productDetails.getRam());
            callSt.setString(7, productDetails.getRom());
            callSt.setString(8, productDetails.getSim());
            callSt.setString(9, productDetails.getPin());
            callSt.setString(10, productDetails.getCamera());

            callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    //Cập Nhật Danh Sách Ảnh Sản Phẩm
    public boolean updateProductImg(ProductImg productImg) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call updateProductImg(?,?,?,?)}");

            callSt.setString(1, productImg.getProductID());
            callSt.setString(2, productImg.getImgID());
            callSt.setString(3, productImg.getImgURL());
            callSt.setBoolean(4, productImg.getImgStatus());

            callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;
    }

    //Thêm mới Sản Phẩm
    public boolean insertProduct(Product product) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call inserProduct(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            //Đẩy dữ liệu vào các đầu vào
            callSt.setString(1, product.getProductID());
            callSt.setString(2, product.getProductName());
            callSt.setFloat(3, product.getPrice());
            callSt.setString(4, product.getTitle());
            callSt.setString(5, product.getProductDescription());
            callSt.setString(6, product.getImageURL());
            callSt.setFloat(7, product.getDiscount());
            callSt.setString(8, product.getFromDate());
            callSt.setString(9, product.getToDate());
            callSt.setString(10, product.getCreated());
            callSt.setString(11, product.getCatalogID());
            callSt.setString(12, product.getColor());
            callSt.setString(13, product.getMemory());
            callSt.setBoolean(14, product.isProductStatus());

            callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;

    }

    //Thêm mới Chi Tiết Sản Phẩm
    public boolean insertProductDetails(ProductDetails productDetails) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call inserProductDetails(?,?,?,?,?,?,?,?,?,?)}");
            //Đẩy dữ liệu vào các đầu vào
            callSt.setString(1, productDetails.getDetailsID());
            callSt.setString(2, productDetails.getProductID());
            callSt.setString(3, productDetails.getScreen());
            callSt.setString(4, productDetails.getOs());
            callSt.setString(5, productDetails.getCpu());
            callSt.setString(6, productDetails.getRam());
            callSt.setString(7, productDetails.getRom());
            callSt.setString(8, productDetails.getSim());
            callSt.setString(9, productDetails.getPin());
            callSt.setString(10, productDetails.getCamera());
        
            callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;

    }
    
    //Tìm kiếm sản phẩm theo tên
    public List<Product> searchProduct(String searchName) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> listPro = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call searchProduct(?)}");
            callSt.setString(1, searchName);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setProductID(rs.getString("ProductID"));
                pro.setProductName(rs.getString("ProductName"));
                pro.setPrice(rs.getFloat("Price"));
                pro.setTitle(rs.getString("Title"));
                pro.setProductDescription(rs.getString("ProductDescription"));
                pro.setImageURL(rs.getString("ImageURL"));
                pro.setDiscount(rs.getFloat("Discount"));
                pro.setFromDate(rs.getString("FromDate"));
                pro.setToDate(rs.getString("ToDate"));
                pro.setCreated(rs.getString("Created"));
                pro.setCatalogID(rs.getString("CatalogID"));
                pro.setColor(rs.getString("Color"));
                pro.setMemory(rs.getString("Memory"));
                pro.setProductStatus(rs.getBoolean("ProductStatus"));
                listPro.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPro;
    }
}
