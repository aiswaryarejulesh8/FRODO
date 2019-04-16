<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="database.dbcon"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Login</title>
</head>
<body>
    <jsp:include page="loginhdr.jsp"/>
<form id="form1" name="form1" method="post" action="">
  <table width="200" border="1">
    <tr>
      <td>Username: </td>
      <td><label>
        <input type="text" name="textfield" required/>
      </label></td>
    </tr>
    <tr>
      <td>Password:</td>
      <td><label>
      <input type="password" name="textfield2" required />
      </label></td>
    </tr>
    <tr>
      <td colspan="2"><label>
      <div align="center">
        <input type="submit" name="Submit" value="Login" />
      </div>
      </label></td>
    </tr>
  </table>
  <%
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
              %>
              <script>
                  alert("invalid user");
              </script>
              <%
          }
      }
  %>
</form>
 <jsp:include page="loginftr.jsp"/>
</body>
</html>

