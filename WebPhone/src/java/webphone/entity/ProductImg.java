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
public class ProductImg {
    private String imgID;
    private String imgURL;
    private String productID;
    private boolean imgStatus;

    public ProductImg() {
    }

    public ProductImg(String imgID, String imgURL, boolean imgStatus, String productID) {
        this.imgID = imgID;
        this.imgURL = imgURL;
        this.imgStatus = imgStatus;
        this.productID = productID;
    }

    public String getImgID() {
        return imgID;
    }

    public void setImgID(String imgID) {
        this.imgID = imgID;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public boolean getImgStatus() {
        return imgStatus;
    }

    public void setImgStatus(boolean imgStatus) {
        this.imgStatus = imgStatus;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
    
    
}
