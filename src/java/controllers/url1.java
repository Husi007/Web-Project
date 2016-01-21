package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bari.controller.*;
import controllers.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Farrukh Amiir
 */
public class url1 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            /* TODO output your page here. You may use following sample code. */
            if(request.getQueryString().equals("newarrival")){
             RequestDispatcher rd=request.getRequestDispatcher("new_arrival.jsp");  
            rd.forward(request, response);
            }
            if(request.getQueryString().equals("apparel")){
             RequestDispatcher rd=request.getRequestDispatcher("apparel.jsp");  
            rd.forward(request, response);
            }
            if(request.getQueryString().equals("shoes")){
             RequestDispatcher rd=request.getRequestDispatcher("shoes.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("home")){
             RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
            rd.forward(request, response);
            return;
            }
          
            if(request.getQueryString().equals("about")){
             RequestDispatcher rd=request.getRequestDispatcher("about.jsp");  
            rd.forward(request, response); }
             if(request.getQueryString().equals("accessories")){
             RequestDispatcher rd=request.getRequestDispatcher("accessories.jsp");  
            rd.forward(request, response);}
             if(request.getQueryString().equals("beauty")){
             RequestDispatcher rd=request.getRequestDispatcher("beauty_care.jsp");  
            rd.forward(request, response);}
             if(request.getQueryString().equals("blog")){
             RequestDispatcher rd=request.getRequestDispatcher("blog.jsp");  
            rd.forward(request, response);}
        if(request.getQueryString().equals("dashboard")){
             RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");  
            rd.forward(request, response);}
        if(request.getQueryString().equals("jewllery")){
             RequestDispatcher rd=request.getRequestDispatcher("jewelry.jsp");  
            rd.forward(request, response);} 
        
        if(request.getQueryString().equals("update1")){
             RequestDispatcher rd=request.getRequestDispatcher("update1.jsp");  
            rd.forward(request, response);
            }
        
        
        
         if(request.getQueryString().equals("123")){
             RequestDispatcher rd=request.getRequestDispatcher("123.jsp");  
            rd.forward(request, response);} 
         if(request.getQueryString().equals("logout")){
             RequestDispatcher rd=request.getRequestDispatcher("logout.jsp");  
            rd.forward(request, response);} 
        
        if(request.getQueryString().equals("login")){
             RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
            rd.forward(request, response);}
         if(request.getQueryString().equals("logout")){
             RequestDispatcher rd=request.getRequestDispatcher("logut.jsp");  
            rd.forward(request, response);}
          if(request.getQueryString().equals("news")){
             RequestDispatcher rd=request.getRequestDispatcher("news.jsp");  
            rd.forward(request, response);}
           if(request.getQueryString().equals("signup")){
             RequestDispatcher rd=request.getRequestDispatcher("signup.jsp");  
            rd.forward(request, response);}
            if(request.getQueryString().equals("OverCoats")){
             RequestDispatcher rd=request.getRequestDispatcher("over-Man.jsp");  
            rd.forward(request, response);}
             if(request.getQueryString().equals("Shoes")){
             RequestDispatcher rd=request.getRequestDispatcher("shoes-Man.jsp");  
            rd.forward(request, response);}
              if(request.getQueryString().equals("Shirts")){
             RequestDispatcher rd=request.getRequestDispatcher("sweat-shirts-Man.jsp");  
            rd.forward(request, response);}
               if(request.getQueryString().equals("Trousers")){
             RequestDispatcher rd=request.getRequestDispatcher("trouser-Man.jsp");  
            rd.forward(request, response);}
                if(request.getQueryString().equals("blue")){
             RequestDispatcher rd=request.getRequestDispatcher("blue.jsp");  
            rd.forward(request, response);}
                 if(request.getQueryString().equals("WaterSuits")){
             RequestDispatcher rd=request.getRequestDispatcher("watersuits-Man.jsp");  
            rd.forward(request, response);}
                 
                  if(request.getQueryString().equals("suits")){
             RequestDispatcher rd=request.getRequestDispatcher("suits-Woman.jsp");  
            rd.forward(request, response);}
         if(request.getQueryString().equals("jackets")){
             RequestDispatcher rd=request.getRequestDispatcher("jackets-Woman.jsp");  
            rd.forward(request, response);}
          if(request.getQueryString().equals("jeans")){
             RequestDispatcher rd=request.getRequestDispatcher("jeans-Woman.jsp");  
            rd.forward(request, response);}
           if(request.getQueryString().equals("knits")){
             RequestDispatcher rd=request.getRequestDispatcher("knits-Woman.jsp");  
            rd.forward(request, response);}
            if(request.getQueryString().equals("overcoats")){
             RequestDispatcher rd=request.getRequestDispatcher("over-Woman.jsp");  
            rd.forward(request, response);}
             if(request.getQueryString().equals("shoes")){
             RequestDispatcher rd=request.getRequestDispatcher("shoes-Woman.jsp");  
            rd.forward(request, response);}
              if(request.getQueryString().equals("")){
             RequestDispatcher rd=request.getRequestDispatcher("shirts-Woman.jsp");  
            rd.forward(request, response);}
               if(request.getQueryString().equals("apparel")){
             RequestDispatcher rd=request.getRequestDispatcher("trousers-Woman.jsp");  
            rd.forward(request, response);}
                if(request.getQueryString().equals("accessories")){
             RequestDispatcher rd=request.getRequestDispatcher("tops-Woman.jsp");  
            rd.forward(request, response);}
                 if(request.getQueryString().equals("about")){
             RequestDispatcher rd=request.getRequestDispatcher("water-suits-Woman.jsp");  
            rd.forward(request, response);}
        
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
    }
}


             
             
