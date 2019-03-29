/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webphone.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import webphone.entity.Cart;
import webphone.entity.Product;
import webphone.model.ProductModel;

/**
 *
 * @author hieuk
 */
@Controller
@RequestMapping(value = "/cartController")
public class CartController {

    private ProductModel promodel;

    public CartController() {
        promodel = new ProductModel();

    }

    //Hiển thị toàn bộ sản phẩm trong Giỏ hàng
    @RequestMapping(value = "/listCart")
    public ModelAndView listCart(HttpSession session) {
        ModelAndView model = new ModelAndView("shoppingCart");
        List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        session.setAttribute("listCart", listCart);
        return model;
    }

    // Thêm sản phẩm mới vào giỏ hàng
    @RequestMapping(value = "/addCart")
    public ModelAndView addCart(String productID, HttpSession session) {
        //khoi tao doi tuong modelAndView
        ModelAndView model = new ModelAndView("shoppingCart");
        //lấy thông tin sản phẩm theo productID
        Product pro = promodel.getProductById(productID);
        //Session có một tham số listcart chứa tất cả giỏ hàng của khách hàng
        //lấy listcart trong session
        List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        //Kiểm tra sản phẩm muốn mua đã tồn tại trong listcart hay chưa ?
        if (listCart == null) {
            //khách hàng chưa mua sản phẩm nào
            //khởi tạo listcart
            listCart = new ArrayList<>();
            //add sản phẩm vào listcart
            Cart cart = new Cart(pro, 1);
            listCart.add(cart);
        } else {
            //kiểm tra sản phẩm có trong listcart hay chưa
            boolean check = false;
            for (Cart cart : listCart) {
                if (cart.getProduct().getProductID().equals(productID)) {
                    //Sản phẩm đã tồn tại trong listcart
                    cart.setQuantity(cart.getQuantity() + 1);
                    check = true;
                    break;
                }
            }
            if (check != true) {
                Cart cart = new Cart(pro, 1);
                listCart.add(cart);
            }
        }
        //put listcart vào session
        session.setAttribute("listCart", listCart);
        //put totalAmount vao session
        session.setAttribute("totalAmount", proOrder(listCart));
        return model;
    }

    //Phương thức tính tổng tiền đơn hàng
    public float proOrder(List<Cart> listCart) {
        float totalAmount = 0;
        for (Cart cart : listCart) {
            totalAmount += (cart.getProduct().getPrice() - cart.getProduct().getDiscount()) * cart.getQuantity();
        }
        return totalAmount;
    }

    //Xóa sản phẩm trong giỏ hàng
    @RequestMapping(value = "/removeCart")
    public ModelAndView removeCart(String productID, HttpSession session) {
        ModelAndView model = new ModelAndView("shoppingCart");
        //lấy sản phẩm trên session
        List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        //kiểm tra xem có sản phẩm cần lấy trong giỏ hàng hay k?
        if (listCart != null) {
            for (Cart cart : listCart) {
                if (cart.getProduct().getProductID().equals(productID)) {
                    listCart.remove(cart);
                    break;
                }
            }
        }
        //put listcart vào session
        session.setAttribute("listCart", listCart);
        //put totalAmount vao session
        session.setAttribute("totalAmount", proOrder(listCart));
        return model;
    }

    //Cập nhật giỏ hàng
    @RequestMapping(value = "/updateCart")
    public ModelAndView updateCart(HttpServletRequest request, HttpSession session) {
        ModelAndView model = new ModelAndView("shoppingCart");
        //lấy sản phẩm trên session
        List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        //lấy danh sách số lượng muốn mua
        String[] arrQuantity = request.getParameterValues("quantity");

        for (int i = 0; i < listCart.size(); i++) {
            listCart.get(i).setQuantity(Integer.parseInt(arrQuantity[i]));
            if (Integer.parseInt(arrQuantity[i]) < 1) {
                listCart.get(i).setQuantity(1);
            }
        }
        //put listcart vào session
        session.setAttribute("listCart", listCart);
        //put totalAmount vao session
        session.setAttribute("totalAmount", proOrder(listCart));
        return model;

    }
}
