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
public class Account {
    private String userID;
    private String userName;
    private String password;
    private String phone;
    private String userAddress;
    private String mail;
    private boolean userStatus;
    private String userRoleID;
    private String roleID;
    private boolean urStatus;
    private String roleName;
    private String name;

    public Account() {
    }

    public Account(String userID, String userName, String password, String phone, String userAddress, String mail, boolean userStatus, String userRoleID, String roleID, boolean urStatus, String roleName, String name) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.userAddress = userAddress;
        this.mail = mail;
        this.userStatus = userStatus;
        this.userRoleID = userRoleID;
        this.roleID = roleID;
        this.urStatus = urStatus;
        this.roleName = roleName;
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isUserStatus() {
        return userStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserRoleID() {
        return userRoleID;
    }

    public void setUserRoleID(String userRoleID) {
        this.userRoleID = userRoleID;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public boolean isUrStatus() {
        return urStatus;
    }

    public void setUrStatus(boolean urStatus) {
        this.urStatus = urStatus;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
