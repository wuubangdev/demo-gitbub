/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.96
 * Generated at: 2024-03-25 08:24:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Customer;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1711343122122L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.Customer");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>BookStrore</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<div id=\"container\" class=\"container\" style=\"width: 100%\">\r\n");
      out.write("	<!-- Page content -->\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<!-- Menu left -->\r\n");
      out.write("			<div class=\"col-lg-3\" style=\"padding-top: 16px\">\r\n");
      out.write("				<div class=\"list-group\">\r\n");
      out.write("				  <a href=\"#\" class=\"list-group-item list-group-item-action\" aria-current=\"true\">Thời trang nam</a>\r\n");
      out.write("				  <a href=\"#\" class=\"list-group-item list-group-item-action\">Thời trang nữ</a>\r\n");
      out.write("				  <a href=\"#\" class=\"list-group-item list-group-item-action\">Thời trang dành cho bé</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- End Menu left -->\r\n");
      out.write("			\r\n");
      out.write("			<!-- Slider and product -->\r\n");
      out.write("			<div class=\"col-lg-9 pt-16\" style=\"padding-top: 16px \">\r\n");
      out.write("				<!-- Slider -->\r\n");
      out.write("					<div id=\"carouselExampleIndicators\" class=\"carousel slide\">\r\n");
      out.write("					  <div class=\"carousel-indicators\">\r\n");
      out.write("					    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n");
      out.write("					    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("					    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("					  </div>\r\n");
      out.write("					  <div class=\"carousel-inner\">\r\n");
      out.write("					    <div class=\"carousel-item active\">\r\n");
      out.write("					      <img src=\"img/slider/slider_1.png\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("					    </div>\r\n");
      out.write("					    <div class=\"carousel-item\">\r\n");
      out.write("					      <img src=\"img/slider/slider_2.png\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("					    </div>\r\n");
      out.write("					    <div class=\"carousel-item\">\r\n");
      out.write("					      <img src=\"img/slider/slider_3.png\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("					    </div>\r\n");
      out.write("					  </div>\r\n");
      out.write("					  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\r\n");
      out.write("					    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("					    <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("					  </button>\r\n");
      out.write("					  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\r\n");
      out.write("					    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("					    <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("					  </button>\r\n");
      out.write("					</div>\r\n");
      out.write("				<!-- End Slider -->\r\n");
      out.write("				<!-- Product -->\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-lg-3 col-md-6 col-sm-12 mb-3\" style=\"margin-top: 12px\">\r\n");
      out.write("						<div class=\"card\" style=\"width: 100%;\">\r\n");
      out.write("						  <img src=\"img/product/pro1.png\" class=\"card-img-top\">\r\n");
      out.write("						  <div class=\"card-body\">\r\n");
      out.write("						    <h5 class=\"card-title\">Áo Sơ Mi</h5>\r\n");
      out.write("						    <h5 class=\"card-title\">50.000 VNĐ</h5>\r\n");
      out.write("						    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("						    <a href=\"#\" class=\"btn btn-primary\">Mua ngay</a>\r\n");
      out.write("						  </div>\r\n");
      out.write("						</div>					\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-6 col-sm-12 mb-3\" style=\"margin-top: 12px\">\r\n");
      out.write("						<div class=\"card\" style=\"width: 100%;\">\r\n");
      out.write("						  <img src=\"img/product/pro3.png\" class=\"card-img-top\">\r\n");
      out.write("						  <div class=\"card-body\">\r\n");
      out.write("						    <h5 class=\"card-title\">Áo Sơ Mi</h5>\r\n");
      out.write("						    <h5 class=\"card-title\">50.000 VNĐ</h5>\r\n");
      out.write("						    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("						    <a href=\"#\" class=\"btn btn-primary\">Mua ngay</a>\r\n");
      out.write("						  </div>\r\n");
      out.write("						</div>					\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-6 col-sm-12 mb-3\" style=\"margin-top: 12px\">\r\n");
      out.write("						<div class=\"card\" style=\"width: 100%;\">\r\n");
      out.write("						  <img src=\"img/product/pro2.png\" class=\"card-img-top\">\r\n");
      out.write("						  <div class=\"card-body\">\r\n");
      out.write("						    <h5 class=\"card-title\">Áo Sơ Mi</h5>\r\n");
      out.write("						    <h5 class=\"card-title\">50.000 VNĐ</h5>\r\n");
      out.write("						    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("						    <a href=\"#\" class=\"btn btn-primary\">Mua ngay</a>\r\n");
      out.write("						  </div>\r\n");
      out.write("						</div>					\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-6 col-sm-12 mb-3\" style=\"margin-top: 12px\">\r\n");
      out.write("						<div class=\"card\" style=\"width: 100%;\">\r\n");
      out.write("						  <img src=\"img/product/pro3.png\" class=\"card-img-top\">\r\n");
      out.write("						  <div class=\"card-body\">\r\n");
      out.write("						    <h5 class=\"card-title\">Áo Sơ Mi</h5>\r\n");
      out.write("						    <h5 class=\"card-title\">50.000 VNĐ</h5>\r\n");
      out.write("						    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("						    <a href=\"#\" class=\"btn btn-primary\">Mua ngay</a>\r\n");
      out.write("						  </div>\r\n");
      out.write("						</div>					\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-6 col-sm-12 mb-3\" style=\"margin-top: 12px\">\r\n");
      out.write("						<div class=\"card\" style=\"width: 100%;\">\r\n");
      out.write("						  <img src=\"img/product/pro2.png\" class=\"card-img-top\">\r\n");
      out.write("						  <div class=\"card-body\">\r\n");
      out.write("						    <h5 class=\"card-title\">Áo Sơ Mi</h5>\r\n");
      out.write("						    <h5 class=\"card-title\">50.000 VNĐ</h5>\r\n");
      out.write("						    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("						    <a href=\"#\" class=\"btn btn-primary\">Mua ngay</a>\r\n");
      out.write("						  </div>\r\n");
      out.write("						</div>					\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-6 col-sm-12 mb-3\" style=\"margin-top: 12px\">\r\n");
      out.write("						<div class=\"card\" style=\"width: 100%;\">\r\n");
      out.write("						  <img src=\"img/product/pro2.png\" class=\"card-img-top\">\r\n");
      out.write("						  <div class=\"card-body\">\r\n");
      out.write("						    <h5 class=\"card-title\">Áo Sơ Mi</h5>\r\n");
      out.write("						    <h5 class=\"card-title\">50.000 VNĐ</h5>\r\n");
      out.write("						    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("						    <a href=\"#\" class=\"btn btn-primary\">Mua ngay</a>\r\n");
      out.write("						  </div>\r\n");
      out.write("						</div>					\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-6 col-sm-12 mb-3\" style=\"margin-top: 12px\">\r\n");
      out.write("						<div class=\"card\" style=\"width: 100%;\">\r\n");
      out.write("						  <img src=\"img/product/pro2.png\" class=\"card-img-top\">\r\n");
      out.write("						  <div class=\"card-body\">\r\n");
      out.write("						    <h5 class=\"card-title\">Áo Sơ Mi</h5>\r\n");
      out.write("						    <h5 class=\"card-title\">50.000 VNĐ</h5>\r\n");
      out.write("						    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("						    <a href=\"#\" class=\"btn btn-primary\">Mua ngay</a>\r\n");
      out.write("						  </div>\r\n");
      out.write("						</div>					\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-6 col-sm-12 mb-3\" style=\"margin-top: 12px\">\r\n");
      out.write("						<div class=\"card\" style=\"width: 100%;\">\r\n");
      out.write("						  <img src=\"img/product/pro2.png\" class=\"card-img-top\">\r\n");
      out.write("						  <div class=\"card-body\">\r\n");
      out.write("						    <h5 class=\"card-title\">Áo Sơ Mi</h5>\r\n");
      out.write("						    <h5 class=\"card-title\">50.000 VNĐ</h5>\r\n");
      out.write("						    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("						    <a href=\"#\" class=\"btn btn-primary\">Mua ngay</a>\r\n");
      out.write("						  </div>\r\n");
      out.write("						</div>					\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- End Product -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- End Slider and product -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- End Page content -->\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!-- Page footer -->\r\n");
      out.write("	<footer class=\"py-3 my-4 border-top\">\r\n");
      out.write("	    <ul class=\"nav justify-content-center border-bottom pb-3 mb-3\">\r\n");
      out.write("	      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-body-secondary\">Home</a></li>\r\n");
      out.write("	      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-body-secondary\">Features</a></li>\r\n");
      out.write("	      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-body-secondary\">Pricing</a></li>\r\n");
      out.write("	      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-body-secondary\">FAQs</a></li>\r\n");
      out.write("	      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-body-secondary\">About</a></li>\r\n");
      out.write("	    </ul>\r\n");
      out.write("	    <p class=\"text-center text-body-secondary\">© 2024 Company, Inc</p>\r\n");
      out.write(" 	 </footer>	\r\n");
      out.write("	<!-- End Page footer -->");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}