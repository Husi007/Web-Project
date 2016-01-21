package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- Website template by 1freewebsitetemplates.com -->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Fashion Blog</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\r\n");
      out.write("\t<!--[if IE 7]>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/ie7.css\" type=\"text/css\">\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<a href=\"url1?index\" id=\"logo\"><img src=\"images/logo.gif\" alt=\"logo\"/></a>\r\n");
      out.write("\t\t\t\t<div class=\"navigation\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"first\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"first\"><a href=\"url1?jewllery\">ON SALE</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("                                     \r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"url1?about\">ABOUT US</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"url1?shoes\">MY COLLECTION</a></li>\r\n");
      out.write("                                                <li><a href=\"url1?123\">CONTACT</a></li>\r\n");
      out.write("                                                ");

              
                                                    if (session.getAttribute("userEmail")!= null)
                                                         {
                                                
      out.write("\r\n");
      out.write("                                                <li> \r\n");
      out.write("                                                     <a href=\"user.jsp\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a> \r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li><a href=\"url1?logout\">LOGOUT</a></li>\r\n");
      out.write("                                                <li><a href=\"url1?blog\">THE BLOG</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                                                  ");
 }
                                                            else if (session.getAttribute("userEmail")== null)
                                                         {
                                                  
      out.write("\r\n");
      out.write("                                                \r\n");
      out.write("                                                             <li><a href=\"url1?login\">LOGIN</a></li>\r\n");
      out.write("                                                             \r\n");
      out.write("                                                             ");

                                                                 }
                                                             
      out.write("\r\n");
      out.write("                                                \r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("                                      \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<form action=\"\" class=\"search\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" value=\"search\" onblur=\"this.value=!this.value?'search':this.value;\" onfocus=\"this.select()\" onclick=\"this.value='';\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" id=\"submit\" value=\"\"/>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"navigation\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"selected\"><a href=\"url1?index\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"url1?newarrival\">New Arrival</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"url1?apparel\">Suiting</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"url1?shoes\">Shoes</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"url1?accessories\">Accessories</a></li>\r\n");
      out.write("                                        <li><a href=\"url1?jewllery\">Watches</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
