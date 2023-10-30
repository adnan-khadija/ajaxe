package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/template/header.jsp");
    _jspx_dependants.add("/template/menu.jsp");
  }

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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Page d'Accueil</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-image: url('images/img.jpg');\n");
      out.write("            background-attachment: fixed;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header {\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.5);\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        ul {\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.5);\n");
      out.write("            padding: 0px;\n");
      out.write("            list-style-type: none; /* Supprimer les puces de liste */\n");
      out.write("           display: flex; /* Afficher les éléments de la liste horizontalement */\n");
      out.write("         justify-content: center; /* Centrer les éléments horizontalement */\n");
      out.write("         align-items: center; /* Centrer les éléments verticalement */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        li a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #fff;\n");
      out.write("            margin: 15px;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 200px;\n");
      out.write("            color: dimgrey;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("     ");
      out.write("\n");
      out.write("<div class=\"header\" style=\"height:110px;width: 100%;\">\n");
      out.write("    <img id=\"logo\" src=\"images/Logo_Ensaj.png\" alt=\"logo\" style=\"width:100px;height:100px;\"/>     \n");
      out.write("    <span id=\"horloge\" style=\"font-family: Courier New; left: 0; width:100%;background-color: #fff;font-size: 24px;\"></span>\n");
      out.write("</div>\n");
      out.write("<script src=\"script/horloge.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("    <li><a class=\"active\" href=\"home.jsp\">Home</a></li>\n");
      out.write("    <li><a href=\"etudiantForm.jsp\">Gestion des etudiants</a></li>\n");
      out.write("    <li><a href=\"marqueForm.jsp\">Gestion des marques</a></li>\n");
      out.write("    <li><a href=\"machineForm.jsp\">Gestion des machines</a></li>\n");
      out.write("    <li><a href=\"machineByMarqueForm.jsp\">Machines par marque</a></li>\n");
      out.write("\n");
      out.write("</ul>");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"content\">\n");
      out.write("         <h1>Bienvenue sur Mon Site Web</h1>\n");
      out.write("        <p>Votre source d'informations préférée</p> </div>\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
