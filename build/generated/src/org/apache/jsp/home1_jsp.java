package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\"/>\n");
      out.write("    <link href=\"style/css1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("    <title>Home</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <style>.main{\n");
      out.write("    width: 100%;\n");
      out.write("    min-height: 100vh;\n");
      out.write("    display: flex;\n");
      out.write("    align-items:center;\n");
      out.write("    background: url(images/pc.jpg) no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("    background-position: center;\n");
      out.write("    background-attachment: fixed;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <header>\n");
      out.write("         <img id=\"logo\" src=\"images/Logo_Ensaj.png\" alt=\"logo\" style=\"width:100px;height:80px;\"/> \n");
      out.write("        <nav class=\"navigation\">\n");
      out.write("            <a  href=\"home1.jsp\">Home <i class=\"fa-solid fa-house\"></i></a>\n");
      out.write("            <a  href=\"\">Contacts <i class=\"fa-solid fa-phone\"></i></a>\n");
      out.write("            <a  href=\"login.jsp\">Login <i class=\"fa-solid fa-user\"></i></a>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <section class=\"main\"> \n");
      out.write("        <div>\n");
      out.write("            <h1>Bienvenue sur notre plateforme dédiée aux machines étudiantes!</h1>\n");
      out.write("            <h2>Découvrez les marques de machines préférées des étudiants </h2>\n");
      out.write("            <a href=\"#\" class=\"button\">Explorez</a>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</body>\n");
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
