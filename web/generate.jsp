



<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.File"%>
<%@page import="database.AESencrp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="database.dbcon"%>
<%@page import="java.sql.Connection"%>
<%
  
      String coin="";
      dbcon db=new dbcon();
      Connection con=db.getcon();
      Statement st=con.createStatement();
      String a= request.getParameter("id");
      String b= request.getParameter("amt");
      String uid=request.getParameter("uid");
       float aaa=Float.parseFloat(b);
        
		byte[]aes=null;
		
        ResultSet rs2=st.executeQuery("select * from aes");
        if(rs2.next())
        {
            aes=rs2.getString(1).getBytes();
        }
        ResultSet rs=st.executeQuery("select balance from accdetails where uid='"+uid+"'");
         if(rs.next())
        {
           String amount =rs.getString(1);
           float amt=Float.parseFloat(amount);
           if(amt>aaa)
           {
           coin="Digital coin created with amount "+aaa;
            String p = "file//"+a+"_"+ aaa + ".txt";
                     AESencrp encrp=new AESencrp();
                    byte res[]=encrp.encrypt(p, aes).getBytes();
                    File f=new File("D:\\FRODOPROJECT\\Frodo\\web\\"+p);
                    if(!f.exists()){
                    f.createNewFile();
            }
            FileOutputStream fos=new FileOutputStream(f);
            fos.write(res);
            st.executeUpdate("update digital_coin set status='approved',file='" + p + "' where id=" + a);
             st.executeUpdate("update accdetails set balance=balance-"+aaa+" where uid=" + uid);
           }
           else
                {
                   st.executeUpdate("update digital_coin set status='reject' where id=" + a);
                }
            
            
            }
            else
            {
                st.executeUpdate("update digital_coin set status='reject' where id="+a);
            }
           response.sendRedirect("UserRequest.jsp");
        
                   
           
        
      
    
%>