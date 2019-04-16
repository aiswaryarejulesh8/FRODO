/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import database.dbcon;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;

/**
 *
 * @author user
 */
@WebServlet(name = "Viewactdet", urlPatterns = {"/Viewactdet"})
public class Viewactdet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Viewactdet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Viewactdet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        JSONObject jo= new JSONObject();
        try
        {
             dbcon db=new dbcon();
             Connection con=db.getcon();
             Statement st=con.createStatement(); 
             String uid=request.getParameter("uid");
             ResultSet rs=st.executeQuery("SELECT `user_reg`.`name`,`user_reg`.`branch` ,`accdetails`.`card_no`,`accdetails`.`key`,`accdetails`.`balance` FROM `user_reg` INNER JOIN `accdetails` ON `user_reg`.`uid`=`accdetails`.`uid` WHERE `accdetails`.`uid`='"+uid+"'");
             if(rs.next())
             {  
                 jo.put("name", rs.getString("name"));
                 jo.put("brh", rs.getString("branch"));
                 jo.put("cardno", rs.getString("card_no"));
                 jo.put("key", rs.getString("key"));
                 jo.put("bal", rs.getString("balance"));
             }
             
        }
        catch(Exception e)
        {
            jo.put("name","error" );
        }
      response.getWriter().write(jo.toString());
           
       // processRequest(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
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
