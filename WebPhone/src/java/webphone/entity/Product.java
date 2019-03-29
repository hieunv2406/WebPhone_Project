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
public class Product {
    private String productID;
    private String productName;
    private float price;
    private String title;
    private String productDescription;
    private String imageURL;
    private float discount;
    private String fromDate;
    private String toDate;
    private String created;
    private String catalogID;   
    private String color;
    private String memory;
    private boolean productStatus;

    public Product() {
    }

    public Product(String productID, String productName, float price, String title, String productDescription, String imageURL, float discount, String fromDate, String toDate, String created, String catalogID, String color, String memory, boolean productStatus) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.title = title;
        this.productDescription = productDescription;
        this.imageURL = imageURL;
        this.discount = discount;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.created = created;
        this.catalogID = catalogID;
        this.color = color;
        this.memory = memory;
        this.productStatus = productStatus;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCatalogID() {
        return catalogID;
    }

    public void setCatalogID(String catalogID) {
        this.catalogID = catalogID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    
    
}
