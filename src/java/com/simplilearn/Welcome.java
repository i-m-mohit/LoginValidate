package com.simplilearn;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author mht19
 */
public class Welcome extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Map<String ,String> map1 = new HashMap<>();
            
            Map<String ,String> map2 = new HashMap<>();
            
            map1.put("admin@gmail.com", "admin");
            map1.put("mohit@gmail.com", "12345");
            map1.put("su@gmail.com", "superuser");
            
            String email = request.getParameter("email_id");
            String password = request.getParameter("pass");
             
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Dashboard</title>");            
            out.println("</head>");
            out.println("<body>");
            
            if(map1.containsKey(email)){
                
                if(map1.get(email).matches(password)){
                   out.println("<h3 style='color:green;'>Logged in Successfully!!<h2>");
                   out.println("<h2 style='color:blue;'>Hey!! "+email+" Welcome to the Dashboard.<h2>");
                   

                   out.println("<a href='Login.jsp'><h4 style='color:red;' align='right'>Log out</h4></a>");
                }
                else {
                   
                   out.println("<h2 style='color:red;'>invalid password</h2>");
                   out.println("<a href='Login.jsp'>Login again</a>");
                }
            }   
            else {
                    out.println("<h2 style='color:red;'>invalid username and password</h2>");
                    out.println("<a href='Login.jsp'>Login again</a>");
            }

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
        processRequest(request, response);
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
