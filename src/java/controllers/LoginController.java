package controllers;

import com.bari.controller.*;
import controllers.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import beans.User;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginController extends HttpServlet 
{
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  
        {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            try 
            {
                User user = new User();

                user.setEmail(request.getParameter("user"));
                user.setPwd(request.getParameter("pwd"));

                if(User.LoginUser(request.getParameter("user"),request.getParameter("pwd")))
                {
                    User us = new User();
                    us.setEmail(String.valueOf(request.getParameter("user")));
                    us.GetUser();

                    HttpSession sessionUser = request.getSession();
                    sessionUser.setAttribute("userEmail",us.getEmail());
                    sessionUser.setAttribute("name",us.getFirst_name());
                     sessionUser.setAttribute("last",us.getLast_name());
                      sessionUser.setAttribute("psd",us.getPwd());
                    System.out.println(sessionUser.getAttribute("name"));
                     String em = us.getEmail();
                      if(em.equals("admin@gmail.com"))
                    {      
                        RequestDispatcher rd1 = request.getRequestDispatcher("admin.jsp");
                        rd1.forward(request,response);
                    }
                    else
                    {      
                        RequestDispatcher rd1 = request.getRequestDispatcher("index.jsp");
                        rd1.forward(request,response);
                    }

                   
                }  
                else
                {
                    out.println("Either username or password is incorrect!");
                    out.println("<a href=\"login_form.jsp\">Try again...</a>");
                }    
            } finally {out.close();}
        }
        
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
        {
            processRequest(request, response);
        }
        
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
        {
            processRequest(request, response);
        }
        
        @Override
        public String getServletInfo() 
        {
            return "Short description";
        }
}   