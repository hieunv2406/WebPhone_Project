/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webphone.entity;

/**
 *
 * @author hieuk
 */
public class ProductOrder {
    private String orderID;
    private String userID;
    private float totalAmount;
    private String created;
    private boolean orderStatus;
    private String paymentID;

    public ProductOrder() {
    }

    public ProductOrder(String orderID, String userID, float totalAmount, String created, boolean orderStatus, String paymentID) {
        this.orderID = orderID;
        this.userID = userID;
        this.totalAmount = totalAmount;
        this.created = created;
        this.orderStatus = orderStatus;
        this.paymentID = paymentID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }
    
    
}
