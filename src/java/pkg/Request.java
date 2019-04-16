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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "Request", urlPatterns = {"/Request"})
public class Request extends HttpServlet {

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
            out.println("<title>Servlet Request</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Request at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
         JSONObject json = new JSONObject();
         try
         {
             dbcon db=new dbcon();
             Connection con=db.getcon();
             Statement st=con.createStatement(); 
             Statement st1=con.createStatement(); 
             String uid=request.getParameter("uid");
             String name=request.getParameter("name");
             String brh=request.getParameter("branch");
             String cardno=request.getParameter("cardno");
        
             String key=request.getParameter("key");
             String amt=request.getParameter("amount");
             String imei=request.getParameter("imei");
             
              String s= "SELECT  user_reg.uid,accdetails.balance FROM  accdetails INNER JOIN  user_reg ON accdetails.uid = user_reg.uid WHERE        (user_reg.uid = '" + uid + "') AND (user_reg.name = '" + name + "') AND (user_reg.branch = '" + brh + "') AND (accdetails.card_no = '" + cardno + "') AND (accdetails.key = '" + key + "')";
                 ResultSet rs=st.executeQuery(s);
                 if(rs.next())
                 {
                     if (Integer.parseInt(rs.getString(2)) >= Integer.parseInt(amt))
                     {
                         st1.executeUpdate("insert into digital_coin values(null,'"+uid+"','"+amt+"','null',curdate(),'pending')");
                         json.put("result", "ok");
                     }
                     else
                     {
                         json.put("result", "Insufficient balance");
                     }
                 }
         
    }  
         catch (SQLException ex)
        {
           json.put("result", "error"); 
        }
         response.getWriter().write(json.toString());
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
