/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webphone.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import webphone.entity.OrderDetail;
import webphone.entity.ProductOrder;
import webphone.util.ConnectionDB;

/**
 *
 * @author hieuk
 */
public class OrderModel {

    //Thêm mới hóa đơn Sản Phẩm
    public boolean insertOrder(ProductOrder productOrder) {

        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call insertProductOrder(?,?,?,?,?)}");
            //Đẩy dữ liệu vào các đầu vào
            callSt.setString(1, productOrder.getOrderID());
            callSt.setString(2, productOrder.getUserID());
            callSt.setFloat(3, productOrder.getTotalAmount());
            callSt.setBoolean(4, productOrder.isOrderStatus());
            callSt.setString(5, productOrder.getPaymentID());
            callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;

    }

    //Thêm mới hóa đơn chi tiết Sản Phẩm
    public boolean insertOrderDetail(OrderDetail orderDetail) {

        Connection conn = null;
        CallableStatement callSt = null;
        boolean check = true;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call insertOrderDetail(?,?,?,?,?)}");
            //Đẩy dữ liệu vào các đầu vào
            callSt.setString(1, orderDetail.getProductID());
            callSt.setString(2, orderDetail.getOrderID());
            callSt.setFloat(3, orderDetail.getPrice());
            callSt.setInt(4, orderDetail.getQuantity());
            callSt.setFloat(5, orderDetail.getAmount());
            callSt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return check;

    }
}
