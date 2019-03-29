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
import webphone.entity.Catalog;
import webphone.entity.Product;
import webphone.entity.ProductDetails;
import webphone.entity.ProductImg;
import webphone.model.CatalogModel;
import webphone.model.ProductModel;

/**
 *
 * @author hieuk
 */
@Controller
@RequestMapping(value = "/productController")
public class ProductController {

    private ProductModel proModel;
    private CatalogModel caModel;

    public ProductController() {
        proModel = new ProductModel();
        caModel = new CatalogModel();
    }

    @RequestMapping(value = "/getAll")
    public ModelAndView getAllProduct() {
        ModelAndView model = new ModelAndView("index");
        List<Product> listProduct = proModel.getAllProduct();
        List<Catalog> listCatalogSP = caModel.getAllCatalogBySmartPhone();
        List<Catalog> listCatalogTB = caModel.getAllCatalogByTablet();
        List<Catalog> listCatalogAC = caModel.getAllCatalogByAccessories();
        List<Product> listNew = proModel.getNewProduct();
        List<Product> listSale = proModel.getSaleProduct();
        model.addObject("listProduct", listProduct);
        model.addObject("listCatalogSP", listCatalogSP);
        model.addObject("listCatalogTB", listCatalogTB);
        model.addObject("listCatalogAC", listCatalogAC);
        model.addObject("listNew", listNew);
        model.addObject("listSale", listSale);
        return model;
    }

//Lấy sản phẩm theo ID
    @RequestMapping(value = "/getProductByID")
    public ModelAndView getProductByID(String productID) {
        ModelAndView model = new ModelAndView("single");
        Product singleProduct = proModel.getProductById(productID);
        ProductDetails productDetails = proModel.getDetailsById(productID);
        List<ProductImg> listImg = (List<ProductImg>) proModel.getProductImgById(productID);
        List<Product> listNew = proModel.getNewProduct();
        List<Catalog> listCatalogSP = caModel.getAllCatalogBySmartPhone();
        List<Catalog> listCatalogTB = caModel.getAllCatalogByTablet();
        List<Catalog> listCatalogAC = caModel.getAllCatalogByAccessories();
        model.addObject("singleProduct", singleProduct);
        model.addObject("productDetails", productDetails);
        model.addObject("listImg", listImg);

        model.addObject("listNew", listNew);
        model.addObject("listCatalogSP", listCatalogSP);
        model.addObject("listCatalogTB", listCatalogTB);
        model.addObject("listCatalogAC", listCatalogAC);

        return model;
    }

//Lấy sản phẩm theo catalogID
    @RequestMapping(value = "/getProductByCatalogID")
    public ModelAndView getProductByCatalogID(String catalogID) {
        ModelAndView model = new ModelAndView("listproductBC");
        List<Product> listProductBC = (List<Product>) proModel.getProductByCatalogId(catalogID);

        List<Catalog> listCatalogSP = caModel.getAllCatalogBySmartPhone();
        List<Catalog> listCatalogTB = caModel.getAllCatalogByTablet();
        List<Catalog> listCatalogAC = caModel.getAllCatalogByAccessories();

        model.addObject("listProductBC", listProductBC);

        model.addObject("listCatalogSP", listCatalogSP);
        model.addObject("listCatalogTB", listCatalogTB);
        model.addObject("listCatalogAC", listCatalogAC);
        return model;
    }

    @RequestMapping(value = "/searchProduct")
    public ModelAndView searchProduct(String searchName) {
        ModelAndView model = new ModelAndView("listproductBC");
        List<Product> listPro = proModel.searchProduct(searchName);
        model.addObject("listProductBC", listPro);
        return model;
    }
}
