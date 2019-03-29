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
public class ProductDetails {
    private String detailsID;
    private String productID;
    private String screen;
    private String os;
    private String cpu;
    private String ram;
    private String rom;
    private String sim;
    private String pin;
    private String camera;

    public ProductDetails() {
    }

    public ProductDetails(String detailsID, String productID, String screen, String os, String cpu, String ram, String rom, String sim, String pin, String camera) {
        this.detailsID = detailsID;
        this.productID = productID;
        this.screen = screen;
        this.os = os;
        this.cpu = cpu;
        this.ram = ram;
        this.rom = rom;
        this.sim = sim;
        this.pin = pin;
        this.camera = camera;
    }

    public String getDetailsID() {
        return detailsID;
    }

    public void setDetailsID(String detailsID) {
        this.detailsID = detailsID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }
    
    
}
