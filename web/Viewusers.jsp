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

<body>
    <jsp:include page="header.jsp"/>
<form id="form1" name="form1" method="post" action="">
  <table width="200" border="1">
    <tr>
      <td>Name</td>
      <td>House name </td>
      <td>Place</td>
      <td>District</td>
      <td>Branch name  </td>
      <td>email</td>
      <td>&nbsp;</td>
    </tr>
      <%
      dbcon db=new dbcon();
      Connection con=db.getcon();
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from user_reg where status='pending'");
      while(rs.next())
      {
      %>
    <tr>
        <td><%= rs.getString(2) %></td>
      <td><%= rs.getString(5) %></td>
      <td><%= rs.getString(6) %></td>
      <td><%= rs.getString(8) %></td>
      <td><%= rs.getString(9) %></td>
      <td><%= rs.getString(12) %></td>
      <td><p><a href="Regview.jsp?id=<%= rs.getString(1) %>">View</a></p>
      </td>
    </tr>
      <%
      }
      
      %>
  </table>
</form>
  <jsp:include page="footer.jsp"/>
</body>
</html>
