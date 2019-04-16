package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginftr_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\t  <!-- /.container --></\n");
      out.write("\t<!-- end section: team -->\n");
      out.write("\t<!-- section: services -->\n");
      out.write("\n");
      out.write("\t<!-- end section: services -->\n");
      out.write("\t<!-- section: works -->\n");
      out.write("\n");
      out.write("\t<!-- end spacer section -->\n");
      out.write("\t<!-- section: blog -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- end spacer section -->\n");
      out.write("\t<!-- section: contact -->\n");
      out.write("<section id=\"contact\" class=\"section green\"></section>\n");
      out.write("\t<footer>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"span6 offset3\">\n");
      out.write("\t\t\t\t\t<ul class=\"social-networks\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-circled icon-bgdark icon-instagram icon-2x\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-circled icon-bgdark icon-twitter icon-2x\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-circled icon-bgdark icon-dribbble icon-2x\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-circled icon-bgdark icon-pinterest icon-2x\"></i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<p class=\"copyright\">\n");
      out.write("\t\t\t\t\t\t&copy; FRODO\n");
      out.write("\t\t\t\t  <div class=\"credits\">\n");
      out.write("\t\t\t\t\t\t\t<!--\n");
      out.write("                All the links in the footer should remain intact.\n");
      out.write("                You can delete the links only if you purchased the pro version.\n");
      out.write("                Licensing information: https://bootstrapmade.com/license/\n");
      out.write("                Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Maxim\n");
      out.write("              -->\n");
      out.write("\t\t\t\t\t\t\tDesigned by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- ./container -->\n");
      out.write("\t</footer>\n");
      out.write("\t<a href=\"#\" class=\"scrollup\"><i class=\"icon-angle-up icon-square icon-bgdark icon-2x\"></i></a>\n");
      out.write("\t<script src=\"js/jquery.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.scrollTo.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.nav.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.localScroll.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("\t<script src=\"js/isotope.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("\t<script src=\"js/inview.js\"></script>\n");
      out.write("\t<script src=\"js/animate.js\"></script>\n");
      out.write("\t<script src=\"js/custom.js\"></script>\n");
      out.write("\t<script src=\"contactform/contactform.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
