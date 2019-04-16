package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<title>FRODO</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<meta name=\"description\" content=\"\">\r\n");
      out.write("\t<meta name=\"author\" content=\"\">\r\n");
      out.write("\t<link href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"color/default.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"img/favicon.ico\">\r\n");
      out.write("\t<!-- =======================================================\r\n");
      out.write("    Theme Name: Maxim\r\n");
      out.write("    Theme URL: https://bootstrapmade.com/maxim-free-onepage-bootstrap-theme/\r\n");
      out.write("    Author: BootstrapMade.com\r\n");
      out.write("    Author URL: https://bootstrapmade.com\r\n");
      out.write("\t======================================================= -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- navbar -->\r\n");
      out.write("\t<div class=\"navbar-wrapper\">\r\n");
      out.write("\t\t<div class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("\t\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<!-- Responsive navbar -->\r\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\"><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<h1 class=\"brand\"><a href=\"index.html\">FRODO</a></h1>\r\n");
      out.write("\t\t\t\t\t<!-- navigation -->\r\n");
      out.write("\t\t\t\t\t<nav class=\"pull-right nav-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"menu-main\" class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"Viewusers.jsp\">View User</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"Activateuser.jsp\">Activate User</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"BlockList.jsp\">Block List</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"UserRequest.jsp\">User Request</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"Withdrawal.jsp\">Withdrawal</a></li>\r\n");
      out.write("                                                        <li><a href=\"Deposit.jsp\">Deposit</a></li>\r\n");
      out.write("                                                        <li><a href=\"Login.jsp\">Logout</a></li>\r\n");
      out.write("                                                        \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Header area -->\r\n");
      out.write("\t<div id=\"header-wrapper\" class=\"header-slider\">\r\n");
      out.write("\t\t<header class=\"clearfix\">\r\n");
      out.write("\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"span12\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"main-flexslider\" class=\"flexslider\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"slides\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"home-slide-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>creative</strong> and passion\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"home-slide-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tEat and drink <strong>design</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"home-slide-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tWe loves <strong>simplicity</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- end slider -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- end spacer section -->\r\n");
      out.write("\t<!-- section: team -->\r\n");
      out.write("\t<section id=\"about\" class=\"section\">");
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
