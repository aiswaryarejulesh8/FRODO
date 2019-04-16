package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginhdr_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<title>FRODO</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t<meta name=\"author\" content=\"\">\n");
      out.write("\t<link href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"color/default.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"img/favicon.icon\">\n");
      out.write("\t<!-- =======================================================\n");
      out.write("    Theme Name: Maxim\n");
      out.write("    Theme URL: https://bootstrapmade.com/maxim-free-onepage-bootstrap-theme/\n");
      out.write("    Author: BootstrapMade.com\n");
      out.write("    Author URL: https://bootstrapmade.com\n");
      out.write("\t======================================================= -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<!-- navbar -->\n");
      out.write("\t<div class=\"navbar-wrapper\">\n");
      out.write("\t\t<div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("\t\t\t<div class=\"navbar-inner\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<!-- Responsive navbar -->\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\"><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<h1 class=\"brand\"><a href=\"index.html\">FRODO</a></h1>\n");
      out.write("\t\t\t\t\t<!-- navigation -->\n");
      out.write("\t\t\t\t\t<nav class=\"pull-right nav-collapse collapse\">\n");
      out.write("\t\t\t\t\t\t<ul id=\"menu-main\" class=\"nav\">\n");
      out.write("\t\t\t\t\t\t\t<li><a title=\"team\" href=\"#about\">HOME</a></li>\n");
      out.write("\t\t\t\t\t\t\t<!--<li><a title=\"services\" href=\"#services\">Services</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a title=\"works\" href=\"#works\">Works</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a title=\"blog\" href=\"#blog\">Blog</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a title=\"contact\" href=\"#contact\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"page.html\">Page</a></li>-->\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Header area -->\n");
      out.write("\t<div id=\"header-wrapper\" class=\"header-slider\">\n");
      out.write("\t\t<header class=\"clearfix\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t\t\t<div id=\"main-flexslider\" class=\"flexslider\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"slides\">\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"home-slide-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>creative</strong> and passion\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"home-slide-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tEat and drink <strong>design</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"home-slide-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tWe loves <strong>simplicity</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- end slider -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</header>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- end spacer section -->\n");
      out.write("\t<!-- section: team -->\n");
      out.write("\t");
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
