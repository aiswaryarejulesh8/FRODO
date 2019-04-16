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
      <td>Account No: </td>
      <td><label>
        <input type="text" name="textfield" required pattern="[0-9]{2,20}" />
      </label></td>
    </tr>
    <tr>
      <td>Name:</td>
      <td><label>
        <input type="text" name="textfield2" required pattern="[A-Z a-z]{3,25}" />
      </label></td>
    </tr>
    <tr>
      <td>Branch:</td>
      <td><label>
        <input type="text" name="textfield3" required pattern="[A-Z a-z]{3,25}" />
      </label></td>
    </tr>
  
    <tr>
      <td>Amount:</td>
      <td><label>
        <input type="text" name="textfield5"required pattern="[0-9]{2,10}" />
      </label></td>
    </tr>
    <tr>
      <td><label>
        <input type="submit" name="Submit" value="Withdrawal" />
      </label></td>
      <td><label>
        <input type="submit" name="Submit2" value="Cancel" />
      </label></td>
    </tr>
  </table>
    <%
        dbcon db=new dbcon();
      Connection con=db.getcon();
      Statement st=con.createStatement();
      Statement s= con.createStatement();
      if(request.getParameter("Submit")!=null)
      {
          String num= request.getParameter("textfield");
          String name= request.getParameter("textfield2");
          String brh= request.getParameter("textfield3");
        
          String amt= request.getParameter("textfield5");
          int cbal=Integer.parseInt(amt);
          ResultSet rs=st.executeQuery("SELECT accdetails.balance FROM `user_reg` INNER JOIN `accdetails` ON `accdetails`.`uid`=`user_reg`.`id` AND `accdetails`.`card_no`='"+num+"' AND `user_reg`.`branch`='"+brh+"' AND user_reg.name='"+name+"'");
          if(rs.next())
          {
              int obalance=rs.getInt(1);
              if(obalance>cbal)
              {
              s.executeUpdate("Insert into transaction values (null,'"+num+"','"+amt+"',curdate(),'withdrwal')");
              s.executeUpdate("UPDATE `accdetails` SET `balance`=`balance`-'"+cbal+"' WHERE `accdetails`.`card_no`='"+num+"' ");
              response.sendRedirect("Home.jsp");
              }
              else
              {
                  %>
                  
                   <script>
                  alert("Insufficient amount!")
              </script>
                   <%
              }
          }
          
          else
          {
              %>
              
               <script>
                  alert("No value!")
              </script>
               <%
          }
      }
          if(request.getParameter("Submit2")!=null)
      {
          response.sendRedirect("Home.jsp");
      }
          
      
    %>
</form>
<jsp:include page="footer.jsp"/>
</body>
</html>
