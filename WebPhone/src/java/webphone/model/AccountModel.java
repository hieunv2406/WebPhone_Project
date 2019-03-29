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
import webphone.entity.Account;
import webphone.entity.User;
import webphone.util.ConnectionDB;

/**
 *
 * @author hieuk
 */
public class AccountModel {

    //Lấy toàn bộ Danh Sách người dùng
    public List<Account> getAllUser() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Account> listUser = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getAllUser()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Account user = new Account();
                user.setUserID(rs.getString("UserID"));
                user.setUserName(rs.getString("UserName"));
                user.setPassword(rs.getString("Password"));
                user.setPhone(rs.getString("Phone"));
                user.setUserAddress(rs.getString("UserAddress"));
                user.setMail(rs.getString("Mail"));
                user.setUserStatus(rs.getBoolean("UserStatus"));
                user.setName(rs.getString("Name"));

                listUser.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listUser;
    }

    public List<Account> getAccount(String username, String password) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Account> listAccount = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getAccount(?,?)}");
            callSt.setString(1, username);
            callSt.setString(2, password);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Account acc = new Account();
                acc.setUserID(rs.getString("UserID"));
                acc.setPhone(rs.getString("Phone"));
                acc.setName(rs.getString("Name"));
                acc.setUserAddress(rs.getString("UserAddress"));
                acc.setMail(rs.getString("Mail"));
                acc.setUserStatus(rs.getBoolean("UserStatus"));
                acc.setRoleID(rs.getString("RoleID"));
                acc.setRoleName(rs.getString("RoleName"));
                acc.setUrStatus(rs.getBoolean("UrStatus"));
                acc.setUserRoleID(rs.getString("UserRoleID"));

                listAccount.add(acc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAccount;
    }

}
