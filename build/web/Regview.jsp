<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="database.dbcon"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>
<%
    String id=request.getParameter("id");
      dbcon db=new dbcon();
      Connection con=db.getcon();
      Statement st=con.createStatement();
      String uid="";
      ResultSet rs= st.executeQuery("Select * from user_reg where id='"+id+"'");
      if(rs.next())
      {
          uid=rs.getString("uid");
%>
<body>
    <jsp:include page="header.jsp"/>
<form id="form1" name="form1" method="post" action="">
  <table width="200" border="1">
    <tr>
      <td>Name:</td>
      <td><label>
              <input type="text" name="textfield" value="<%= rs.getString(2) %>" />
      </label></td>
    </tr>
    <tr>
      <td>DOB:</td>
      <td><label>
              <input type="text" name="textfield2" value="<%= rs.getString(3) %>" />
      </label></td>
    </tr>
    <tr>
      <td>Gender:</td>
      <td><label>
        <input type="text" name="textfield3" value="<%= rs.getString(4) %>" />
      </label></td>
    </tr>
    <tr>
      <td>Housename:</td>
      <td><label>
        <input type="text" name="textfield4" value="<%= rs.getString(5) %>" />
      </label></td>
    </tr>
    <tr>
      <td>PLace:</td>
      <td><label>
        <input type="text" name="textfield5" value="<%= rs.getString(6) %>" />
      </label></td>
    </tr>
    <tr>
      <td>PIn:</td>
      <td><label>
        <input type="text" name="textfield6" value="<%= rs.getString(7) %>" />
      </label></td>
    </tr>
    <tr>
      <td>District:</td>
      <td><label>
        <input type="text" name="textfield7"value="<%= rs.getString(8) %>" />
      </label></td>
    </tr>
    <tr>
      <td>Branch:</td>
      <td><label>
        <input type="text" name="textfield8" value="<%= rs.getString(9) %>" />
      </label></td>
    </tr>
    <tr>
      <td>Contact:</td>
      <td><label>
        <input type="text" name="textfield9" value="<%= rs.getString(10) %>" />
      </label></td>
    </tr>
    <tr>
      <td>Profile:</td>
      <td><img name="" src="photos/<%= rs.getString(11) %>" width="54" height="46" alt=""  /></td>
    </tr>
    <tr>
      <td>Email:</td>
      <td><label>
        <input type="text" name="textfield10" value="<%= rs.getString(12) %>" />
      </label></td>
    </tr>
    <tr>
      <td><label>
        <input type="submit" name="Submit" value="Approve" />
      </label></td>
      <td><label>
        <input type="submit" name="Submit2" value="Reject" />
      </label></td>
    </tr>
  </table>
    <%
      }
    %>
</form>
<jsp:include page="footer.jsp"/>
</body>
</html>

<%
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
%>