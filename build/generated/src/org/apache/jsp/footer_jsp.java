package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\t  <!-- /.container -->\r\n");
      out.write("</section>\r\n");
      out.write("\t<!-- end section: team -->\r\n");
      out.write("\t<!-- section: services -->\r\n");
      out.write("<section id=\"services\" class=\"section orange\">\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("\t<!-- end section: services -->\r\n");
      out.write("\t<!-- section: works -->\r\n");
      out.write("<section id=\"works\" class=\"section\"></section>\r\n");
      out.write("\t<!-- spacer section -->\r\n");
      out.write("\t<section class=\"spacer bg3\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"span12 aligncenter flyLeft\">\r\n");
      out.write("\t\t\t\t\t<blockquote class=\"large\">\r\n");
      out.write("\t\t\t\t\t\tWe are an established and trusted web agency with a reputation for commitment and high integrity\r\n");
      out.write("\t\t\t\t\t</blockquote>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"span12 aligncenter flyRight\">\r\n");
      out.write("\t\t\t\t\t<i class=\"icon-rocket icon-10x\"></i>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- end spacer section -->\r\n");
      out.write("\t<!-- section: blog -->\r\n");
      out.write("<section id=\"blog\" class=\"section\"></section>\r\n");
      out.write("\r\n");
      out.write("\t<!-- end spacer section -->\r\n");
      out.write("\t<!-- section: contact -->\r\n");
      out.write("<section id=\"contact\" class=\"section green\"></section>\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"span6 offset3\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"social-networks\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-circled icon-bgdark icon-instagram icon-2x\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-circled icon-bgdark icon-twitter icon-2x\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-circled icon-bgdark icon-dribbble icon-2x\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-circled icon-bgdark icon-pinterest icon-2x\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<p class=\"copyright\">\r\n");
      out.write("\t\t\t\t\t\t&copy; Maxim Theme. All rights reserved.\r\n");
      out.write("\t\t\t\t  <div class=\"credits\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--\r\n");
      out.write("                All the links in the footer should remain intact.\r\n");
      out.write("                You can delete the links only if you purchased the pro version.\r\n");
      out.write("                Licensing information: https://bootstrapmade.com/license/\r\n");
      out.write("                Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Maxim\r\n");
      out.write("              -->\r\n");
      out.write("\t\t\t\t\t\t\tDesigned by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- ./container -->\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<a href=\"#\" class=\"scrollup\"><i class=\"icon-angle-up icon-square icon-bgdark icon-2x\"></i></a>\r\n");
      out.write("\t<script src=\"js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.scrollTo.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.nav.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.localScroll.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("\t<script src=\"js/isotope.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("\t<script src=\"js/inview.js\"></script>\r\n");
      out.write("\t<script src=\"js/animate.js\"></script>\r\n");
      out.write("\t<script src=\"js/custom.js\"></script>\r\n");
      out.write("\t<script src=\"contactform/contactform.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
