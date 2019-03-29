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
public class Catalog {
    private String catalogID;
    private String catalogName;
    private String parentID;
    private int catalogPriority;
    private boolean catalogStatus;

    public Catalog() {
    }

    public Catalog(String catalogID, String catalogName, String parentID, int catalogPriority, boolean catalogStatus) {
        this.catalogID = catalogID;
        this.catalogName = catalogName;
        this.parentID = parentID;
        this.catalogPriority = catalogPriority;
        this.catalogStatus = catalogStatus;
    }

    public String getCatalogID() {
        return catalogID;
    }

    public void setCatalogID(String catalogID) {
        this.catalogID = catalogID;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public int getCatalogPriority() {
        return catalogPriority;
    }

    public void setCatalogPriority(int catalogPriority) {
        this.catalogPriority = catalogPriority;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
    
    
}
