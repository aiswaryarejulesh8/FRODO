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
<jsp:include page="header.jsp"/>
<body>
    
<form id="form1" name="form1" method="post" action="">
  <table width="200" border="1">
    <tr>
      <td>Name</td>
      <td>House Name</td>
      <td>Place</td>
      <td>District</td>
      <td>Branch name </td>
      
      <td>&nbsp;</td>
    </tr>
      <%
           dbcon db=new dbcon();
      Connection con=db.getcon();
      Statement st=con.createStatement();
      ResultSet rs= st.executeQuery("SELECT `user_reg`.* FROM `user_reg` INNER JOIN `login` ON `login`.`id`=`user_reg`.`id` AND `login`.`type`='block' ");
      while(rs.next())
      {
      
      %>
    <tr>
      <td><%= rs.getString(2) %></td>
      <td><%= rs.getString(5) %></td>
      <td><%= rs.getString(6) %></td>
      <td><%= rs.getString(8) %></td>
      <td><%= rs.getString(9) %></td>
      
      <td><a href="?id=<%=rs.getString(1) %>">Unblock</a></td>
    </tr>
     <%
          }
     %>
  </table>
    </form>
    <%
     
if(request.getParameter("id")!=null)
{
    String id=request.getParameter("id");
    st.executeUpdate("Update login set type='user' where id='"+id+"'");
    response.sendRedirect("BlockList.jsp");
    
}

    %>


</body>
<jsp:include page="footer.jsp"/>
</html>
