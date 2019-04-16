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
      <td>Branch</td>
      <td>CardNumber</td>
      <td>Key</td>
      <td>Amount</td>
      <td><a href="#"></a></td>
    </tr>
      <% 
      dbcon db=new dbcon();
      Connection con=db.getcon();
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("SELECT user_reg.name,user_reg.uid,user_reg.branch,accdetails.card_no,accdetails.key,digital_coin.id,digital_coin.amount FROM user_reg INNER JOIN accdetails ON user_reg.uid=accdetails.uid INNER JOIN digital_coin ON user_reg.uid=digital_coin.uid WHERE digital_coin.status='pending'");
      while(rs.next())
      {
      %>
    <tr>
      <td><%= rs.getString(1) %></td>
      <td><%= rs.getString(3) %></td>
      <td><%= rs.getString(4) %></td>
      <td><%= rs.getString(5) %></td>
      <td><%= rs.getString(7) %></td>
      <td><a href="generate.jsp?id=<%=rs.getString(6)%>&&amt=<%=rs.getString(7)%>&&uid=<%=rs.getString(2)%>">Generate</a></td>
    </tr>
    <%
      }
    %>
  </table>
    
</form>
<jsp:include page="footer.jsp"/>
</body>
</html>
