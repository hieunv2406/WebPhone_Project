/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webphone.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import webphone.entity.Account;
import webphone.entity.Catalog;
import webphone.entity.Product;
import webphone.entity.ProductDetails;
import webphone.entity.ProductImg;
import webphone.entity.User;
import webphone.model.AccountModel;
import webphone.model.CatalogModel;
import webphone.model.ProductModel;

/**
 *
 * @author hieuk
 */
@Controller
@RequestMapping(value = "/managerController")
public class ManagerController {

    private ProductModel proModel;
    private CatalogModel caModel;
    private AccountModel acModel;

    public ManagerController() {
        proModel = new ProductModel();
        caModel = new CatalogModel();
        acModel = new AccountModel();
    }

    //lấy toàn bộ DM và SP
    @RequestMapping(value = "/getIndex")
    public ModelAndView getIndex() {
        ModelAndView model = new ModelAndView("../backend/indexManager");
        List<Product> listProduct = proModel.getAllProduct();
        List<Catalog> listCatalog = caModel.getAllCatalog();
        model.addObject("listProduct", listProduct);
        model.addObject("listCatalog", listCatalog);

        return model;
    }

    //Lấy danh sách Sản Phẩm
    @RequestMapping(value = "/getAllProduct")
    public ModelAndView getAllProduct() {
        ModelAndView model = new ModelAndView("../backend/listProduct");
        List<Product> listProduct = proModel.getAllProduct();
        List<Catalog> listCatalog = caModel.getAllCatalog();
        model.addObject("listProduct", listProduct);
        model.addObject("listCatalog", listCatalog);

        return model;
    }

    //Lấy danh sách Danh Mục Sản Phẩm
    @RequestMapping(value = "/getAllCatalog")
    public ModelAndView getAllCatalog() {
        ModelAndView model = new ModelAndView("../backend/listCatalog");
        List<Product> listProduct = proModel.getAllProduct();
        List<Catalog> listCatalog = caModel.getAllCatalog();
        model.addObject("listProduct", listProduct);
        model.addObject("listCatalog", listCatalog);

        return model;
    }

    //Xóa SP
    @RequestMapping(value = "/removeProduct")
    public String removeProduct(String productID) {
        boolean check = proModel.removeProduct(productID);
        if (check) {
            return "redirect: getAllProduct.htm";
        } else {
            return "error";
        }
    }

    //Chi tiết sản phẩm theo ID
    @RequestMapping(value = "/getProductByID")
    public ModelAndView getProductByID(String productID) {
        ModelAndView model = new ModelAndView("../backend/productDetail");
        Product singleProduct = proModel.getProductById(productID);
        ProductDetails productDetails = proModel.getDetailsById(productID);
        List<ProductImg> listImg = (List<ProductImg>) proModel.getProductImgById(productID);
        model.addObject("singleProduct", singleProduct);
        model.addObject("productDetails", productDetails);
        model.addObject("listImg", listImg);

        return model;
    }

    @RequestMapping(value = "/initUpdateProduct")
    public ModelAndView initUpdateProduct(String productID) {
        ModelAndView model = new ModelAndView("../backend/updateProduct");
        //Lấy tất cả thông tin cần cập nhật từ productID
        Product productUpdate = proModel.getProductById(productID);
        ProductDetails productDetailsUpdate = proModel.getDetailsById(productID);
        List<ProductImg> productImgsUpdate = proModel.getProductImgById(productID);
        model.getModelMap().addAttribute("updateProduct", productUpdate);
        model.getModelMap().addAttribute("updateDetails", productDetailsUpdate);
        model.getModelMap().addAttribute("updateImg", productImgsUpdate);

        return model;

    }
    //Update Product

    @RequestMapping(value = "/updateProduct")
    public String updateProduct(Product product) {
        boolean check = proModel.updateProduct(product);
        if (check) {
            return "redirect: getAllProduct.htm";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "/initUpdateCatalog")
    public ModelAndView initUpdateCatalog(String catalogID) {
        ModelAndView model = new ModelAndView("../backend/updateCatalog");
        //Lấy tất cả thông tin cần cập nhật từ productID
        Catalog catalogUpdate = caModel.getCatalogById(catalogID);
        model.getModelMap().addAttribute("updateCatalog", catalogUpdate);

        return model;

    }

    //Update Catalog
    @RequestMapping(value = "/updateCatalog")
    public String updateCatalog(Catalog catalog) {
        boolean check = caModel.updateCatalog(catalog);
        if (check) {
            return "redirect: getAllCatalog.htm";
        } else {
            return "error";
        }
    }

    //Xóa Danh Mục
    @RequestMapping(value = "/removeCatalog")
    public String removeCatalog(String catalogID) {
        boolean check = caModel.removeCatalog(catalogID);
        if (check) {
            return "redirect: getAllCatalog.htm";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "/initInsertCatalog")
    public ModelAndView initInsertCatalog() {
        ModelAndView model = new ModelAndView("../backend/insertCatalog");
        Catalog catalog = new Catalog();
        model.getModelMap().addAttribute("newCatalog", catalog);
        return model;
    }

    @RequestMapping(value = "/insertCatalog")
    public String insertCatalog(Catalog catalog) {
        boolean check = caModel.insertCatalog(catalog);
        if (check) {
            return "redirect: getAllCatalog.htm";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "/initInsertProduct")
    public ModelAndView initInsertProduct() {
        ModelAndView model = new ModelAndView("../backend/insertProduct");
        Product product = new Product();
        model.getModelMap().addAttribute("newProduct", product);
        return model;
    }

    @RequestMapping(value = "/insertProduct")
    public String insertProduct(Product product) {
        boolean check = proModel.insertProduct(product);
        if (check) {
            return "redirect: getAllProduct.htm";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "/initInsertProductDetails")
    public ModelAndView initInsertProductDetails() {
        ModelAndView model = new ModelAndView("../backend/insertProductDetails");
        ProductDetails productDetails = new ProductDetails();
        model.getModelMap().addAttribute("newProductDetails", productDetails);
        return model;
    }

    @RequestMapping(value = "/insertProductDetails")
    public String insertProductDetails(ProductDetails productDetails) {
        boolean check = proModel.insertProductDetails(productDetails);
        if (check) {
            return "redirect: getAllProduct.htm";
        } else {
            return "error";
        }
    }
    
    @RequestMapping(value = "/getAllUser")
    public ModelAndView getAllUser() {
        ModelAndView model = new ModelAndView("../backend/listUser");
        List<Account> listUser = acModel.getAllUser();
        model.addObject("listUser", listUser);

        return model;
    }

    @RequestMapping(value = "/searchProduct")
    public ModelAndView searchProduct(String searchName) {
        ModelAndView model = new ModelAndView("../backend/listProduct");
        List<Product> listPro = proModel.searchProduct(searchName);
        model.addObject("listProduct", listPro);
        return model;
    }

    @RequestMapping(value = "/searchCatalog")
    public ModelAndView searchCatalog(String searchName) {
        ModelAndView model = new ModelAndView("../backend/listCatalog");
        List<Catalog> listCa = caModel.searchCatalog(searchName);
        model.addObject("listCatalog", listCa);

        return model;

    }
}
