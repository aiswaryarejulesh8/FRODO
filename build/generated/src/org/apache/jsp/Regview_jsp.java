package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import database.dbcon;

public final class Regview_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String id=request.getParameter("id");
      dbcon db=new dbcon();
      Connection con=db.getcon();
      Statement st=con.createStatement();
      String uid="";
      ResultSet rs= st.executeQuery("Select * from user_reg where id='"+id+"'");
      if(rs.next())
      {
          uid=rs.getString("uid");

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\r\n");
      out.write("  <table width=\"200\" border=\"1\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Name:</td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("              <input type=\"text\" name=\"textfield\" value=\"");
      out.print( rs.getString(2) );
      out.write("\" />\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>DOB:</td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("              <input type=\"text\" name=\"textfield2\" value=\"");
      out.print( rs.getString(3) );
      out.write("\" />\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Gender:</td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("        <input type=\"text\" name=\"textfield3\" value=\"");
      out.print( rs.getString(4) );
      out.write("\" />\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Housename:</td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("        <input type=\"text\" name=\"textfield4\" value=\"");
      out.print( rs.getString(5) );
      out.write("\" />\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>PLace:</td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("        <input type=\"text\" name=\"textfield5\" value=\"");
      out.print( rs.getString(6) );
      out.write("\" />\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>PIn:</td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("        <input type=\"text\" name=\"textfield6\" value=\"");
      out.print( rs.getString(7) );
      out.write("\" />\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>District:</td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("        <input type=\"text\" name=\"textfield7\"value=\"");
      out.print( rs.getString(8) );
      out.write("\" />\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Branch:</td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("        <input type=\"text\" name=\"textfield8\" value=\"");
      out.print( rs.getString(9) );
      out.write("\" />\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Contact:</td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("        <input type=\"text\" name=\"textfield9\" value=\"");
      out.print( rs.getString(10) );
      out.write("\" />\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Profile:</td>\r\n");
      out.write("      <td><img name=\"\" src=\"photos/");
      out.print( rs.getString(11) );
      out.write("\" width=\"54\" height=\"46\" alt=\"\"  /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Email:</td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("        <input type=\"text\" name=\"textfield10\" value=\"");
      out.print( rs.getString(12) );
      out.write("\" />\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td><label>\r\n");
      out.write("        <input type=\"submit\" name=\"Submit\" value=\"Approve\" />\r\n");
      out.write("      </label></td>\r\n");
      out.write("      <td><label>\r\n");
      out.write("        <input type=\"submit\" name=\"Submit2\" value=\"Reject\" />\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("    ");

      }
    
      out.write("\r\n");
      out.write("</form>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");

      if(request.getParameter("Submit")!=null)
      {
          st.executeUpdate("UPDATE `user_reg` SET `status`='Approved' WHERE `id`='"+id+"'");
          st.executeUpdate("update login set type='user'where id='"+uid+"'");
          
          
          response.sendRedirect("Home.jsp");
      }
      
      if(request.getParameter("Submit2")!=null)
      {
         st.executeUpdate("UPDATE `user_reg` SET `status`='Reject' WHERE `id`='"+id+"'");
         response.sendRedirect("Home.jsp"); 
      }

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
