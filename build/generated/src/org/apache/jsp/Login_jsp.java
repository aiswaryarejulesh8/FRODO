package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import database.dbcon;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "loginhdr.jsp", out, false);
      out.write("\r\n");
      out.write("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\r\n");
      out.write("  <table width=\"200\" border=\"1\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Username:</td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("        <input type=\"text\" name=\"textfield\" required/>\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Password:</td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("              <input type=\"password\" name=\"textfield2\" required />\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td colspan=\"2\"><label>\r\n");
      out.write("      <div align=\"center\">\r\n");
      out.write("        <input type=\"submit\" name=\"Submit\" value=\"Login\" />\r\n");
      out.write("      </div>\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  ");

      dbcon db=new dbcon();
      Connection con=db.getcon();
      Statement st=con.createStatement();
      if(request.getParameter("Submit")!=null)
      {
          String name= request.getParameter("textfield");
          String pass= request.getParameter("textfield2");
        ResultSet rs=  st.executeQuery("SELECT * FROM `login` WHERE `username`='"+name+"' AND `password`='"+pass+"'");
          if(rs.next())
          {
              response.sendRedirect("Home.jsp");
          }
          else
          {
              
      out.write("\r\n");
      out.write("              <script>\r\n");
      out.write("                  alert(\"invalid user\");\r\n");
      out.write("              </script>\r\n");
      out.write("              ");

          }
      }
  
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "loginftr.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
