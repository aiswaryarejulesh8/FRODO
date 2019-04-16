/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import database.Rsa;
import database.dbcon;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import org.json.simple.JSONObject;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "uploadServlet", urlPatterns = {"/uploadServlet"})
public class uploadServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          //   response.setContentType("text/html;charset=UTF-8");
            Map<String,String[]> feilds=request.getParameterMap();
            boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
            if (!isMultipartContent) {
                return;
            }
            String nam = "null", dob = "null", gender = "null",housenm="null",place="null",pin="null",district="null",branch="null",contact="null",email="null",password="null",pass="null",imei="null";
            String file="null";
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            try {
                List<FileItem> fields = upload.parseRequest(request);
                Iterator<FileItem> it = fields.iterator();

                while (it.hasNext()) 
                {
                    FileItem fileItem = it.next();
       
                    boolean isFormField = fileItem.isFormField();
                    if (isFormField) {
                        String name = fileItem.getFieldName();
                    InputStream stream = fileItem.getInputStream();
                    String str = Streams.asString(stream);
                    if(name.equals("namek")){
                        nam = str;
                    }
                    
                     else if(name.equals("dob")) {
                        dob = str;
                    }
                     else if(name.equals("gender")) {
                        gender= str;
                    }
                     else if(name.equals("housename")) {
                        housenm = str;
                    }
                    
                     
                     else if(name.equals("place")) {
                        place= str;
                    }
                       else if(name.equals("pin")) {
                        pin = str;
                    }
                     else if(name.equals("district")) {
                       district= str;
                    }
                     else if(name.equals("branch")) {
                       branch= str;
                    }
                  
                     else if(name.equals("contact")) {
                        contact = str;
                    }
                     else if(name.equals("email")) {
                        email= str;
                    }
                     else if(name.equals("password")) {
                        password= str;
                    }
                     else if(name.equals("pass")) {
                       pass= str;
                    }
                    else if(name.equals("imei")) {
                        imei= str;
                    }
                     
                   
                    } else {
                        String s = fileItem.getName().substring(fileItem.getName().lastIndexOf("\\") + 1);
                        file = fileItem.getName();
                        long size = fileItem.getSize();
                        System.out.println("yourfilenmae"+file);
                        System.out.println("yourfilenmae"+size);
                        fileItem.write(new File("D:\\FRODOPROJECT\\Frodo\\web\\photos\\"+file));
                        
                    }
                }
		} 
            catch (Exception e1) {
                    System.out.println("err111:"+e1);
			e1.printStackTrace();
		}
            JSONObject json = new JSONObject();
         try
         {
             dbcon db=new dbcon();
             Connection con=db.getcon();
             Statement st=con.createStatement();
             st.executeUpdate("insert into login values('"+nam+"','"+password+"','pending',0,0,null)",Statement.RETURN_GENERATED_KEYS);
            String lid="";
             ResultSet rs=st.getGeneratedKeys();
            if(rs.next())
            {
                lid=rs.getString(1);
            }
            st.executeUpdate("insert into user_reg values(null,'"+nam+"','"+dob+"','"+gender+"','"+housenm+"','"+place+"','"+pin+"','"+district+"','"+branch+"','"+contact+"','"+file+"','"+email+"','pending','"+lid+"')");
            st.executeUpdate("insert accdetails values(null,'" + lid + "','" + imei + "','" + password + "',1000, curdate())");
           json.put("result", "success");
            
        
         }
         catch(Exception e)
         {
             json.put("result", "error");
         }
             
           response.getWriter().write(json.toString());  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
