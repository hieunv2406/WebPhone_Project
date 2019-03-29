package org.apache.jsp.jsp.frontend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Login V4</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"../jsp/backend/login/images/icons/favicon.ico\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../jsp/backend/login/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../jsp/backend/login/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../jsp/backend/login/fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../jsp/backend/login/vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../jsp/backend/login/vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../jsp/backend/login/vendor/animsition/css/animsition.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../jsp/backend/login/vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../jsp/backend/login/vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../jsp/backend/login/css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../jsp/backend/login/css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<div class=\"limiter\">\n");
      out.write("\t\t<div class=\"container-login100\" style=\"background-image: url('../jsp/backend/login/images/bg-01.jpg');\">\n");
      out.write("\t\t\t<div class=\"wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54\">\n");
      out.write("                            <form class=\"login100-form validate-form\" action=\"login.htm\" method=\"post\">\n");
      out.write("\t\t\t\t\t<span class=\"login100-form-title p-b-49\">\n");
      out.write("\t\t\t\t\t\tLogin\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input m-b-23\" data-validate = \"Username is reauired\">\n");
      out.write("\t\t\t\t\t\t<span class=\"label-input100\">Username</span>\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"username\" placeholder=\"Type your username\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\" data-symbol=\"&#xf206;\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate=\"Password is required\">\n");
      out.write("\t\t\t\t\t\t<span class=\"label-input100\">Password</span>\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"password\" name=\"password\" placeholder=\"Type your password\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\" data-symbol=\"&#xf190;\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"text-right p-t-8 p-b-31\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\tForgot password?\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"container-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrap-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login100-form-bgbtn\"></div>\n");
      out.write("                                                        <button class=\"login100-form-btn\" type=\"submit\" name=\"submit\">\n");
      out.write("\t\t\t\t\t\t\t\tLogin\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"txt1 text-center p-t-54 p-b-20\">\n");
      out.write("\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\tOr Sign Up Using\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"flex-c-m\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"login100-social-item bg1\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-facebook\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"login100-social-item bg2\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-twitter\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"login100-social-item bg3\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-google\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"flex-col-c p-t-155\">\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1 p-b-17\">\n");
      out.write("\t\t\t\t\t\t\tOr Sign Up Using\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"txt2\">\n");
      out.write("\t\t\t\t\t\t\tSign Up\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<div id=\"dropDownSelect1\"></div>\n");
      out.write("\t\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../jsp/backend/login/vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../jsp/backend/login/vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../jsp/backend/login/vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"../jsp/backend/login/vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../jsp/backend/login/vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../jsp/backend/login/vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("\t<script src=\"../jsp/backend/login/vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../jsp/backend/login/vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../jsp/backend/login/js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
}
