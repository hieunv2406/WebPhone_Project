package org.apache.jsp.jsp.frontend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../frontend/home/head.jsp", out, false);
      out.write("\n");
      out.write("        <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../frontend/home/header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../frontend/home/menu.jsp", out, false);
      out.write("\n");
      out.write("            <!--/single_page-->\n");
      out.write("            <!-- /banner_bottom_agile_info -->\n");
      out.write("            <div class=\"page-head_agile_info_w3l\">\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h3>Single <span>Page </span></h3>\n");
      out.write("                    <!--/w3_short-->\n");
      out.write("                    <div class=\"services-breadcrumb\">\n");
      out.write("                        <div class=\"agile_inner_breadcrumb\">\n");
      out.write("\n");
      out.write("                            <ul class=\"w3_short\">\n");
      out.write("                                <li><a href=\"index.html\">Home</a><i>|</i></li>\n");
      out.write("                                <li>");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--//w3_short-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"banner-bootom-w3-agileits\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"col-md-4 single-right-left \">\n");
      out.write("                            <div class=\"grid images_3_of_2\">\n");
      out.write("                                <div class=\"flexslider\">\n");
      out.write("                                    <ul class=\"slides\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-8 single-right-left simpleCart_shelfItem\">\n");
      out.write("                            <h3 class=\"mb-3\">");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write(" - ");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write(" - ");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("</h3>\n");
      out.write("                        <p class=\"mb-3\">\n");
      out.write("                            <span class=\"item_price\">");
      if (_jspx_meth_c_out_4(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("                            <del class=\"mx-2 font-weight-light\">");
      if (_jspx_meth_c_out_5(_jspx_page_context))
        return;
      out.write("</del>\n");
      out.write("<!--                            <label>Free delivery</label>-->\n");
      out.write("                        </p>\n");
      out.write("                        <div class=\"single-infoagile\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"mb-3\">\n");
      out.write("                                   Tặng: Cường lực + Ốp Lưng + Tai nghe khi mua gói BHV.\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"mb-3\">\n");
      out.write("                                   Giảm: 100K áp dụng cho HS-SV.\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"mb-3\">\n");
      out.write("                                    Giao hàng miễn phí: trung tâm Hà Nội.\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"mb-3\">\n");
      out.write("                                    Tặng voucher 50K khi mua Phụ Kiện.\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-single-w3l\">\n");
      out.write("                            <p class=\"my-3\">\n");
      out.write("                                <i class=\"far fa-hand-point-right mr-2\"></i>\n");
      out.write("                                <label>12 Tháng </label> Bảo Hành Chính Hãng</p>\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"mb-1\">\n");
      out.write("                                    3 GB RAM | 16 GB ROM | Expandable Upto 256 GB\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"mb-1\">\n");
      out.write("                                    5.5 inch Full HD Display\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"mb-1\">\n");
      out.write("                                    13MP Rear Camera | 8MP Front Camera\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"mb-1\">\n");
      out.write("                                    3300 mAh Battery\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"mb-1\">\n");
      out.write("                                    Exynos 7870 Octa Core 1.6GHz Processor\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <p class=\"my-sm-4 my-3\">\n");
      out.write("                                <i class=\"fas fa-retweet mr-3\"></i>Net banking & Credit/ Debit/ ATM card\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"occasion-cart\">\n");
      out.write("                            <div class=\"snipcart-details top_brand_home_details item_add single-item hvr-outline-out\">\n");
      out.write("                                <form action=\"");
      out.print(request.getContextPath());
      out.write("/cartController/addCart.htm?productID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleProduct.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\">\n");
      out.write("                                    <fieldset>\n");
      out.write("                                        <input type=\"submit\" name=\"submit\" value=\"Add to cart\" class=\"button\" />\n");
      out.write("                                    </fieldset>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                    <!-- /new_arrivals --> \n");
      out.write("                    <div class=\"responsive_tabs_agileits\"> \n");
      out.write("                        <div id=\"horizontalTab\">\n");
      out.write("                            <ul class=\"resp-tabs-list\">\n");
      out.write("                                <li>Description</li>\n");
      out.write("                                <li>Reviews</li>\n");
      out.write("                                <li>Information</li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"resp-tabs-container\">\n");
      out.write("                                <!--/tab_one-->\n");
      out.write("                                <div class=\"tab1\">\n");
      out.write("\n");
      out.write("                                    <div class=\"single_page_agile_its_w3ls\">\n");
      out.write("                                        <h6>Lorem ipsum dolor sit amet</h6>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elPellentesque vehicula augue eget nisl ullamcorper, molestie blandit ipsum auctor. Mauris volutpat augue dolor.Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut lab ore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco. labore et dolore magna aliqua.</p>\n");
      out.write("                                        <p class=\"w3ls_para\">Lorem ipsum dolor sit amet, consectetur adipisicing elPellentesque vehicula augue eget nisl ullamcorper, molestie blandit ipsum auctor. Mauris volutpat augue dolor.Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut lab ore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco. labore et dolore magna aliqua.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!--//tab_one-->\n");
      out.write("                                <div class=\"tab2\">\n");
      out.write("\n");
      out.write("                                    <div class=\"single_page_agile_its_w3ls\">\n");
      out.write("                                        <div class=\"bootstrap-tab-text-grids\">\n");
      out.write("                                            <div class=\"bootstrap-tab-text-grid\">\n");
      out.write("                                                <div class=\"bootstrap-tab-text-grid-left\">\n");
      out.write("                                                    <img src=\"../jsp/frontend/temp/images/t1.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"bootstrap-tab-text-grid-right\">\n");
      out.write("                                                    <ul>\n");
      out.write("                                                        <li><a href=\"#\">Admin</a></li>\n");
      out.write("                                                        <li><a href=\"#\"><i class=\"fa fa-reply-all\" aria-hidden=\"true\"></i> Reply</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elPellentesque vehicula augue eget.Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis \n");
      out.write("                                                        suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem \n");
      out.write("                                                        vel eum iure reprehenderit.</p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clearfix\"> </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"add-review\">\n");
      out.write("                                                <h4>add a review</h4>\n");
      out.write("                                                <form action=\"#\" method=\"post\">\n");
      out.write("                                                    <input type=\"text\" name=\"Name\" required=\"Name\">\n");
      out.write("                                                    <input type=\"email\" name=\"Email\" required=\"Email\"> \n");
      out.write("                                                    <textarea name=\"Message\" required=\"\"></textarea>\n");
      out.write("                                                    <input type=\"submit\" value=\"SEND\">\n");
      out.write("                                                </form>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"tab3\">\n");
      out.write("\n");
      out.write("                                    <div class=\"single_page_agile_its_w3ls\">\n");
      out.write("                                        <h6>Big Wing Sneakers (Navy)</h6>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elPellentesque vehicula augue eget nisl ullamcorper, molestie blandit ipsum auctor. Mauris volutpat augue dolor.Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut lab ore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco. labore et dolore magna aliqua.</p>\n");
      out.write("                                        <p class=\"w3ls_para\">Lorem ipsum dolor sit amet, consectetur adipisicing elPellentesque vehicula augue eget nisl ullamcorper, molestie blandit ipsum auctor. Mauris volutpat augue dolor.Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut lab ore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco. labore et dolore magna aliqua.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\t\n");
      out.write("                    </div>\n");
      out.write("                    <!-- //new_arrivals --> \n");
      out.write("                    <!--/slider_owl-->\n");
      out.write("\n");
      out.write("                    <div class=\"w3_agile_latest_arrivals\">\n");
      out.write("                        <h3 class=\"wthree_text_info\">Featured <span>Arrivals</span></h3>\t\n");
      out.write("                        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_1.setParent(null);
      _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_1.setVar("pro");
      int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                        <div class=\"col-md-3 product-men single\">\n");
            out.write("                            <div class=\"men-pro-item simpleCart_shelfItem\">\n");
            out.write("                                <div class=\"men-thumb-item\">\n");
            out.write("                                    <img src=\"../jsp/frontend/temp/images/product_Images/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.imageURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\" class=\"pro-image-front\" width=\"200\" height=\"235\">\n");
            out.write("                                    <img src=\"../jsp/frontend/temp/images/product_Images/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.imageURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\" class=\"pro-image-back\" width=\"200\" height=\"235\">\n");
            out.write("                                    <div class=\"men-cart-pro\">\n");
            out.write("                                        <div class=\"inner-men-cart-pro\">\n");
            out.write("                                            <a href=\"getProductByID.htm?productID=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"link-product-add-cart\">Chi tiết</a>\n");
            out.write("                                        </div>\n");
            out.write("                                    </div>\n");
            out.write("                                    <span class=\"product-new-top\">New</span>\n");
            out.write("\n");
            out.write("                                </div>\n");
            out.write("                                <div class=\"item-info-product \">\n");
            out.write("                                    <h4><a href=\"getProductByID.htm?productID=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a></h4>\n");
            out.write("                                    <div class=\"info-product-price\">\n");
            out.write("                                        <span class=\"item_price\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.price-pro.discont}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</span>\n");
            out.write("                                        <del>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</del>\n");
            out.write("                                    </div>\n");
            out.write("                                    <div class=\"snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2\">\n");
            out.write("                                        <form action=\"");
            out.print(request.getContextPath());
            out.write("/cartController/addCart.htm?productID=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" method=\"post\">\n");
            out.write("                                            <fieldset>\n");
            out.write("                                               \n");
            out.write("                                                <input type=\"submit\" name=\"submit\" value=\"Thêm giỏ hàng\" class=\"button\">\n");
            out.write("                                            </fieldset>\n");
            out.write("                                        </form>\n");
            out.write("                                    </div>\n");
            out.write("\n");
            out.write("                                </div>\n");
            out.write("                            </div>\n");
            out.write("                        </div>\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
      }
      out.write("\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                        <!--//slider_owl-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--//single_page-->\n");
      out.write("            <!-- footer -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../frontend/home/footer.jsp", out, false);
      out.write("\n");
      out.write("            <!-- //footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleProduct.productName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listImg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("img");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <li data-thumb=\"../jsp/frontend/temp/images/product_Images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${img.imgURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >\n");
          out.write("                                            <div class=\"thumb-image\"> <img src=\"../jsp/frontend/temp/images/product_Images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${img.imgURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
          out.write("                                        </li>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleProduct.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleProduct.memory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleProduct.color}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent(null);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleProduct.price-singleProduct.discount}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent(null);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleProduct.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }
}
