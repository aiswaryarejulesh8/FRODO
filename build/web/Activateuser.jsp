<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="database.dbcon"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>activateuser</title>
</head>
<jsp:include page="header.jsp"/>
<body>
    
   
<form id="form1" name="form1" method="post" action="">
  <table width="200" border="1">
    <tr>
      <td>Name</td>
      <td>House name</td>
      <td>Place</td>
      <td>District</td>
      <td>Branch name </td>
      <td>Email</td>
    </tr>
       <%
        dbcon db=new dbcon();
        Connection con=db.getcon();
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery("Select * from user_reg where status='approved'");
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
    </tr>
     <%
        }
    %>
  </table>
   
</form>

</body>
<jsp:include page="footer.jsp"/>
</html>
