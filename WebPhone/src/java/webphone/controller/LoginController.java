/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webphone.controller;

//import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import webphone.entity.Account;
import webphone.entity.User;
import webphone.model.AccountModel;

@Controller
@RequestMapping(value = "/loginController")
public class LoginController {

    private AccountModel accountModel;

    public LoginController() {
        accountModel = new AccountModel();
    }

    @RequestMapping(value = "/initLogin")
    public ModelAndView initlogin() {
        ModelAndView model = new ModelAndView("login");

        return model;
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        List<Account> list = (List<Account>) session.getAttribute("Account");
        if (list != null) {
            session.removeAttribute("Account");
            return "redirect:initLogin.htm";
        }
        return "error";
    }

    @RequestMapping(value = "/login")
    public String login(@RequestParam("username") String username,
            @RequestParam("password") String password, HttpSession session) {

        List<Account> listAccount = accountModel.getAccount(username, password);
        List<Account> list = (List<Account>) session.getAttribute("Account");
        if (listAccount.size() != 0) {
            if (list == null) {

                boolean check = false;
                boolean check1 = false;

                for (Account account : listAccount) {
                    if (account.isUserStatus() && account.isUrStatus()) {
                        if (account.getRoleName().equals("role_admin")) {

                            check = true;
                            break;
                        } else if (account.getRoleName().equals("role_user")) {
                            check1 = true;
                            break;
                        }
                    } else {
                        return "error";
                    }
                }
                if (check == true) {
                    session.setAttribute("Account", listAccount);
                    return "redirect:../managerController/getIndex.htm";
                }
                if (check1 == true) {
                    session.setAttribute("Account", listAccount);
                    return "redirect:../productController/getAll.htm";
                }

            } else {
                return "error";

            }
        }

        return "error";

    }
}
